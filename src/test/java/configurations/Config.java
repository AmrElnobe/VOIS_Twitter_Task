package configurations;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import twitterTest.Vodafone_TwitterTask;

public class Config {

	static Properties prop = new Properties();
	private static String Directory = System.getProperty("user.dir");

	public static void Read_Username(){
		InputStream input;
		try {
			input = new FileInputStream(Directory + "\\src\\test\\java\\configurations\\Config.properties");
			prop.load(input);
			Vodafone_TwitterTask.username = prop.getProperty("Username");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void Read_Password(){
		InputStream input;
		try {
			input = new FileInputStream(Directory + "\\src\\test\\java\\configurations\\Config.properties");
			prop.load(input);
			Vodafone_TwitterTask.password = prop.getProperty("Password");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Read_TweetLessThan280Character(){
		InputStream input;
		try {
			input = new FileInputStream(Directory + "\\src\\test\\java\\configurations\\Config.properties");
			prop.load(input);
			Vodafone_TwitterTask.TweetLessThan280Character = prop.getProperty("TweetLessThan280Character");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Read_TweetMoreThan280Character(){
		InputStream input;
		try {
			input = new FileInputStream(Directory + "\\src\\test\\java\\configurations\\Config.properties");
			prop.load(input);
			Vodafone_TwitterTask.TweetMoreThan280Character = prop.getProperty("TweetMoreThan280Character");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Read_PollQuestion(){
		InputStream input;
		try {
			input = new FileInputStream(Directory + "\\src\\test\\java\\configurations\\Config.properties");
			prop.load(input);
			Vodafone_TwitterTask.PollQuestion = prop.getProperty("PollQuestion");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Read_PollChoice1(){
		InputStream input;
		try {
			input = new FileInputStream(Directory + "\\src\\test\\java\\configurations\\Config.properties");
			prop.load(input);
			Vodafone_TwitterTask.PollChoice1 = prop.getProperty("PollChoice1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Read_PollChoice2(){
		InputStream input;
		try {
			input = new FileInputStream(Directory + "\\src\\test\\java\\configurations\\Config.properties");
			prop.load(input);
			Vodafone_TwitterTask.PollChoice2 = prop.getProperty("PollChoice2");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Read_ConsecutiveIdenticalTweet(){
		InputStream input;
		try {
			input = new FileInputStream(Directory + "\\src\\test\\java\\configurations\\Config.properties");
			prop.load(input);
			Vodafone_TwitterTask.ConsecutiveIdenticalTweet = prop.getProperty("ConsecutiveIdenticalTweet");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Read_GIFText(){
		InputStream input;
		try {
			input = new FileInputStream(Directory + "\\src\\test\\java\\configurations\\Config.properties");
			prop.load(input);
			Vodafone_TwitterTask.GIFText = prop.getProperty("GIFText");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	}
	

	

