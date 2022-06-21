package com.github.druiddesk.toolwindow;

import com.github.druiddesk.util.DataConstants;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.openapi.wm.ToolWindowType;
import com.intellij.ui.content.Content;
import org.jetbrains.annotations.NotNull;

public class DruidDeskToolWindowFactory implements ToolWindowFactory {

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        final Content toolContent =
                toolWindow.getContentManager().getFactory()
                        .createContent(new DruidDeskToolWindow(toolWindow, project),
                                DataConstants.PLUGIN_TOOL_WINDOW_NAME, false);

        toolWindow.getContentManager().addContent(toolContent);
        toolWindow.setTitle(DataConstants.PLUGIN_TOOL_WINDOW_NAME);
        toolWindow.setType(ToolWindowType.DOCKED, null);
    }
}
