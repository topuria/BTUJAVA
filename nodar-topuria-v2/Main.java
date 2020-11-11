package Main;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

@Slf4j
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Search name: ");

        String text = scanner.nextLine();
        log.info("მოსაძებნი სიტყვა: ",text);

        File f = new File("D:/NewFolder");
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File f, String name) {
                return name.endsWith(text);
            }
        };
        if(f.exists() && f.isDirectory())
        {
            File arr[] = f.listFiles();
            System.out.println("Files from  directory : " + f);
            RecursiveSearch(arr,0,0);
        }

    }

    public static void RecursiveSearch(File[] arr,int index,int level)
    {

        if(index == arr.length)
            return;

        for (int i = 0; i < level; i++)
            System.out.print("\t");


        if(arr[index].isFile()) {
            System.out.println("მოიძებნა: "+arr[index].getName());
            log.info("მოიძებნა: ",arr[index].getName());
        }

            // for sub-directories
        else if(arr[index].isDirectory())
        {
            System.out.println("[" + arr[index].getName() + "]");
            log.info("ფოლდერი: ",arr[index].getName());

            RecursiveSearch(arr[index].listFiles(), 0, level + 1);
        }
        RecursiveSearch(arr,++index, level);
    }
}
