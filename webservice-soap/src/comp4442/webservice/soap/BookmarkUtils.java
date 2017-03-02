package comp4442.webservice.soap;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.google.gson.Gson;

public class BookmarkUtils {

	public static boolean save(BookmarkCollection c, String filename) throws Exception {

		Gson gson = new Gson();

		FileWriter fw = new FileWriter(filename);

		gson.toJson(c, fw);

		fw.close();

		return true;

	}

	public static boolean save(BookmarkCollection c) throws Exception {
		return BookmarkUtils.save(c, "bookmarks.json");
	}

	public static BookmarkCollection load(String filename) throws Exception {

		File f = new File(filename);
		if (!f.exists()) {
			return new BookmarkCollection();
		}

		Gson gson = new Gson();
		FileReader fr = new FileReader(filename);

		return gson.fromJson(fr, BookmarkCollection.class);

	}

	public static BookmarkCollection load() throws Exception {

		return load("bookmarks.json");

	}

}
