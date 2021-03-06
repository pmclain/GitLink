package uk.co.ben_gibson.git.link.UI.Action.VcsLog;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import uk.co.ben_gibson.git.link.Git.Commit;
import uk.co.ben_gibson.git.link.Git.RemoteHost;
import uk.co.ben_gibson.git.link.GitLink;

public class BrowserVcsAction extends VcsLogAction {

    @Override
    protected void perform(@NotNull final Project project, @NotNull final Commit commit, @NotNull final VirtualFile file) {
        GitLink.getInstance(project).openCommit(commit, file);
    }

    @Override
    protected String displayName(@NotNull final RemoteHost remoteHost)
    {
        return String.format("Open in %s", remoteHost.toString());
    }
}
