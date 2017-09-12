package file;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;

public class file {
	public static void main(String[] args) {
		File f2=new File("G:\\javaproject\\sun\\file");
		boolean a=f2.delete();
		System.out.println(a);
		if(a) {
			System.out.println("文件被删除");
		}else {
			System.out.println("文件未被删除");
		}
		System.out.println("---------------");
		/******查看文件夹下的文件*****/
		File f3=new File("G:\\javaproject\\file");
		File[] names=f3.listFiles();
		System.out.println(Arrays.toString(names));
		String[] str=f3.list();
		System.out.println(Arrays.toString(names));
	/*文件夹的重命名*/
		File f4=new File("G:\\javaproject\\sun\\f");
		System.out.println(f4.exists());
		if(!f4.exists()){
			System.out.println("文件不存在");
			f4.mkdir();
			System.out.println("创建成功");
		}else {
			System.out.println("文件存在");
		}
		f4.renameTo(new File("G:\\javaproject\\sun\\file"));
	}
}
