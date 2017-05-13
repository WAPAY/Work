package task;

import java.io.File;

public class DeleteTxt {
	public static void delete(String path) throws Exception {
		File file = new File(path);
		if (file.exists()) {
			File[] files = file.listFiles();
			if (files.length == 0) {
				System.out.println("文件夹是空的!");
				return;
			} else {
				for (File file2 : files) {
					if (file2.isDirectory()) {
						delete(file2.getAbsolutePath());
					} else {
						if (!file2.isHidden() && !file2.getName().equals("result.txt")) {
							System.out.println(file2.getAbsolutePath());
							
						}

					}
				}
			}
		} else {
			System.out.println("文件不存在!");
		}
	}

	public static void main(String[] args) throws Exception {
		
		delete("/Users/fengyi/Desktop/案由法条统计");
	}
}
