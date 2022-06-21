package com.github.druiddesk.toolwindow;


import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import lombok.extern.log4j.Log4j;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;

@Log4j
public class DruidDeskToolWindow extends JPanel {

    private final ToolWindow toolWindow;
    private final Project project;

    public DruidDeskToolWindow(final ToolWindow toolWindow,
                               final Project project) {
        super(new BorderLayout());
        this.toolWindow = toolWindow;
        this.project = project;
        JLabel textLbl = new JLabel("This is a text label.");
        JButton b = new JButton("click");
//        add(b, BorderLayout.CENTER);
        this.add(b);
        this.add(textLbl);
    }
}
