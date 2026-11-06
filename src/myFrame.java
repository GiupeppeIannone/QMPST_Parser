import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import TypeChecker.TypeChecker;
import GlobalType.*;
import ProgramType.ProgramType;

import javax.swing.*;

public class myFrame extends JFrame implements ActionListener {

    JMenuBar menubar;
    JMenu fileMenu;
    JMenu helpMenu;
    JMenuItem saveItem, loadGlobalItem, loadSystemItem;
    JPanel inputHelperPanel, inputPanel, inputSubPanel1, inputSubPanel2, outputPanel;
    JButton recButton, sndButton, rcvButton, pauliButton;
    JTextField globalTypeField, systemsField;
    JLabel outputLabel;

    JButton debugGlobalButton, debugSystemButton, calculationButton;

    public myFrame() {

        // Menubar Inizialization
        menubar = new JMenuBar();
        fileMenu = new JMenu("File");
        helpMenu = new JMenu("Help");
        menubar.add(fileMenu);
        menubar.add(helpMenu);
        saveItem = new JMenuItem("Save");
        loadGlobalItem = new JMenuItem("Load GlobalType");
        loadSystemItem = new JMenuItem("Load System");
        loadGlobalItem.addActionListener(this);
        loadSystemItem.addActionListener(this);
        fileMenu.add(saveItem);
        fileMenu.add(loadGlobalItem);
        fileMenu.add(loadSystemItem);

        inputHelperPanel = new JPanel();
        inputHelperPanel.setLayout(new GridLayout(1, 4));
        recButton = new JButton("μ");
        sndButton = new JButton("⊕");
        rcvButton = new JButton("&");
        pauliButton = new JButton("σ");
        recButton.addActionListener(this);
        sndButton.addActionListener(this);
        rcvButton.addActionListener(this);
        pauliButton.addActionListener(this);
        inputHelperPanel.add(recButton);
        inputHelperPanel.add(sndButton);
        inputHelperPanel.add(rcvButton);
        inputHelperPanel.add(pauliButton);

        inputPanel = new JPanel();
        inputSubPanel1 = new JPanel();
        inputSubPanel2 = new JPanel();
        inputPanel.add(inputSubPanel1);
        inputPanel.add(inputSubPanel2);
        inputPanel.setLayout(new GridLayout(2, 1));
        // inputSubPanel1.setLayout(new GridLayout(2, 1));
        // inputSubPanel2.setLayout(new GridLayout(2, 1));
        JTextArea title1 = new JTextArea();
        JTextArea title2 = new JTextArea();
        title1.setEditable(false);
        title2.setEditable(false);
        title1.setFocusable(false);
        title2.setFocusable(false);
        title1.setText("Inserisci il Tipo Globale:");
        title2.setText("Inserisci il Sistema Multiparte:");
        globalTypeField = new JTextField();
        systemsField = new JTextField();
        globalTypeField.setPreferredSize(new Dimension(350, 100));
        systemsField.setPreferredSize(new Dimension(350, 100));
        inputSubPanel1.add(title1);
        inputSubPanel1.add(globalTypeField);
        inputSubPanel2.add(title2);
        inputSubPanel2.add(systemsField);

        outputPanel = new JPanel();
        outputPanel.setLayout(new FlowLayout());
        outputLabel = new JLabel("OUTPUT");
        outputLabel.setPreferredSize(new Dimension(200, 200));
        calculationButton = new JButton("CHECK");
        debugGlobalButton = new JButton("GLOBAL");
        debugSystemButton = new JButton("SYSTEM");
        calculationButton.addActionListener(this);
        debugGlobalButton.addActionListener(this);
        debugSystemButton.addActionListener(this);
        outputPanel.add(calculationButton);
        outputPanel.add(debugGlobalButton);
        outputPanel.add(debugSystemButton);
        outputPanel.add(outputLabel);
        outputPanel.setBackground(new Color(160, 160, 160));
        outputPanel.setPreferredSize(new Dimension(200, 200));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 400);
        this.setLayout(new BorderLayout());
        this.setJMenuBar(menubar);
        this.add(inputPanel, BorderLayout.CENTER);
        this.add(inputHelperPanel, BorderLayout.SOUTH);
        this.add(outputPanel, BorderLayout.EAST);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sndButton) {
            this.systemsField.setText(this.systemsField.getText() + "⊕");
        }
        else if (e.getSource() == rcvButton) {
            this.systemsField.setText(this.systemsField.getText() + "&");
        }
        else if (e.getSource() == pauliButton) {
            this.systemsField.setText(this.systemsField.getText() + "σ");
        }
        else if (e.getSource() == recButton) {
            this.globalTypeField.setText(this.globalTypeField.getText() + "μ");
        }
        else if (e.getSource() == loadGlobalItem) {
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showOpenDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                try (BufferedReader buf = new BufferedReader(
                        new FileReader(fileChooser.getSelectedFile().getAbsolutePath()))) {
                    String line;
                    this.globalTypeField.setText("");
                    while ((line = buf.readLine()) != null) {
                        this.globalTypeField.setText(this.globalTypeField.getText() + line);
                    }
                } catch (FileNotFoundException exc) {
                    System.err.println("File Not Found!");
                } catch (IOException exc) {
                    System.err.println("Something Went Wrong!");
                }
            }
        }
        else if (e.getSource() == loadSystemItem) {
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showOpenDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                try (BufferedReader buf = new BufferedReader(
                        new FileReader(fileChooser.getSelectedFile().getAbsolutePath()))) {
                    String line;
                    this.systemsField.setText("");
                    while ((line = buf.readLine()) != null) {
                        this.systemsField.setText(this.systemsField.getText() + line);
                    }
                } catch (FileNotFoundException exc) {
                    System.err.println("File Not Found!");
                } catch (IOException exc) {
                    System.err.println("Something Went Wrong!");
                }
            }
        }
        else if (e.getSource() == debugGlobalButton) {
            GlobalParser globalParser = getGlobalParser(globalTypeField.getText());
            ParseTree antlrGlobalTree = globalParser.prog();
            ParseTreeToAST globalVisitor = new ParseTreeToAST();
            GlobalType global = globalVisitor.visit(antlrGlobalTree);
            System.out.print(global.toString() + "\n");
        }
        else if (e.getSource() == debugSystemButton) {
            ProgramParser programParser = getProgramParser(systemsField.getText());
            ParseTree antlrProgramTree = programParser.prog();
            SystemToAST programVisitor = new SystemToAST();
            Map<String, ProgramType> systemsMap = programVisitor.visit(antlrProgramTree);
            for (String keyString : systemsMap.keySet()) {
                System.out.print("Participant: " + keyString + " -> " + systemsMap.get(keyString).toString() + "; \n\n");
            }
        }
        else if (e.getSource() == calculationButton) {
            GlobalParser globalParser = getGlobalParser(globalTypeField.getText());
            ParseTree antlrGlobalTree = globalParser.prog();
            ParseTreeToAST globalVisitor = new ParseTreeToAST();
            GlobalType global = globalVisitor.visit(antlrGlobalTree);
            ProgramParser programParser = getProgramParser(systemsField.getText());
            ParseTree antlrProgramTree = programParser.prog();
            SystemToAST programVisitor = new SystemToAST();
            Map<String, ProgramType> systemsMap = programVisitor.visit(antlrProgramTree);
            TypeChecker typeChecker = new TypeChecker(global, systemsMap);
            if (typeChecker.check()) {
                System.out.println("tipo verificato");
                outputLabel.setText("il tipaggio è corretto");
            } else {
                System.out.println("ERRORE");
                outputLabel.setText("il tipaggio è ERRATO");
            }
        }
        else throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    private static GlobalParser getGlobalParser(String input) {
        GlobalParser parser = null;
        try {
            CharStream inputStream = CharStreams.fromString(input);
            GlobalLexer lexer = new GlobalLexer(inputStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new GlobalParser(tokens);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return parser;
    }

    private static ProgramParser getProgramParser(String input) {
        ProgramParser parser = null;
        try {
            CharStream inputStream = CharStreams.fromString(input);
            ProgramLexer lexer = new ProgramLexer(inputStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new ProgramParser(tokens);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return parser;
    }

}
