package zwz.utils;

import cn.hutool.crypto.digest.DigestUtil;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;



public class MD5Util {
	public static final String KEY="KEY";
	public static void main(String[] args) {
		String password = "123456";
		String md5Pwd = encrypByMd5(password + KEY);
		System.out.println(md5Pwd);

		String password1 = "1234567";
		String inputMd5Pwd1= encrypByMd5(password1+ KEY);
		if (Objects.equals(md5Pwd, inputMd5Pwd1)){
			System. out.println(password1 + "(4iE%");
		} else {
			System.out.println(password1+"密码错误");}

					String password2 = "123456";
			String inputMd5Pwd2 =encrypByMd5(password2+KEY);
			if (Objects.equals(md5Pwd, inputMd5Pwd2)){
				System. out.println(password2 + "6150");
			} else {
				System.out.println(password2+"密码错误");

			}
	}


	public static String encrypByMd5(String context) {

		try {

			// 获取一个MD5消息摘要实例

			MessageDigest md = MessageDigest.getInstance("MD5");        // 更新消息摘要，将输入的文本内容转换为字节数组并进行处理

			md.update(context.getBytes());        // 计算消息摘要，得到MD5散列值

			byte[] encryContext = md.digest();        int i;

			StringBuffer buf = new StringBuffer("");

			for (int offset = 0; offset < encryContext.length; offset++) {

				// 将字节值转换为无符号整数

				i = encryContext[offset];

				if (i < 0) i += 256;  // 处理负值

				if (i < 16) buf.append("0");  // 补充前导0，以保证每个字节都被表示为两位十六进制数

				buf.append(Integer.toHexString(i));  // 将字节值转换为十六进制字符串并追加到结果字符串

			}        // 返回MD5散列值的十六进制表示

			return buf.toString();

		} catch (NoSuchAlgorithmException e) {

			// 处理NoSuchAlgorithmException异常，通常是因为指定的MD5算法不可用

			e.printStackTrace();

			return  null;

		}

	}
}



