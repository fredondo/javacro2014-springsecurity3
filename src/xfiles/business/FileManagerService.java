package xfiles.business;

import java.util.List;

import xfiles.model.File;

public interface FileManagerService {

	void classify(File file);

	void declassify(File file);

	List<File> showAll();

	File show(Long id);
}
