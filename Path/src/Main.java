import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Path path = Paths.get("out");
        System.out.println(path.toAbsolutePath());

        Path basePath = Paths.get(System.getProperty("user.home"));
        System.out.println(basePath);

        Path resolvePath = basePath.resolve("QLearningExample\\Lib\\site-packages");
        System.out.println(resolvePath);

        Path subPath = (Paths.get(System.getProperty("user.home"))).relativize(resolvePath);
        System.out.println(subPath);

        Path complicatedPath = Paths.get(basePath.toString(), "QLearningExample", "Lib");
        System.out.println(complicatedPath);

        Path workPath = Paths.get("C:\\JavaRepo\\RandomAccessFile\\test");
        Files.createFile(workPath);
    }
}