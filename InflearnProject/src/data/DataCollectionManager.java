package data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import javax.sound.sampled.AudioFormat.Encoding;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class DataCollectionManager {
	static String inflearnURL = "https://www.inflearn.com/";
	static String[] categoryURL = { 
			"courses/it-programming/web-dev",
			"courses/it-programming/back-end",
			"courses/it-programming/full-stack",
			"courses/it-programming/mobile-app",
			"courses/it-programming/programming-lang?order=seq",
			"courses/it-programming/algorithm?order=seq"
	};

	public static List<LectureVO> collectData() throws IOException {
		List<LectureVO> list = new ArrayList<LectureVO>();
		
		int id = 1;
		for (int i = 0; i < categoryURL.length; i++) {
			Document doc = Jsoup.connect(inflearnURL + categoryURL[i]).get();
			Elements title = doc.select("div.card-content div.course_title");
			Elements content = doc.select("div.course_card_back p.course_description");
			Elements level = doc.select("div.back_course_metas div.course_level span");
			Elements price = doc.select("div.price");
			Elements instructor = doc.select("div.instructor");
			Elements poster = doc.select("div.card-image img");
			Elements courseURL = doc.select("a.course_card_front");
			for (int j = 0; j < title.size(); j++) {
				LectureVO vo = new LectureVO();
				vo.setId(id++);
				vo.setCno(i + 1);
				vo.setTitle(title.get(j).text());
				vo.setContent(content.get(j).text());
				vo.setLevel(level.get(j).text());
				String p = price.get(j).text();
				String pArr[] = p.split(" ");
				vo.setPrice(pArr[pArr.length - 1]);
				vo.setInstructor(instructor.get(j).text());
				vo.setPoster(poster.get(j).attr("src"));
//				String url = courseURL.get(j).attr("abs:href");
//				System.out.println(url);
//				Document inner = Jsoup.connect(url).get();
//				System.out.println(inner);
				list.add(vo);
			}
		}

		return list;
	}

	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("C:\\java_datas\\datas.ser"));
			oos.writeObject(collectData());

			ois = new ObjectInputStream(new FileInputStream("C:\\java_datas\\datas.ser"));
			List<LectureVO> readObject = (List<LectureVO>) ois.readObject();
			
			for (LectureVO vo : readObject) {
				System.out.println(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				ois.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
