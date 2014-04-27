package xfiles.business;

import java.util.List;
import org.springframework.security.access.annotation.Secured;
import xfiles.model.File;

public interface FileManagerService {
	@Secured("ROLE_SPECIAL_AGENT, ROLE_ASSISTANT_DIRECTOR")
	void classify(File file);
	
	@Secured("ROLE_SPECIAL_AGENT, ROLE_ASSISTANT_DIRECTOR")
	void declassify(File file);

	List<File> showAll();

	File show(Long id);
}
