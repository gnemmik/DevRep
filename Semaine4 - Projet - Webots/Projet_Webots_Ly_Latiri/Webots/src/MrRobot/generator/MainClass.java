package MrRobot.generator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import MrRobot.RobotConfiguration;
import MrRobot.util.ModelIO;

public class MainClass {
	
	public static void generateJavaFile(RobotConfiguration config) {
		SearchForLight fileGen = new SearchForLight();
		FileWriter output;
		BufferedWriter writer;
		System.out.println("Creating Stage Java Webots File...");
		try {
			output = new FileWriter("SearchForLight.java");
			writer = new BufferedWriter(output);
			// Appel de la méthode generate de la classe générée par JET
			writer.write(fileGen.generate(config));
			writer.close();
			System.out.println("Done.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Path configPath = Paths.get("/home/kimmeng/eclipse-devrep/Webots/model/RobotConfiguration.xmi");
		RobotConfiguration config = (RobotConfiguration) ModelIO.loadModel(configPath);
		generateJavaFile(config);
	}
}
