import java.io.File;

import org.wikipathways.client.WikiPathwaysCache;

public class Main {

	public static void main(String[] args) throws Exception {
		WikiPathwaysCache cache = new WikiPathwaysCache(new File("cache"));
		cache.update();
	}

}
