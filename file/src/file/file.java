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
			System.out.println("�ļ���ɾ��");
		}else {
			System.out.println("�ļ�δ��ɾ��");
		}
		System.out.println("---------------");
		/******�鿴�ļ����µ��ļ�*****/
		File f3=new File("G:\\javaproject\\file");
		File[] names=f3.listFiles();
		System.out.println(Arrays.toString(names));
		String[] str=f3.list();
		System.out.println(Arrays.toString(names));
	/*�ļ��е�������*/
		File f4=new File("G:\\javaproject\\sun\\f");
		System.out.println(f4.exists());
		if(!f4.exists()){
			System.out.println("�ļ�������");
			f4.mkdir();
			System.out.println("�����ɹ�");
		}else {
			System.out.println("�ļ�����");
		}
		f4.renameTo(new File("G:\\javaproject\\sun\\file"));
	}
}
