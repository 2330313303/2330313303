import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.Robot;
import com.example.mouseutil.MouseUtil;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.io.File;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.awt.Color;

import org.opencv.core.Core;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;









public class mozuaer {
    public static int ten_1 = 1;
    public static int ten_step = 1;
    public static int ten_2 = 1;
    public static int ten_4 = 1;
    public static int ten_3 = 1;
    public static int ten_5 = 1;
    public static int ten_6 = 1;
    public static int ten_7 = 1;
    // 使用内置日志库
    private static final Logger LOGGER = Logger.getLogger(mozuaer.class.getName());
    private static int counter = 0;

    //把文字去除空格回车的方法
    public static String replaceAllBlank(String str) {
        String s = "";
        if (str!=null) {
            Pattern p = Pattern.compile("\\s*|\t|\r|\n");
            /*\n 回车(\u000a)
            \t 水平制表符(\u0009)
            \s 空格(\u0008)
            \r 换行(\u000d)*/
            Matcher m = p.matcher(str);
            s = m.replaceAll("");
        }
        return s;
    }

    public static void main(String[] args) throws Exception {
        Robot robot1 = new Robot();
        Robot robot = new Robot();
        Random random = new Random();





        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        mozuaer mozuaer = new mozuaer();

        MyProgram frame = new MyProgram();
        // 创建文件日志记录器
        FileHandler fileHandler = new FileHandler("mozuaer.log");
        fileHandler.setFormatter(new SimpleFormatter());
        LOGGER.addHandler(fileHandler);

        final String mima="D:\\截图\\文档\\zh.txt";
        String path = "D:/333.png";
        String username= "2330313303";
        //密码
        String  typeid ="3";
        String password= "nide969210";
        //  Robot robot2 = new Robot();


        int c = Math.abs(random.nextInt()) % 10 + 20;
        jietu jt = new jietu();//截图设置的位置
        ///  jt.screenShotAsFile(200,200,100,200,"D:","333","png");
        dama dm = new dama();//打码的封装
        shubiao shub = new shubiao();//鼠标点击设置的位置并识别打码内容再进行复制黏贴输入
        ///  String s1 = dm.Damace(path,username,password,typeid);
        ///   System.out.println(s1);
        ///  shub.Danji(robot1,200,200);
        ///  robot1.delay(2000);
        ///  shub.outPut(s1,robot1);
        FindTool ft = new FindTool();//找到提前保存好的图片并把鼠标指示到那里或指示到设置的位置
        ///   PBean pb = ft.FindPic("D:/youxintubiao.png");
        ///  System.out.println(pb.getX()+""+pb.getY());
        /// robot1.delay(5000);
        ///  robot1.mouseMove(pb.getX()+50,pb.getY()+50);

        tessocr ocr = new tessocr();  //定义文字识别对象
        //ocr.ocr("D:/16.jpg");    //文字识别的方法。传入图片路径
        //截图方法（起点X,起点y,长，宽，文件保存路径，文件名，文件格式）
        // jt.screenShotAsFile(80,92,110,55,"D:","3","png");
        //识别验证码（图片路径，账号，密码，识别类型）；
        // dm.Damace(path,username,password,typeid);

        //PBean hh = ft.FindPic("D:/wwww.png");//如果找到某个图才进行某种命令（循环或if）
        //while(hh.getX()!=0){
        //System.out.println("坐标存在");}

        //final String hong="C:\\Users\\Administrator\\Desktop\\zh.txt";
        //BufferedReader vv = new BufferedReader(new InputStreamReader(new FileInputStream(hong),"UTF-8"));//黏贴文档文字
        // String line4 = null;
        //while ((line4 = vv.readLine()) != null) {
        // String[] lin = line4.split(",");
        // shub.Danji(robot,848,402);
        //  robot.delay((int) v);
        //  shub.Danji(robot,848,402);
        //  robot.delay((int) v);
        //  shub.outPut(lin[1], robot);}

        // jt.screenShotAsFile(594,225,121,15,"D:","555","png");//找到特定位置的图并识别数字然后减1在点击相应位置输入
        // robot.delay(5000);
        //String sdsdsds = ocr.ocr("D:/555.png");  //识别到的文字
        // robot.delay(1000);
        // String dsadsafsa = replaceAllBlank(sdsdsds);   //去除换行空格
        // String shurujinbi = String.valueOf((Integer.valueOf(dsadsafsa)-1));  //输入的文字减一
        // System.out.println(shurujinbi);
        // shub.Danji(robot,722,383);
        // robot.delay(1000);
        //  shub.outPut(shurujinbi, robot);//把文字复制粘贴
        //  robot.delay(50000);

        //如果在电脑屏幕的某个固定的范围内，找到了电脑某个文件夹里只要是含有高级飞行药这几个字命名的相似度为95%的任意图片，比如说图片名称为
        // 高级飞行药1.png、高级飞行药2.png均可，找到满足条件的图片后，用鼠标移动到找到的这个图片的所在位置上
       // Rectangle screenRange = new Rectangle(978, 157, 800, 600);  // 屏幕范围
       // String keyword = "最上级风之秘药";
       // String folderPath = "D:\\截图\\最上级风之秘药前6排";  // 图片所在的文件夹路径
        //int similarity = 95;  // 图片相似度的阈值
       // robot.delay(2000);
       // ScreenSearcher searcher = new ScreenSearcher(screenRange, keyword, folderPath, similarity);
       //searcher.execute();
       // robot.delay(50000);

        Rectangle screenRange2 = new Rectangle(800, 0, 800, 600);
        String keyword2 = "image2";
        String folderPath2 = "D:\\images2";
        int similarity2 = 95;

        //ScreenSearcher searcher2 = new ScreenSearcher(screenRange2, keyword2, folderPath2, similarity2);
       // searcher2.execute();
        //执行命令为：searcher.execute();searcher2.execute();为两个不同命令

        //PBean pb = ft.FindPic("D:/wwww.png");//找到永恒的图标鼠标移动上去 如果找到某个图片就执行某种命令
       // if(pb.getX()!=0){
       //     System.out.println("坐标存在");
       // }

        // 第一次引用 findImage 方法,如果找到固定范围内的相似80%的图片，并用鼠标指示点击上去，如果没有找到则键盘按O
      // BufferedImage targetImage1 = ImageIO.read(new File("D:/截图/正确截图/已锁屏.png"));
       // Rectangle searchArea1 = new Rectangle(470, 839, 100, 100);
      // double similarityThreshold1 = 0.9;
       // Point targetPoint1 = ImageFinder.findImage(targetImage1, searchArea1,
       //         similarityThreshold1);
      // if (targetPoint1 != null) {
        //   robot.mouseMove(targetPoint1.x + targetImage1.getWidth() / 2,
        //            targetPoint1.y + targetImage1.getHeight() / 2);
         //  Thread.sleep(1000);
         //  robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
         //  robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
         //   Thread.sleep(2000);

      //  }


        // 第二次引用 findImage 方法
        //BufferedImage targetImage2 = ImageIO.read(new File("D:/target2.png"));
       //Recouble similarityThreshold2 = 0.9;
       //  Point targetPoint2 = ImageFinder.findImage(targetImage2, searchArea2,
        // similarityThreshold2);
        // if (targetPoint2 != null) {
         //     System.out.println("找到了目标图片2，坐标为：" + targetPoint2.toString());

        //...执行相关操作
        //  } else {
        //      System.out.println("没有找到目标图片2！");
        //   }


       // PBean pb = ft.FindPic("D:/wwww.png");//找到永恒的图标鼠标移动上去如果找到则执行某种命令，没找到则执行另一种（代码有问题另一种命令并不执行）
       // if(pb.getX()!=0){}else{}

       // ScreenShotTool.captureAndSave("D:\\截图\\最上级风之秘药前6排", 1009, 65, 17, 11,
         //       25, 28, 3, 9);初始XY，图片长高，横向间隔25，纵向间隔28,3行9列  背包依次截图命令
//延迟5秒开始运行脚本
// 添加logging功能



        double v = 0.03 + random.nextDouble() * (0.03 - 0.01);//定义随机延迟在0.05-0.01秒之间 鼠标的延迟 robot.delay((int) v);
        LOGGER.info("鼠标随机延迟：" + v);
        v = v * 1000;


        double v1 = 2 + random.nextDouble() * (2 - 0.5);//定义随机在1-4像素点之间 偏移点击 +(int) v1
        LOGGER.info("鼠标随机移动像素点数：" + v1);


        double v2 = 0.4 + random.nextDouble() * (0.4 - 0.1);//定义随机延迟在0.4-0.1秒之间 键盘按键的延迟 robot.delay((int) v2);//按住延迟
        LOGGER.info("键盘随机延迟：" + v2);
        v2 = v2 * 1000;


        double v3 = 1 + random.nextDouble() * (1 - 0.5);//定义随机延迟在1-0.5秒之间 按键与按键之间的休息时间 Thread.sleep((int) v3);
        LOGGER.info("按键与按键之间的随机休息时间：" + v3);
        v3 = v3 * 1000;


        double v4 = 3 + random.nextDouble() * (3 - 2);//定义随机延迟在3-2秒之间 按键与按键之间的休息时间 Thread.sleep((int) v4);
        v4 = v4 * 1000;


        double v5 = 5 + random.nextDouble() * (5 - 4);//定义随机延迟在4-2秒之间 按键与按键之间的休息时间 Thread.sleep((int) v4);
        v5 = v5 * 1000;


        double v6 = 0.7 + random.nextDouble() * (0.7 - 0.3);//定义随机延迟在4-2秒之间 按键与按键之间的休息时间 Thread.sleep((int) v4);
        v6 = v6 * 1000;

        double v7 = 8 + random.nextDouble() * (8 -7);//定义随机延迟在7-8秒之间 阿尔AD方法
        v7 = v7 * 1000;

        double v10 = 8 + random.nextDouble() * (10 -8);//定义随机延迟在10-8秒之间 阿尔AD方法
        v10 = v10 * 1000;




        robot.setAutoDelay(1); // 设置模仿鼠标真实移动的速度
// 调用MouseUtil中的move方法
      // MouseUtil.move(robot, 200, 200);//模仿鼠标真实移动并点击，200,200为结束位置

        //CopyAndPaste.copyAndPaste("C:\\Users\\Administrator\\Desktop\\测试.txt", 1, 5,869,414);
        // 复制指定文档内容到指定位置  替换成你的文档路径和起始/结束行号/黏贴坐标

       // KeyUtil.pressKey(robot, KeyEvent.VK_CONTROL, KeyEvent.VK_C);
        // KeyUtil.pressKey(robot, KeyEvent.VK_CONTROL, -1);键盘按键

        //死循环
        robot.delay(5000);
        // Load the native OpenCV library
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);//AngleCalculatorTask,每隔3秒调整一次角度

        //int X1 = 148; // Set the X1 coordinate
        //int Y1 = 745;// Set the Y1 coordinate
        // AngleCalculatorTask task = new AngleCalculatorTask(robot, X1, Y1);
        // timer.schedule(task, 500, 2 * 1000);


        // Define the screenshot area66

/*
            if (ten_step == 1) {
                LOGGER.info("开始新一轮循环2");
                Color color208 = robot1.getPixelColor(154, 747);
                System.out.println("Color at (154, 747): " + color208);
                if (color208.getRed() > 124) {
                    LOGGER.info("进入18-step4-1");
                    boolean condition5 = ColorChecker.checkColorAndExecuteCommand(robot, 1196, 111, 249, 244, 202,
                            () -> {});
                    boolean condition6 = ColorChecker.checkColorAndExecuteCommand(robot, 1193, 114, 21, 34, 42,
                            () -> {});

                    if (condition5&condition6) {
                        Thread.sleep(240000);
                        LOGGER.info("判断虚弱");
                    }

                    robot.keyPress(KeyEvent.VK_W);
                    LOGGER.info("往前走");
                    boolean condition9 = ColorChecker.checkColorAndExecuteCommand(robot, 141, 811, 101, 100, 76,
                            () -> {});

                    if (condition9) {

                        robot.keyRelease(KeyEvent.VK_W);
                        robot.delay((int)v3);//按住延迟
                        KeyUtil.pressKey(robot, KeyEvent.VK_R,-1);
                        KeyUtil.pressKey(robot, KeyEvent.VK_F,-1 );

                        robot.keyPress(KeyEvent.VK_CONTROL);
                        robot.delay(200);//按住延迟
                        robot.keyPress(KeyEvent.VK_EQUALS);
                        robot.delay(200);//按住延迟
                        robot.keyRelease(KeyEvent.VK_CONTROL);
                        robot.delay(200);//按住延迟
                        robot.keyRelease(KeyEvent.VK_EQUALS);
                        LOGGER.info("按c+=定奇斯克");
                        Thread.sleep(700000);

                        ten_1 = 19;}
                }
                else {

                    LOGGER.info("进入5-step6-step10角度不对开始转向3");
                    robot1.keyPress(KeyEvent.VK_A);
                    robot1.delay(10);
                    robot1.keyRelease(KeyEvent.VK_A);
                    Thread.sleep(200);

                }}

        robot.delay(50000);*/
        /*
        Rectangle screenRange = new Rectangle(1267, 12, 167, 167);
        String keyword = "小地图奥德图标";
        String folderPath = "D:/截图/正确截图";
        int similarity = 90;
        int n = 1; // 获取第二近的点
        int keyToPress = java.awt.event.KeyEvent.VK_6; // 按下并释放的键 (例如 6)

        // 调用 CombinedTask 类的 combinedMethod 方法
        CombinedTask.combinedMethod(screenRange, keyword, folderPath, similarity, n, keyToPress);
*/
        /*Rectangle screenRange4 = new Rectangle(1267, 12, 167, 167);  // 屏幕范围
        String keyword4 = "圆形小地图";
        String folderPath4 = "D:\\截图\\正确截图";  // 图片所在的文件夹路径
        int similarity4 = 95;  // 图片相似度的阈值
        robot.delay(1000);
        ScreenSearcher searcher4 = new ScreenSearcher(screenRange4, keyword4, folderPath4, similarity4);
        searcher4.execute();
        robot.delay(50000);*/
/*
        Rectangle screenRange1 = new Rectangle(1267, 12, 167, 167);
        String keyword1 = "小地图奥德图标";
        String folderPath1 = "D:/截图/正确截图";
        int similarity1 = 90;
        int n1 = 1; // 获取第二近的点
        int keyToPress1 = java.awt.event.KeyEvent.VK_6; // 按下并释放的键 (例如 6)
        long delayAfterCombinedMethod1 = CombinedTask.combinedMethod(screenRange1, keyword1, folderPath1, similarity1, n1, keyToPress1);
        LOGGER.info("ten4step3找最近的点");
        robot.delay(50000);

        try {
            Thread.sleep(delayAfterCombinedMethod1); // 使用 holdTime 作为延时
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Color color44444 = robot1.getPixelColor(787, 309);
        Color color55555 = robot1.getPixelColor(770, 309);

        if (color44444.getRed() > 251 & color55555.getRed() > 251){
            LOGGER.info("ten2=14周围没有奥德进入ten_step = 4");
            ten_step = 4;

        }
        Thread.sleep(c);
        Color color20911 = robot1.getPixelColor(616, 661);
        if (color20911.getRed() > 210) {
            robot1.keyPress(KeyEvent.VK_Q);                //如果没采集
            robot1.delay(c);
            robot1.keyRelease(KeyEvent.VK_Q);
            robot1.delay(c);

        }
        robot.delay(50000);*/







        outerLoop5:
        while (true) {
            LOGGER.info("开始新一轮循环");
            LOGGER.info("当前ten_1的值: " + ten_1);

            if (ten_1 == 1) {


                Color color1 = robot1.getPixelColor(516, 836);
                Color color19 = robot1.getPixelColor(575, 838);       //判断游戏画面点1出现(游戏是否在线)
                if (color1.getRed() > 58&color1.getRed() < 75&color1.getGreen() > 69&color1.getGreen() <85&color1.getBlue() > 98
                        &color1.getBlue() < 111&color19.getRed() > 53&color19.getRed() < 63&color19.getGreen() > 61&color19.getGreen() <72
                        &color19.getBlue() > 91 &color19.getBlue() < 99) {
                    LOGGER.info("进入检测画面设置是否正确的循环");
                    ten_1 = 8;
                    LOGGER.info("检测到飞行图标判断游戏在线进入8循环");
                }//如果在游戏里进入8（检测画面设置是否正确）循环
                else {
                    LOGGER.info("没有检测到游戏飞翔图标判断游戏不在线开始找永恒图标");
                    PBean pb = ft.FindPic("D:/wwww.png");//找到永恒的图标鼠标移动上去
                    if (pb.getX() != 0) {
                        LOGGER.info("找到永恒的图标，开始鼠标移动和点击");
                        System.out.println(pb.getX() + "" + pb.getY());
                        robot.delay(1000);
                        robot1.mouseMove(pb.getX() + (int) v1, pb.getY() + (int) v1);
                        Thread.sleep(300); //延迟
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键

                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                        Thread.sleep(300); //延迟
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键

                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                        Thread.sleep(1000); //延迟
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                        robot.delay(20);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                        Thread.sleep(3000); //延迟
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                        robot.delay((int) v);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                        Thread.sleep(10000); //延迟
                    }


                    PBean aa = ft.FindPic("D:/444.png");//找到进入游戏的图标
                    LOGGER.info("找到进入游戏的图标");
                    System.out.println(aa.getX() + "" + aa.getY());
                    LOGGER.info("鼠标移动到进入游戏的图标上");
                    robot.delay((int) v);
                    robot.mouseMove(aa.getX() + 5, aa.getY() + 5);
                    Thread.sleep(300); //延迟
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep(5000); //延迟

                    robot.mouseMove(675, 450); // 鼠标移动到xx坐标轴 点击进入游戏
                    LOGGER.info("鼠标移动到675, 450上");
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep(5000); //延迟
                    LOGGER.info("点击后开始进入6循环");
                    ten_1 = 6;


                }//如果不在游戏里则开始登录游戏并进入进入6（输入游戏账号密码）循环


            }//判断游戏是否在线，不在线开始找永恒图标到输入密码前，在线进入8（判断游戏画面设置是否正确）

            if (ten_1 == 6) {
                LOGGER.info("开始判断是否出现用户协议");
                Color color18 = robot1.getPixelColor(704, 198);       //判断进入游戏
                if (color18.getRed() > 210) {
                    LOGGER.info("出现用户协议");
                    Thread.sleep(200); //延迟
                    robot.mouseMove(690 + (int) v1, 853 + (int) v1); // 鼠标移动到xx坐标轴  点击 用户协议
                    LOGGER.info("鼠标移动到用户协议处");
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    LOGGER.info("点击");
                    Thread.sleep(5000); //延迟

                    robot.mouseMove(690 + (int) v1, 853 + (int) v1); // 鼠标移动到xx坐标轴  点击 选择服务器
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep(10000); //延迟
                    LOGGER.info("点击选择服务器");
                    robot.mouseMove(779 + (int) v1, 505 + (int) v1); // 鼠标移动到xx坐标轴  点击 限制创建魔族
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep(5000); //延迟
                    LOGGER.info("点击限制创建魔族");
                    robot.mouseMove(210 + (int) v1, 748 + (int) v1); // 鼠标移动到xx坐标轴  点击 选人物
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep(5000); //延迟
                    LOGGER.info("点击选人物");
                    robot.mouseMove(584 + (int) v1, 854 + (int) v1); // 鼠标移动到xx坐标轴  点击 开始
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep(3000); //延迟
                    LOGGER.info("点击开始");

                    robot.mouseMove(609 + (int) v1, 473 + (int) v1); // 鼠标移动到xx坐标轴  点击 同意自由作战
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep(3000); //延迟
                    LOGGER.info("点击同意自由作战");
                    robot.mouseMove(787 + (int) v1, 511 + (int) v1); // 鼠标移动到xx坐标轴  点击 确认
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep(30000); //延迟
                    LOGGER.info("点击确认并开始进入8循环");
                    ten_1 = 8;
                } else {

                    LOGGER.info("判断用户协议找色点未出现，重新输入密码");
                    robot.mouseMove(720, 524); // 鼠标移动到xx坐标轴 点击
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep(2000); //延迟

                    robot.mouseMove(777, 557); // 鼠标移动到xx坐标轴 点击
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep(2000); //延迟

                    Color color13 = robot.getPixelColor(621, 321);       //判断输入密码框出现
                    if (color13.getRed() > 130) {
                        LOGGER.info("判断密码框出现");
                        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(mima)));
                        String line = null;
                        while ((line = br.readLine()) != null) {
                            String[] lin = line.split(",");
                            shub.Danji(robot, 663, 453);
                            robot.delay((int) v);
                            LOGGER.info("开始输入密码");
                            shub.shurumima(robot, lin[0]);
                            LOGGER.info("完成输入密码");
                            //移动到指定位置
                            // Danji(rt,259,345);
                            //将文件内容复制到粘贴板，然后进行ctrl+v//
                            // outPut(lin[0],rt);
                        }
                    }//输入密码，获取文件

                    robot.mouseMove(734, 503); // 鼠标移动到xx坐标轴  点击登录
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep(5000); //延迟
                    LOGGER.info("点击登录");
                    Thread.sleep(10000); //延迟

                    jt.screenShotAsFile(693, 399, 120, 50, "D:", "333", "png");
                    LOGGER.info("截图验证码");
                    Thread.sleep(4000); //延迟

                    String s1 = dm.Damace(path, username, password, typeid); //黏贴验证码
                    LOGGER.info("黏验证码");
                    System.out.println(s1);
                    shub.Danji(robot1, 719, 500);
                    robot1.delay(2000);
                    // shub.shurumima(robot1,s1);  //键盘输入
                    shub.outPut(s1, robot1);//把验证码复制黏贴
                    LOGGER.info("贴验证码");
                    Thread.sleep(2000); //延迟

                    robot.mouseMove(662, 549); // 鼠标移动到xx坐标轴  点击确认
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep(5000); //延迟
                    LOGGER.info("点击确认");
                    robot.mouseMove(1109 + (int) v1, 148 + (int) v1); // 鼠标移动到xx坐标轴  点击关闭游戏画面
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    LOGGER.info("关闭游戏退出时残留挡板");
                    Thread.sleep(55000);//延迟等待进入游戏55秒

                }
            }//如果找到用户协议则开始点登录的后半部分并进入8，如果没有找到用户协议则重新输入密码验证码

            if (ten_1 == 8) {

                Thread.sleep(2000); //延迟
                Color color11 = robot1.getPixelColor(368, 434);  //判断v挡板位置正确
                Color color20 = robot1.getPixelColor(607, 663);//判断1位置正确
                Color color10 = robot1.getPixelColor(11, 615); //判断N地图位置正确

                Color color8 = robot1.getPixelColor(570, 869);//判断宏
                Color color7 = robot1.getPixelColor(618, 857);
                Color color6 = robot1.getPixelColor(723, 857);
                Color color5 = robot1.getPixelColor(643, 851);

                Color color3 = robot1.getPixelColor(969, 848);//判断飞行药水
                Color color2 = robot1.getPixelColor(806, 844);//判断回城按键
                Color color21 = robot1.getPixelColor(1255, 214);//判断K位置正确按键
                if (color20.getRed() == 230 & color11.getRed() == 255 & color10.getRed() > 137
                        & color8.getRed() == 160 & color7.getRed() == 248 & color6.getRed() == 237 & color5.getRed() == 140
                         & color3.getRed() == 202 & color2.getBlue() == 175 & color21.getRed() == 185) {
                    LOGGER.info("判断1挡板、V挡板、N挡板、宏按键、飞行药水、回城按键、K奥德位置正确");
                    ten_1 = 10;
                    LOGGER.info("进入10循环");
                } else {
                    ten_1 = 13;
                    LOGGER.info("判断1挡板、V挡板、N挡板、宏按键、飞行药水、回城按键、K奥德其中有位置不正确的，进入13循环");
                }

            }//判断游戏画面设置是否正确（正确进入10循环，不正确进入13循环）

            if (ten_1 == 13) {
                Thread.sleep(1000); //延迟
                LOGGER.info("开始判断游戏按键是否锁屏");
                BufferedImage targetImage2 = ImageIO.read(new File("D:/截图/正确截图/已锁屏.png"));
                Rectangle searchArea2 = new Rectangle(470, 839, 100, 100);
                double similarityThreshold2 = 0.9;
                Point targetPoint2 = ImageFinder.findImage(targetImage2, searchArea2,
                        similarityThreshold2);
                if (targetPoint2 != null) {
                    LOGGER.info("判断游戏按键已锁屏");
                    robot.mouseMove(targetPoint2.x + targetImage2.getWidth() / 2,
                            targetPoint2.y + targetImage2.getHeight() / 2);
                    LOGGER.info("鼠标指到已锁屏图标上");
                    Thread.sleep(1000);
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    Thread.sleep(2000);
                    LOGGER.info("点击");
                }

                robot.keyPress(KeyEvent.VK_O);//按下键盘按键
                robot.delay((int) v2);//按住延迟
                robot.keyRelease(KeyEvent.VK_O); //释放键盘按键
                Thread.sleep((int) v3); //延迟
                LOGGER.info("点o开始设置游戏设置");
                Thread.sleep(1000);
                LOGGER.info("开始在o中游戏设置");
                robot.mouseMove(721 + (int) v1, 472 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                robot.delay((int) v);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                Thread.sleep((int) v3); //延迟

                robot.mouseMove(474 + (int) v1, 199 + (int) v1); // 鼠标移动到xx坐标轴  点击游戏设置
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                robot.delay((int) v);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                Thread.sleep((int) v3); //延迟

                robot.mouseMove(473 + (int) v1, 721 + (int) v1); // 鼠标移动到xx坐标轴 点击基本值
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                robot.delay((int) v);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                Thread.sleep((int) v3); //延迟


                robot.mouseMove(983 + (int) v1, 680 + (int) v1); // 鼠标移动到xx坐标轴 点击滑动框
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                robot.delay((int) v);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                Thread.sleep((int) v3); //延迟
                robot.mouseMove(983 + (int) v1, 680 + (int) v1); // 鼠标移动到xx坐标轴 点击滑动框
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                robot.delay((int) v);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                Thread.sleep((int) v3); //延迟
                robot.mouseMove(983 + (int) v1, 680 + (int) v1); // 鼠标移动到xx坐标轴 点击滑动框
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                robot.delay((int) v);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                Thread.sleep((int) v3); //延迟


                robot.mouseMove(941 + (int) v1, 290 + (int) v1); // 鼠标移动到xx坐标轴 点击UI
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                robot.delay((int) v);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                Thread.sleep((int) v3); //延迟

                robot.mouseMove(919 + (int) v1, 324 + (int) v1); // 鼠标移动到xx坐标轴 点击普通样式
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                robot.delay((int) v);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                Thread.sleep((int) v3); //延迟

                robot.mouseMove(840 + (int) v1, 720 + (int) v1); // 鼠标移动到xx坐标轴 点击确认
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                robot.delay((int) v);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                Thread.sleep((int) v3); //延迟


                robot.keyPress(KeyEvent.VK_O);//按下键盘按键
                robot.delay((int) v2);//按住延迟
                robot.keyRelease(KeyEvent.VK_O); //释放键盘按键
                Thread.sleep((int) v3); //延迟
                robot.mouseMove(721 + (int) v1, 472 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                robot.delay((int) v);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                Thread.sleep((int) v3); //延迟


                robot.mouseMove(983 + (int) v1, 234 + (int) v1); // 鼠标移动到xx坐标轴 点击滑动框
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                robot.delay((int) v);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                Thread.sleep((int) v3); //延迟
                robot.mouseMove(983 + (int) v1, 234 + (int) v1); // 鼠标移动到xx坐标轴 点击滑动框
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                robot.delay((int) v);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                Thread.sleep((int) v3); //延迟

                robot.mouseMove(740, 312); // 鼠标移动到xx坐标轴 点击1号移动栏
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                robot.delay((int) v);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                Thread.sleep((int) v3); //延迟

                robot.mouseMove(521, 579); // 鼠标移动到xx坐标轴 点击显示状态栏数值
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                robot.delay((int) v);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左// 键
                Thread.sleep((int) v3); //延迟

                robot.mouseMove(551 + (int) v1, 722 + (int) v1); // 鼠标移动到xx坐标轴 点击窗口位置初始化
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                robot.delay((int) v);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                Thread.sleep((int) v3); //延迟

                robot.mouseMove(649 + (int) v1, 197 + (int) v1); // 鼠标移动到xx坐标轴 点击操作设置
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                robot.delay((int) v);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                Thread.sleep((int) v3); //延迟

                robot.mouseMove(473 + (int) v1, 721 + (int) v1); // 鼠标移动到xx坐标轴 点击基本值
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                robot.delay((int) v);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                Thread.sleep((int) v3); //延迟


                robot.mouseMove(838 + (int) v1, 722 + (int) v1); // 鼠标移动到xx坐标轴 点击确认
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                robot.delay((int) v);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                Thread.sleep((int) v3); //延迟
                LOGGER.info("o中设置完成开始设置并开始判断K是否出现");
                Color color17 = robot1.getPixelColor(1222, 137);       //判断K出现没有
                if (color17.getRed() > 170) {
                    LOGGER.info("判断K出现");
                    robot.mouseMove(1296 + (int) v1, 157 + (int) v1); // 鼠标移动到xx坐标轴 点击功能
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep((int) v3); //延迟
                    LOGGER.info("点击功能");
                    robot.mouseMove(1390, 185); // 鼠标移动到技能选择框 点击下拉框最上按键坚持5-4秒
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v5);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep((int) v3); //延迟
                    LOGGER.info("鼠标移动到技能选择框 点击下拉框最上按键坚持5-4秒");
                    robot.mouseMove(1225 + (int) v1, 447 + (int) v1); // 鼠标移动到xx坐标轴 滑动框把1拖进去
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseMove(647 + (int) v1, 724 + (int) v1); // 鼠标移动到xx坐标轴 滑动框
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep((int) v3); //延迟
                    LOGGER.info("滑动框把1拖进去");
                    robot.mouseMove(1225 + (int) v1, 447 + (int) v1); // 鼠标移动到xx坐标轴 滑动框把1拖进去
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseMove(603 + (int) v1, 728 + (int) v1); // 鼠标移动到xx坐标轴 滑动框
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep((int) v3); //延迟
                    LOGGER.info("滑动框把1拖进去");
                    robot.mouseMove(1005, 720); // 鼠标移动到xx坐标轴 滑动框把1号移动快捷栏移动到位
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseMove(1005, 669); // 鼠标移动到xx坐标轴 滑动框
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep((int) v3); //延迟
                    LOGGER.info("滑动框把1号移动快捷栏移动到位");

                    robot.mouseMove(1056 + (int) v1, 239 + (int) v1); // 鼠标移动到xx坐标轴 滑动框把拾取拖下去
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseMove(764 + (int) v1, 863 + (int) v1); // 鼠标移动到xx坐标轴 拖到7
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep((int) v3); //延迟
                    LOGGER.info("把拾取拖到7");
                    robot.mouseMove(1056 + (int) v1, 448 + (int) v1); // 鼠标移动到xx坐标轴 滑动框把紧急返回拖下去
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseMove(847 + (int) v1, 863 + (int) v1); // 鼠标移动到xx坐标轴 拖到9
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep((int) v3); //延迟
                    LOGGER.info("把拾取拖到9");




                    robot.keyPress(KeyEvent.VK_K);//按下键盘按键 把K关掉
                    robot.delay((int) v2);//按住延迟
                    robot.keyRelease(KeyEvent.VK_K); //释放键盘按键
                    Thread.sleep((int) v3); //延迟
                    LOGGER.info("按下键盘按键 把K关掉");
                    ten_1 = 9;
                    LOGGER.info("进入9循环");

                } else {
                    LOGGER.info("判断K没有出现");
                    robot.keyPress(KeyEvent.VK_K);//按下键盘按键
                    robot.delay((int) v2);//按住延迟
                    robot.keyRelease(KeyEvent.VK_K); //释放键盘按键
                    Thread.sleep((int) v3); //延迟
                    LOGGER.info("打开K开始设置1挡板");
                    robot.mouseMove(1296 + (int) v1, 157 + (int) v1); // 鼠标移动到xx坐标轴 点击功能
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep((int) v3); //延迟

                    robot.mouseMove(1390, 185); // 鼠标移动到技能选择框 点击下拉框最上按键坚持5-4秒
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v5);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep((int) v3); //延迟

                    robot.mouseMove(1225 + (int) v1, 447 + (int) v1); // 鼠标移动到xx坐标轴 滑动框把1拖进去
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseMove(647 + (int) v1, 724 + (int) v1); // 鼠标移动到xx坐标轴 滑动框
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep((int) v3); //延迟

                    robot.mouseMove(1225 + (int) v1, 447 + (int) v1); // 鼠标移动到xx坐标轴 滑动框把1拖进去
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseMove(603 + (int) v1, 728 + (int) v1); // 鼠标移动到xx坐标轴 滑动框
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep((int) v3); //延迟

                    robot.mouseMove(1005, 720); // 鼠标移动到xx坐标轴 滑动框把1号移动快捷栏移动到位
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseMove(1005, 669); // 鼠标移动到xx坐标轴 滑动框
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep((int) v3); //延迟
                    LOGGER.info("完成1挡板设置");
                    robot.mouseMove(1056 + (int) v1, 239 + (int) v1); // 鼠标移动到xx坐标轴 滑动框把拾取拖下去
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseMove(764 + (int) v1, 863 + (int) v1); // 鼠标移动到xx坐标轴 拖到7
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep((int) v3); //延迟
                    LOGGER.info("把拾取拖到7");
                    robot.mouseMove(1056 + (int) v1, 448 + (int) v1); // 鼠标移动到xx坐标轴 滑动框把紧急返回拖下去
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseMove(847 + (int) v1, 863 + (int) v1); // 鼠标移动到xx坐标轴 拖到9
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep((int) v3); //延迟
                    LOGGER.info("把拾取拖到9");


                    robot.keyPress(KeyEvent.VK_K);//按下键盘按键 把K关掉
                    robot.delay((int) v2);//按住延迟
                    robot.keyRelease(KeyEvent.VK_K); //释放键盘按键
                    Thread.sleep((int) v3); //延迟
                    LOGGER.info("把K关掉");
                    ten_1 = 9;
                    LOGGER.info("进入9循环");
                }
            }//开始点O设置游戏设置，设置完进入9循环

            if (ten_1 == 9) {
                Color color16 = robot1.getPixelColor(1248, 129);       //判断v出现
                if (color16.getRed() > 190) {
                    LOGGER.info("判断v出现");
                    LOGGER.info("开始点阻止");
                    robot.mouseMove(1188 + (int) v1, 153 + (int) v1); // 鼠标移动到xx坐标轴 点击阻止
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep((int) v3); //延迟

                    robot.mouseMove(1271, 129); // 鼠标移动到xx坐标轴 把V移动到位
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseMove(1271, 440); // 鼠标移动到xx坐标轴
                    robot.delay((int) v);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep(2000); //延迟

                    robot.mouseMove(1275, 436); // 鼠标移动到xx坐标轴 把V移动到位
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay(2000);
                    robot.mouseMove(108, 440); // 鼠标移动到xx坐标轴
                    robot.delay(2000);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep((int) v3); //延迟
                    LOGGER.info("把V移动到位");


                } else {
                    LOGGER.info("判断V没有出现，开始点V");
                    robot.keyPress(KeyEvent.VK_V);//按下键盘按键
                    robot.delay((int) v2);//按住延迟
                    robot.keyRelease(KeyEvent.VK_V); //释放键盘按键
                    Thread.sleep((int) v3); //延迟
                    LOGGER.info("开始点阻止");
                    robot.mouseMove(1188 + (int) v1, 153 + (int) v1); // 鼠标移动到xx坐标轴 点击阻止
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep(2000); //延迟
                    LOGGER.info("开始把V移动到位");
                    robot.mouseMove(1271, 129); // 鼠标移动到xx坐标轴 把V移动到位
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseMove(1271, 440); // 鼠标移动到xx坐标轴
                    robot.delay((int) v);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep(2000); //延迟

                    robot.mouseMove(1275, 436); // 鼠标移动到xx坐标轴 把V移动到位
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay(2000);
                    robot.mouseMove(108, 440); // 鼠标移动到xx坐标轴
                    robot.delay(2000);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep((int) v3); //延迟


                }
                KeyUtil.pressKey(robot, KeyEvent.VK_K, -1);
                LOGGER.info("点k");

                Color color15 = robot1.getPixelColor(1307, 478);
                Color color17 = robot1.getPixelColor(1307, 474);//判断N出现
                if (color15.getRed() > 190&color17.getRed() > 207) {

                    LOGGER.info("判断N出现开始把N移动到位");
                    robot.mouseMove(1307, 478); // 鼠标移动到xx坐标轴 把N移动到位
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseMove(281, 617); // 鼠标移动到xx坐标轴
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep((int) v3); //延迟


                } else {
                    LOGGER.info("判断N没出现开始点N");
                    Thread.sleep((int) v3); //延迟
                    robot.keyPress(KeyEvent.VK_N);//按下键盘按键
                    robot.delay((int) v2);//按住延迟
                    robot.keyRelease(KeyEvent.VK_N); //释放键盘按键
                    Thread.sleep((int) v3); //延迟
                    Color color1 = robot1.getPixelColor(1307, 478);
                    Color color2 = robot1.getPixelColor(1307, 474);//判断N出现
                    if (color1.getRed() > 190&color2.getRed() > 207) {
                        LOGGER.info("判断小N出现开始把N移动到位");
                        robot.mouseMove(1307, 478); // 鼠标移动到xx坐标轴 把N移动到位
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                        robot.delay((int) v);
                        robot.mouseMove(281, 617); // 鼠标移动到xx坐标轴
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                        Thread.sleep((int) v3); //延迟

                    }else{
                        LOGGER.info("判断小N未出现再点一下N开始把N移动到位");
                        robot.keyPress(KeyEvent.VK_N);//按下键盘按键
                        robot.delay((int) v2);//按住延迟
                        robot.keyRelease(KeyEvent.VK_N); //释放键盘按键
                        Thread.sleep((int) v3); //延迟
                        robot.keyPress(KeyEvent.VK_N);//按下键盘按键
                        robot.delay((int) v2);//按住延迟
                        robot.keyRelease(KeyEvent.VK_N); //释放键盘按键
                        Thread.sleep((int) v3); //延迟
                        robot.mouseMove(1307, 478); // 鼠标移动到xx坐标轴 把N移动到位
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                        robot.delay((int) v);
                        robot.mouseMove(281, 617); // 鼠标移动到xx坐标轴
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                        Thread.sleep((int) v3); //延迟
                    }



                }



                ten_1 = 12;
                LOGGER.info("进入12循环");
            }//开始设置透明小地图和挡板,设置完成后进入12循环

            if (ten_1 == 12){

                Color color2 = robot1.getPixelColor(806, 844);       //判断回城出现 这里最好改成识图
                if (color2.getBlue() == 175) {

                    LOGGER.info("回城出现");

                    ten_1 = 14;
                    LOGGER.info("进入14循环");

                } else {
                    LOGGER.info("判断回城没有出现");

                    LOGGER.info("开始点使用");
                    robot.mouseMove(1063 + (int) v1, 159 + (int) v1); // 鼠标移动到xx坐标轴 点击使用
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep((int) v3); //延迟

                    Color color8 = robot1.getPixelColor(1042, 588);       //判断最高技能打钩没
                    if (color8.getRed() > 30) {
                        LOGGER.info("最高技能打钩");

                        LOGGER.info("开始鼠标移动到技能选择框 点击下拉框最上按键坚持5-4秒");
                        robot.mouseMove(1390, 185); // 鼠标移动到技能选择框 点击下拉框最上按键坚持5-4秒
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                        robot.delay((int) v5);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                        Thread.sleep((int) v3); //延迟
                    } else {

                        LOGGER.info("最高技能没打钩，开始鼠标移动到技能选择框 点击只显示最高技能");
                        robot.mouseMove(1086, 585); // 鼠标移动到技能选择框 点击只显示最高技能
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                        robot.delay((int) v);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                        Thread.sleep((int) v3); //延迟
                        LOGGER.info("开始鼠标移动到技能选择框 点击下拉框最上按键坚持5-4秒");
                        robot.mouseMove(1390, 185); // 鼠标移动到技能选择框 点击下拉框最上按键坚持5-4秒
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                        robot.delay((int) v5);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                        Thread.sleep((int) v3); //延迟
                    }

                    ten_1 = 11;
                    LOGGER.info("进入11循环");


                }
            }//判断是否要设置技能按键（回城和打怪技能未完成），不需要设置进入14循环，需要设置，设置好后进入11循环

            if (ten_1 == 11) {

                Color color14 = robot1.getPixelColor(1058, 209);
                if (color14.getRed() == 215) {
                    LOGGER.info("回城出现，开始鼠标移动到xx坐标轴 把回城移动到位");
                    Thread.sleep(1000); //延迟
                    robot.mouseMove(1057, 223); // 鼠标移动到xx坐标轴 把回城移动到位
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseMove(807, 862); // 鼠标移动到xx坐标轴 拖到8
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep((int) 1000); //延迟
                    LOGGER.info("关掉K？");
                    KeyUtil.pressKey(robot, KeyEvent.VK_K, -1);
                    ten_1 = 14;
                    LOGGER.info("进入14循环");
                } else {

                    LOGGER.info("回城未出现，滚动鼠标滚轮一次");
                    robot.mouseWheel(1);
                    Thread.sleep((int) v4); //延迟


                }
            }//开始设置技能按键（未完成只写了回城）修改完成后进入14循环
            if (ten_1 == 14) {
                Color color8 = robot1.getPixelColor(570, 869);
                Color color7 = robot1.getPixelColor(618, 857);
                Color color6 = robot1.getPixelColor(723, 857);
                Color color5 = robot1.getPixelColor(643, 851);

                if (color8.getRed() == 160 & color7.getRed() == 248 & color6.getRed() == 237 & color5.getRed() == 140
                        ) {
                    LOGGER.info("判断奥德宏按键位置正确");
                    ten_1 = 15;
                    LOGGER.info("进入15循环");
                } else {

                    LOGGER.info("判断魔力/燃烧/小块的奥德按键位置不正确，开始设置宏");
                    KeyUtil.pressKey(robot, KeyEvent.VK_U, -1);
                    LOGGER.info("打开U");
                    LOGGER.info("开始设置宏图标3小块奥德");
                    BufferedImage targetImage1 = ImageIO.read(new File("D:/截图/正确截图/宏图标3.png"));
                    Rectangle searchArea1 = new Rectangle(1059, 153, 224, 404);
                    double similarityThreshold1 = 0.9;
                    Point targetPoint1 = ImageFinder.findImage(targetImage1, searchArea1,
                            similarityThreshold1);
                    if (targetPoint1 != null) {
                        LOGGER.info("找到宏图标3");
                        robot.mouseMove(targetPoint1.x + targetImage1.getWidth() / 2, targetPoint1.y + targetImage1.getHeight() / 2);
                        robot.delay((int) v);
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                        robot.delay((int) v);
                        robot.mouseMove(722 + (int) v1, 864 + (int) v1); // 鼠标移动到xx坐标轴
                        robot.delay((int) v);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                        Thread.sleep((int) v3); //延迟
                        LOGGER.info("完成宏图标3拖拽");

                    } else {
                        LOGGER.info("未找到宏图标3，开始设置小块奥德宏");
                        BufferedImage targetImage3 = ImageIO.read(new File("D:/截图/正确截图/新建宏.png"));
                        Rectangle searchArea3 = new Rectangle(979, 253, 269, 440);
                        double similarityThreshold3 = 0.9;
                        Point targetPoint3 = ImageFinder.findImage(targetImage3, searchArea3,
                                similarityThreshold3);
                        if (targetPoint3 != null) {
                            LOGGER.info("找到新建宏");
                            MouseUtil.moveWithCurve(robot, targetPoint3.x + targetImage3.getWidth() / 2, targetPoint3.y + targetImage3.getHeight() / 2);
                            LOGGER.info("点击新建宏");
                            Thread.sleep((int) v3); //延迟
                            LOGGER.info("开始小块奥德宏文档黏贴");
                            CopyAndPaste.copyAndPaste("D:\\截图\\文档\\宏设置.txt", 5, 6, 836, 446);

                            Thread.sleep((int) v3); //
                            LOGGER.info("开始设置宏名称为33");
                            MouseUtil.move(robot, 836, 165);
                            KeyUtil.pressKey(robot, KeyEvent.VK_3, -1);
                            KeyUtil.pressKey(robot, KeyEvent.VK_3, -1);
                            LOGGER.info("开始选择宏图标");
                            MouseUtil.moveWithCurve(robot, 843, 292);
                            LOGGER.info("开始点击储存");
                            MouseUtil.moveWithCurve(robot, 953, 577);
                            LOGGER.info("开始点击下方空白处");
                            MouseUtil.moveWithCurve(robot, 1121, 532);

                            BufferedImage targetImage6 = ImageIO.read(new File("D:/截图/正确截图/宏图标3.png"));
                            Rectangle searchArea6 = new Rectangle(1059, 182, 130, 372);
                            double similarityThreshold6 = 0.9;
                            Point targetPoint6 = ImageFinder.findImage(targetImage6, searchArea6,
                                    similarityThreshold6);
                            if (targetPoint6 != null) {
                                LOGGER.info("找到宏图标3");
                                robot.mouseMove(targetPoint6.x + targetImage6.getWidth() / 2, targetPoint6.y + targetImage6.getHeight() / 2);
                                robot.delay((int) v);
                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                robot.delay((int) v);
                                robot.mouseMove(722 + (int) v1, 860 + (int) v1); // 鼠标移动到xx坐标轴
                                robot.delay((int) v);
                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                Thread.sleep((int) v3); //延迟
                                LOGGER.info("完成宏图标3拖拽");

                            }
                        }
                    }
                    BufferedImage targetImage10 = ImageIO.read(new File("D:/截图/正确截图/宏图标定奇斯克.png"));
                    Rectangle searchArea10 = new Rectangle(1059, 153, 224, 404);
                    double similarityThreshold10 = 0.98;
                    Point targetPoint10 = ImageFinder.findImage(targetImage10, searchArea10,
                            similarityThreshold10);
                    if (targetPoint10 != null) {
                        LOGGER.info("找到宏图标定奇斯克");
                        robot.mouseMove(targetPoint10.x + targetImage10.getWidth() / 2, targetPoint10.y + targetImage10.getHeight() / 2);
                        robot.delay(5000);
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                        robot.delay((int) v);
                        robot.mouseMove(968 + (int) v1, 771 + (int) v1); // 鼠标移动到xx坐标轴
                        robot.delay((int) v);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                        Thread.sleep((int) v3); //延迟
                        LOGGER.info("完成宏图标定奇斯克拖拽");


                    } else {
                        LOGGER.info("未找到宏图标定奇斯克，开始设置宏图标定奇斯克宏");
                        BufferedImage targetImage3 = ImageIO.read(new File("D:/截图/正确截图/新建宏.png"));
                        Rectangle searchArea3 = new Rectangle(979, 253, 269, 440);
                        double similarityThreshold3 = 0.9;
                        Point targetPoint3 = ImageFinder.findImage(targetImage3, searchArea3,
                                similarityThreshold3);
                        if (targetPoint3 != null) {
                            LOGGER.info("找到新建宏");
                            MouseUtil.moveWithCurve(robot, targetPoint3.x + targetImage3.getWidth() / 2, targetPoint3.y + targetImage3.getHeight() / 2);
                            LOGGER.info("点击新建宏");
                            Thread.sleep((int) v3); //延迟
                            LOGGER.info("开始宏图标定奇斯克文档黏贴");
                            CopyAndPaste.copyAndPaste("D:\\截图\\文档\\宏设置.txt", 11, 12, 836, 446);

                            Thread.sleep((int) v3); //
                            LOGGER.info("开始设置宏名称为66");
                            MouseUtil.move(robot, 836, 165);
                            KeyUtil.pressKey(robot, KeyEvent.VK_6, -1);
                            KeyUtil.pressKey(robot, KeyEvent.VK_6, -1);
                            LOGGER.info("开始选择宏图标");
                            MouseUtil.moveWithCurve(robot, 842, 332);
                            LOGGER.info("开始点击储存");
                            MouseUtil.moveWithCurve(robot, 953, 577);
                            LOGGER.info("开始点击下方空白处");
                            MouseUtil.moveWithCurve(robot, 1121, 532);

                            BufferedImage targetImage11 = ImageIO.read(new File("D:/截图/正确截图/宏图标定奇斯克.png"));
                            Rectangle searchArea11 = new Rectangle(1059, 153, 224, 404);
                            double similarityThreshold11 = 0.9;
                            Point targetPoint11 = ImageFinder.findImage(targetImage11, searchArea11,
                                    similarityThreshold11);
                            if (targetPoint11 != null) {
                                LOGGER.info("找到宏图标定奇斯克");
                                robot.mouseMove(targetPoint11.x + targetImage11.getWidth() / 2, targetPoint11.y + targetImage11.getHeight() / 2);
                                robot.delay((int) v);
                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                robot.delay((int) v);
                                robot.mouseMove(968 + (int) v1, 771 + (int) v1); // 鼠标移动到xx坐标轴
                                robot.delay((int) v);
                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                Thread.sleep((int) v3); //延迟
                                LOGGER.info("完成宏图标定奇斯克拖拽");

                            }

                        }

                    }

                    BufferedImage targetImage7 = ImageIO.read(new File("D:/截图/正确截图/宏图标4.png"));
                    Rectangle searchArea7 = new Rectangle(1059, 153, 224, 404);
                    double similarityThreshold7 = 0.9;
                    Point targetPoint7 = ImageFinder.findImage(targetImage7, searchArea7,
                            similarityThreshold7);
                    if (targetPoint7 != null) {
                        LOGGER.info("找到宏图标4");
                        robot.mouseMove(targetPoint7.x + targetImage7.getWidth() / 2, targetPoint7.y + targetImage7.getHeight() / 2);
                        robot.delay((int) v);
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                        robot.delay((int) v);
                        robot.mouseMove(684 + (int) v1, 864 + (int) v1); // 鼠标移动到xx坐标轴
                        robot.delay((int) v);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                        Thread.sleep((int) v3); //延迟
                        LOGGER.info("完成宏图标4拖拽");


                    } else {
                        LOGGER.info("未找到宏图标4，开始设置大块奥德宏");
                        BufferedImage targetImage3 = ImageIO.read(new File("D:/截图/正确截图/新建宏.png"));
                        Rectangle searchArea3 = new Rectangle(979, 253, 269, 440);
                        double similarityThreshold3 = 0.9;
                        Point targetPoint3 = ImageFinder.findImage(targetImage3, searchArea3,
                                similarityThreshold3);
                        if (targetPoint3 != null) {
                            LOGGER.info("找到新建宏");
                            MouseUtil.moveWithCurve(robot, targetPoint3.x + targetImage3.getWidth() / 2, targetPoint3.y + targetImage3.getHeight() / 2);
                            LOGGER.info("点击新建宏");
                            Thread.sleep((int) v3); //延迟
                            LOGGER.info("开始大块奥德宏文档黏贴");
                            CopyAndPaste.copyAndPaste("D:\\截图\\文档\\宏设置.txt", 7, 8, 836, 446);

                            Thread.sleep((int) v3); //
                            LOGGER.info("开始设置宏名称为44");
                            MouseUtil.move(robot, 836, 165);
                            KeyUtil.pressKey(robot, KeyEvent.VK_4, -1);
                            KeyUtil.pressKey(robot, KeyEvent.VK_4, -1);
                            LOGGER.info("开始选择宏图标");
                            MouseUtil.moveWithCurve(robot, 882, 292);
                            LOGGER.info("开始点击储存");
                            MouseUtil.moveWithCurve(robot, 953, 577);
                            LOGGER.info("开始点击下方空白处");
                            MouseUtil.moveWithCurve(robot, 1121, 532);

                            BufferedImage targetImage8 = ImageIO.read(new File("D:/截图/正确截图/宏图标4.png"));
                            Rectangle searchArea8 = new Rectangle(1059, 153, 224, 404);
                            double similarityThreshold8 = 0.9;
                            Point targetPoint8 = ImageFinder.findImage(targetImage8, searchArea8,
                                    similarityThreshold8);
                            if (targetPoint8 != null) {
                                LOGGER.info("找到宏图标4");
                                robot.mouseMove(targetPoint8.x + targetImage8.getWidth() / 2, targetPoint8.y + targetImage8.getHeight() / 2);
                                robot.delay((int) v);
                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                robot.delay((int) v);
                                robot.mouseMove(684 + (int) v1, 864 + (int) v1); // 鼠标移动到xx坐标轴
                                robot.delay((int) v);
                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                Thread.sleep((int) v3); //延迟
                                LOGGER.info("完成宏图标4拖拽");


                            }


                        }

                    }
                    BufferedImage targetImage9 = ImageIO.read(new File("D:/截图/正确截图/宏图标5.png"));
                    Rectangle searchArea9 = new Rectangle(1059, 153, 224, 404);
                    double similarityThreshold9 = 0.9;
                    Point targetPoint9 = ImageFinder.findImage(targetImage9, searchArea9,
                            similarityThreshold9);
                    if (targetPoint9 != null) {
                        LOGGER.info("找到宏图标5");
                        robot.mouseMove(targetPoint9.x + targetImage9.getWidth() / 2, targetPoint9.y + targetImage9.getHeight() / 2);
                        robot.delay((int) v);
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                        robot.delay((int) v);
                        robot.mouseMove(645 + (int) v1, 861 + (int) v1); // 鼠标移动到xx坐标轴
                        robot.delay((int) v);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                        Thread.sleep((int) v3); //延迟
                        LOGGER.info("完成宏图标4拖拽");


                    } else {
                        LOGGER.info("未找到宏图标5，开始设置闪光的奥德宏");
                        BufferedImage targetImage3 = ImageIO.read(new File("D:/截图/正确截图/新建宏.png"));
                        Rectangle searchArea3 = new Rectangle(979, 253, 269, 440);
                        double similarityThreshold3 = 0.9;
                        Point targetPoint3 = ImageFinder.findImage(targetImage3, searchArea3,
                                similarityThreshold3);
                        if (targetPoint3 != null) {
                            LOGGER.info("找到新建宏");
                            MouseUtil.moveWithCurve(robot, targetPoint3.x + targetImage3.getWidth() / 2, targetPoint3.y + targetImage3.getHeight() / 2);
                            LOGGER.info("点击新建宏");
                            Thread.sleep((int) v3); //延迟
                            LOGGER.info("开始闪光的奥德宏文档黏贴");
                            CopyAndPaste.copyAndPaste("D:\\截图\\文档\\宏设置.txt", 9, 10, 836, 446);

                            Thread.sleep((int) v3); //
                            LOGGER.info("开始设置宏名称为55");
                            MouseUtil.move(robot, 836, 165);
                            KeyUtil.pressKey(robot, KeyEvent.VK_5, -1);
                            KeyUtil.pressKey(robot, KeyEvent.VK_5, -1);
                            LOGGER.info("开始选择宏图标");
                            MouseUtil.moveWithCurve(robot, 926, 289);
                            LOGGER.info("开始点击储存");
                            MouseUtil.moveWithCurve(robot, 953, 577);
                            LOGGER.info("开始点击下方空白处");
                            MouseUtil.moveWithCurve(robot, 1121, 532);

                            BufferedImage targetImage8 = ImageIO.read(new File("D:/截图/正确截图/宏图标5.png"));
                            Rectangle searchArea8 = new Rectangle(1059, 153, 224, 404);
                            double similarityThreshold8 = 0.9;
                            Point targetPoint8 = ImageFinder.findImage(targetImage8, searchArea8,
                                    similarityThreshold8);
                            if (targetPoint8 != null) {
                                LOGGER.info("找到宏图标5");
                                robot.mouseMove(targetPoint8.x + targetImage8.getWidth() / 2, targetPoint8.y + targetImage8.getHeight() / 2);
                                robot.delay((int) v);
                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                robot.delay((int) v);
                                robot.mouseMove(645 + (int) v1, 865 + (int) v1); // 鼠标移动到xx坐标轴
                                robot.delay((int) v);
                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                Thread.sleep((int) v3); //延迟
                                LOGGER.info("完成宏图标5拖拽");


                            }


                        }

                    }

                    BufferedImage targetImage2 = ImageIO.read(new File("D:/截图/正确截图/宏图标1.png"));
                    Rectangle searchArea2 = new Rectangle(1059, 153, 224, 404);
                    double similarityThreshold2 = 0.9;
                    Point targetPoint2 = ImageFinder.findImage(targetImage2, searchArea2,
                            similarityThreshold2);
                    if (targetPoint2 != null) {
                        LOGGER.info("找到宏图标1");
                        robot.mouseMove(targetPoint2.x + targetImage2.getWidth() / 2, targetPoint2.y + targetImage2.getHeight() / 2);
                        robot.delay((int) v);
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                        robot.delay((int) v);
                        robot.mouseMove(565 + (int) v1, 863 + (int) v1); // 鼠标移动到xx坐标轴
                        robot.delay((int) v);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                        Thread.sleep((int) v3); //延迟
                        LOGGER.info("完成宏图标1拖拽");


                    } else {
                        LOGGER.info("未找到宏图标1，开始设置魔力奥德宏");
                        BufferedImage targetImage3 = ImageIO.read(new File("D:/截图/正确截图/新建宏.png"));
                        Rectangle searchArea3 = new Rectangle(979, 253, 269, 440);
                        double similarityThreshold3 = 0.9;
                        Point targetPoint3 = ImageFinder.findImage(targetImage3, searchArea3,
                                similarityThreshold3);
                        if (targetPoint3 != null) {
                            LOGGER.info("找到新建宏");
                            MouseUtil.moveWithCurve(robot, targetPoint3.x + targetImage3.getWidth() / 2, targetPoint3.y + targetImage3.getHeight() / 2);
                            LOGGER.info("点击新建宏");
                            Thread.sleep((int) v3); //延迟
                            LOGGER.info("开始魔力奥德宏文档黏贴");
                            CopyAndPaste.copyAndPaste("D:\\截图\\文档\\宏设置.txt", 1, 2, 836, 446);

                            Thread.sleep((int) v3); //
                            LOGGER.info("开始设置宏名称为11");
                            MouseUtil.move(robot, 836, 165);
                            MouseUtil.move(robot, 836, 165);
                            KeyUtil.pressKey(robot, KeyEvent.VK_1, -1);
                            KeyUtil.pressKey(robot, KeyEvent.VK_1, -1);
                            LOGGER.info("开始选择宏图标");
                            MouseUtil.moveWithCurve(robot, 1006, 290);
                            LOGGER.info("开始点击储存");
                            MouseUtil.moveWithCurve(robot, 953, 577);
                            LOGGER.info("开始点击下方空白处");
                            MouseUtil.moveWithCurve(robot, 1121, 532);
                            BufferedImage targetImage5 = ImageIO.read(new File("D:/截图/正确截图/宏图标1.png"));
                            Rectangle searchArea5 = new Rectangle(1059, 153, 224, 404);
                            double similarityThreshold5 = 0.9;
                            Point targetPoint5 = ImageFinder.findImage(targetImage5, searchArea5,
                                    similarityThreshold5);
                            if (targetPoint5 != null) {
                                LOGGER.info("找到宏图标1");
                                robot.mouseMove(targetPoint5.x + targetImage5.getWidth() / 2, targetPoint5.y + targetImage5.getHeight() / 2);
                                robot.delay((int) v);
                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                robot.delay((int) v);
                                robot.mouseMove(565 + (int) v1, 863 + (int) v1); // 鼠标移动到xx坐标轴
                                robot.delay((int) v);
                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                Thread.sleep((int) v3); //延迟
                                LOGGER.info("完成宏图标1拖拽");


                            }


                        }

                    }

                    BufferedImage targetImage4 = ImageIO.read(new File("D:/截图/正确截图/宏图标2.png"));
                    Rectangle searchArea4 = new Rectangle(1059, 153, 224, 404);
                    double similarityThreshold4 = 0.9;
                    Point targetPoint4 = ImageFinder.findImage(targetImage4, searchArea4,
                            similarityThreshold4);
                    if (targetPoint4 != null) {
                        LOGGER.info("找到宏图标2并开始拖拽");
                        robot.mouseMove(targetPoint4.x + targetImage4.getWidth() / 2, targetPoint4.y + targetImage4.getHeight() / 2);
                        robot.delay((int) v);
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                        robot.delay((int) v);
                        robot.mouseMove(598 + (int) v1, 857 + (int) v1); // 鼠标移动到xx坐标轴
                        robot.delay((int) v);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                        Thread.sleep((int) v3); //延迟


                    } else {
                        LOGGER.info("未找到宏图标2，开始设置");
                        BufferedImage targetImage3 = ImageIO.read(new File("D:/截图/正确截图/新建宏.png"));
                        Rectangle searchArea3 = new Rectangle(979, 253, 269, 440);
                        double similarityThreshold3 = 0.9;
                        Point targetPoint3 = ImageFinder.findImage(targetImage3, searchArea3,
                                similarityThreshold3);
                        if (targetPoint3 != null) {
                            LOGGER.info("找到新建宏");
                            MouseUtil.move(robot, targetPoint3.x + targetImage3.getWidth() / 2, targetPoint3.y + targetImage3.getHeight() / 2);
                            Thread.sleep((int) v3); //延迟
                            CopyAndPaste.copyAndPaste("D:\\截图\\文档\\宏设置.txt", 3, 4, 836, 446);
                            Thread.sleep((int) v3); //延迟
                            LOGGER.info("开始设置宏名称为22");
                            MouseUtil.move(robot, 836, 165);
                            KeyUtil.pressKey(robot, KeyEvent.VK_2, -1);
                            KeyUtil.pressKey(robot, KeyEvent.VK_2, -1);
                            LOGGER.info("开始选择宏图标");
                            MouseUtil.move(robot, 967, 290);
                            LOGGER.info("开始点击储存");
                            MouseUtil.moveWithCurve(robot, 953, 577);
                            LOGGER.info("开始点击下方空白处");
                            MouseUtil.moveWithCurve(robot, 1121, 532);

                            BufferedImage targetImage5 = ImageIO.read(new File("D:/截图/正确截图/宏图标2.png"));
                            Rectangle searchArea5 = new Rectangle(1059, 153, 224, 404);
                            double similarityThreshold5 = 0.9;
                            Point targetPoint5 = ImageFinder.findImage(targetImage5, searchArea5,
                                    similarityThreshold5);
                            if (targetPoint5 != null) {
                                LOGGER.info("找到宏图标2并开始拖拽");
                                robot.mouseMove(targetPoint5.x + targetImage5.getWidth() / 2, targetPoint5.y + targetImage5.getHeight() / 2);
                                robot.delay((int) v);
                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                robot.delay((int) v);
                                robot.mouseMove(602 + (int) v1, 857 + (int) v1); // 鼠标移动到xx坐标轴
                                robot.delay((int) v);
                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                Thread.sleep((int) v3); //延迟

                                LOGGER.info("完成宏图标2拖拽");

                            }

                        }


                    }
                    KeyUtil.pressKey(robot, KeyEvent.VK_U, -1);
                    LOGGER.info("关闭U");
                    ten_1 = 15;
                    LOGGER.info("进入15循环");
                }
            }//判断奥德宏按键位置是否正确，正确进入15，不正确经过设置后进入15
            if (ten_1 == 15) {
                Color color3 = robot1.getPixelColor(968, 860);

                if (color3.getRed() == 224) {
                    LOGGER.info("飞行药水位置正确");
                    LOGGER.info("开始设置K位置2");
                    BufferedImage targetImage10 = ImageIO.read(new File("D:/截图/正确截图/采集制作.png"));
                    Rectangle searchArea10 = new Rectangle(959, 23, 327, 480);
                    double similarityThreshold10 = 0.9;
                    Point targetPoint10 = ImageFinder.findImage(targetImage10, searchArea10,
                            similarityThreshold10);
                    if (targetPoint10 != null) {
                        LOGGER.info("找到采集制作图标");
                        robot.mouseMove(targetPoint10.x + targetImage10.getWidth() / 2+ (int) v1, targetPoint10.y + targetImage10.getHeight() / 2+ (int) v1);
                        robot.delay((int) v);
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                        robot.delay((int) v);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                        Thread.sleep((int) v3); //延迟
                        LOGGER.info("点击采集制作图标");


                    } else {
                        KeyUtil.pressKey(robot, KeyEvent.VK_K, -1);

                        LOGGER.info("没找到采集制作图标按K");
                        BufferedImage targetImage11 = ImageIO.read(new File("D:/截图/正确截图/采集制作.png"));
                        Rectangle searchArea11 = new Rectangle(959, 23, 327, 480);
                        double similarityThreshold11 = 0.9;
                        Point targetPoint11 = ImageFinder.findImage(targetImage11, searchArea11,
                                similarityThreshold11);
                        if (targetPoint11 != null) {
                            LOGGER.info("找到采集制作图标");
                            robot.mouseMove(targetPoint11.x + targetImage11.getWidth() / 2+ (int) v1, targetPoint11.y + targetImage11.getHeight() / 2+ (int) v1);
                            robot.delay((int) v);
                            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                            robot.delay((int) v);
                            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                            Thread.sleep((int) v3); //延迟
                            LOGGER.info("点击采集制作图标");
                        }

                    }
                    Thread.sleep((int) v3); //延迟



                    robot.mouseMove(1245 , 135) ; // 鼠标移动到xx坐标轴 把K拖下去
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseMove(1328 , 214); // 鼠标移动到xx坐标轴
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep((int) v3); //延迟
                    LOGGER.info("把K拖好");
                    ten_1 = 10;
                    LOGGER.info("进入10循环");
                } else {
                    KeyUtil.pressKey(robot, KeyEvent.VK_I, -1);
                    LOGGER.info("按I打开背包");
                    Rectangle screenRange3 = new Rectangle(994, 51, 407, 755);  // 屏幕范围
                    String keyword3 = "最上级风之秘药";
                    String folderPath3 = "D:\\截图\\最上级风之秘药前6排";  // 图片所在的文件夹路径
                    int similarity3 = 95;  // 图片相似度的阈值
                    robot.delay(1000);
                    ScreenSearcher searcher3 = new ScreenSearcher(screenRange3, keyword3, folderPath3, similarity3);
                    searcher3.execute();
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseMove(966 + (int) v1, 862 + (int) v1); // 鼠标移动到xx坐标轴
                    robot.delay((int) v);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    LOGGER.info("完成宏图标3拖拽");
                    KeyUtil.pressKey(robot, KeyEvent.VK_I, -1);
                    Thread.sleep((int) v3); //延迟
                    LOGGER.info("按I关闭背包");
                    Thread.sleep((int) v3); //延迟
                    LOGGER.info("开始设置K位置1");

                    BufferedImage targetImage10 = ImageIO.read(new File("D:/截图/正确截图/采集制作.png"));
                    Rectangle searchArea10 = new Rectangle(959, 23, 327, 480);
                    double similarityThreshold10 = 0.9;
                    Point targetPoint10 = ImageFinder.findImage(targetImage10, searchArea10,
                            similarityThreshold10);
                    if (targetPoint10 != null) {
                        LOGGER.info("找到采集制作图标");
                        robot.mouseMove(targetPoint10.x + targetImage10.getWidth() / 2+ (int) v1, targetPoint10.y + targetImage10.getHeight() / 2+ (int) v1);
                        robot.delay((int) v);
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                        robot.delay((int) v);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                        Thread.sleep((int) v3); //延迟
                        LOGGER.info("点击采集制作图标");


                    } else {
                        KeyUtil.pressKey(robot, KeyEvent.VK_K, -1);

                        LOGGER.info("没找到采集制作图标按K");
                        BufferedImage targetImage11 = ImageIO.read(new File("D:/截图/正确截图/采集制作.png"));
                        Rectangle searchArea11 = new Rectangle(959, 23, 327, 480);
                        double similarityThreshold11 = 0.9;
                        Point targetPoint11 = ImageFinder.findImage(targetImage11, searchArea11,
                                similarityThreshold11);
                        if (targetPoint11 != null) {
                            LOGGER.info("找到采集制作图标");
                            robot.mouseMove(targetPoint11.x + targetImage11.getWidth() / 2+ (int) v1, targetPoint11.y + targetImage11.getHeight() / 2+ (int) v1);
                            robot.delay((int) v);
                            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                            robot.delay((int) v);
                            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                            Thread.sleep((int) v3); //延迟
                            LOGGER.info("点击采集制作图标");
                        }

                    }
                    Thread.sleep((int) v3); //延迟



                    robot.mouseMove(1245, 135 ); // 鼠标移动到xx坐标轴 把K拖下去
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseMove(1328 , 214 ); // 鼠标移动到xx坐标轴
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep((int) v3); //延迟
                    LOGGER.info("把K拖好");

                    ten_1 = 10;
                    LOGGER.info("进入10循环");
                }
            }//判断是否需要设置背包按键（未完成，回城卷轴没确定是哪个城市的，只设置了飞行药）正确进入10循环，不正确设置完成后进入10循环
            if (ten_1 == 10) {

                LOGGER.info("进入10循环");


                BufferedImage targetImage10 = ImageIO.read(new File("D:/截图/正确截图/采集制作.png"));
                Rectangle searchArea10 = new Rectangle(959, 23, 327, 480);
                double similarityThreshold10 = 0.9;
                Point targetPoint10 = ImageFinder.findImage(targetImage10, searchArea10,
                        similarityThreshold10);
                if (targetPoint10 != null) {
                    LOGGER.info("ten10找到采集制作图标1");
                    robot.mouseMove(targetPoint10.x + targetImage10.getWidth() / 2+ (int) v1, targetPoint10.y + targetImage10.getHeight() / 2+ (int) v1);
                    robot.delay((int) v);
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                    Thread.sleep((int) v3); //延迟
                    LOGGER.info("点击采集制作图标1");


                } else {
                    KeyUtil.pressKey(robot, KeyEvent.VK_K, -1);

                    LOGGER.info("ten10没找到采集制作图标按K2");
                    BufferedImage targetImage11 = ImageIO.read(new File("D:/截图/正确截图/采集制作.png"));
                    Rectangle searchArea11 = new Rectangle(959, 23, 327, 480);
                    double similarityThreshold11 = 0.9;
                    Point targetPoint11 = ImageFinder.findImage(targetImage11, searchArea11,
                            similarityThreshold11);
                    if (targetPoint11 != null) {
                        LOGGER.info("找到采集制作图标2");
                        robot.mouseMove(targetPoint11.x + targetImage11.getWidth() / 2+ (int) v1, targetPoint11.y + targetImage11.getHeight() / 2+ (int) v1);
                        robot.delay((int) v);
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                        robot.delay((int) v);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                        Thread.sleep((int) v3); //延迟
                        LOGGER.info("点击采集制作图标2");
                    }

                }

                boolean condition1 = ColorChecker.checkColorAndExecuteCommand(robot, 1103, 319, 170, 143, 224,
                        () -> {});

                boolean condition2 = ColorChecker.checkColorAndExecuteCommand(robot, 1090, 320, 221, 217, 246,
                        () -> {});

                if (condition1 && condition2) {
                    Thread.sleep(1000); //延迟
                    LOGGER.info("ten10奥德采集图标出现");
                    Color color22 = robot1.getPixelColor(1330, 327);// 80%左右的位置是灰色
                    Color color23 = robot1.getPixelColor(1126, 304);//初级的初点2
                    Color color24 = robot1.getPixelColor(1119, 308);// 初级的初点1
                    if (color22.getRed() < 20 & color23.getRed() > 170 & color24.getRed() > 185) {
                        Thread.sleep(1000); //延迟
                        LOGGER.info("ten10判断奥德采集技能75级以下");
                        LOGGER.info("开始进入19循环");
                        ten_1 = 19;

                    }

                    if (color22.getGreen() > 134 & color23.getRed() > 170 & color24.getRed() > 185) {
                        Thread.sleep(1000); //延迟
                        LOGGER.info("ten10判断奥德采集技能75级以上");
                        Color color29 = robot1.getPixelColor(114, 756);//确定位置在莫点2
                        Color color31 = robot1.getPixelColor(112, 760);
                        Color color16 = robot1.getPixelColor(204, 886);
                        Color color32 = robot1.getPixelColor(208, 887);// 确定位置在莫尔点1
                        if (color29.getRed() > 160 & color16.getRed() > 145 & color32.getRed() > 135 & color31.getRed() > 115) {
                            LOGGER.info("确定位置在莫尔回城处并开始进入7循环");
                            ten_1 = 7;
                        }else{
                            LOGGER.info("确定位置不在莫尔回城处点回城卷并开始进入7循环");
                            MouseUtil.moveWithCurve(robot, 844, 817);
                            robot.delay(15000);
                            ten_1 = 7;
                        }


                    }
                    boolean condition5 = ColorChecker.checkColorAndExecuteCommand(robot, 1122, 303, 214, 213, 174,
                            () -> {});

                    boolean condition6 = ColorChecker.checkColorAndExecuteCommand(robot, 1122, 309, 198, 197, 163,
                            () -> {});


                    if (condition5 && condition6) {
                        LOGGER.info("ten10判断中级未到199准备进入ten7");
                        Color color29 = robot1.getPixelColor(114, 756);//确定位置在莫点2
                        Color color31 = robot1.getPixelColor(112, 760);
                        Color color16 = robot1.getPixelColor(204, 886);
                        Color color32 = robot1.getPixelColor(208, 887);// 确定位置在莫尔点1
                        if (color29.getRed() > 160 & color16.getRed() > 145 & color32.getRed() > 135 & color31.getRed() > 115) {
                            LOGGER.info("10循环确定位置在莫尔回城处并开始进入7循环");
                            ten_1 =7 ;

                        }else{
                            LOGGER.info("确定位置不在莫尔回城处点回城卷并开始进入7循环");
                            MouseUtil.moveWithCurve(robot, 844, 817);
                            robot.delay(15000);
                            ten_1 =7 ;


                        }



                    }
                    boolean condition7 = ColorChecker.checkColorAndExecuteCommand(robot, 1124, 311, 189, 188, 156,
                            () -> {});//上级的上

                    boolean condition8 = ColorChecker.checkColorAndExecuteCommand(robot, 1119, 311, 189, 188, 156,
                            () -> {});//上级的上

                    if (condition7 && condition8) {

                        Color color29 = robot1.getPixelColor(237, 758);//确定位置在贝鲁点2
                        Color color31 = robot1.getPixelColor(238, 761);
                        Color color16 = robot1.getPixelColor(274, 801);
                        Color color32 = robot1.getPixelColor(278, 801);// 确定位置在贝鲁点1
                        if (color29.getRed() > 159 & color16.getRed() > 153 & color32.getRed() > 112 & color31.getRed() > 156) {
                            LOGGER.info("10循环确定位置在莫尔回城处并开始进入22循环");
                            ten_1=22;
                        }else{
                            LOGGER.info("判断不在贝鲁回城处吃卷轴");
                            MouseUtil.moveWithCurve(robot, 885, 817);
                            LOGGER.info("点击A0休息15秒并开始进入22循环");
                            robot.delay(15000);
                            ten_1=22;

                        }




                    }
                    Color color20 = robot1.getPixelColor(1125, 303);//高级的高2
                    Color color18 = robot1.getPixelColor(1118, 309);// 高级的高1
                    if ( color20.getRed() > 176 & color18.getRed() > 185) {
                        LOGGER.info("10循环判断奥德等级高级");
                        boolean condition9 = ColorChecker.checkColorAndExecuteCommand(robot, 1388, 190, 214, 212, 174,
                                () -> {});//难民村的村1

                        boolean condition10 = ColorChecker.checkColorAndExecuteCommand(robot, 1382, 190, 215, 213, 175,
                                () -> {});//难民村的村2

                        if (condition9 && condition10) {
                            LOGGER.info("确定位置在难民村开始进入24循环");
                            ten_1=24;


                        }else{
                            LOGGER.info("确定位置不在难民村开始点击89回城");
                            boolean condition3 = false;
                            boolean condition4 = false;

                            while (!condition3 || !condition4) {
                                // 模拟按下键 8
                                int delayBetweenKeyPresses = 100 + random.nextInt(301);
                                int delayBetweenKeyPresses1 = 300 + random.nextInt(301);
                                int delayBetweenKeyPresses2 = 500 + random.nextInt(100);
                                robot.keyPress(KeyEvent.VK_8);
                                robot.delay(delayBetweenKeyPresses); // 延迟，以确保按键被识别
                                robot.keyRelease(KeyEvent.VK_8);

                                // 生成 100-400 毫秒的随机延迟

                                robot.delay(delayBetweenKeyPresses1);

                                // 模拟按下键 9
                                robot.keyPress(KeyEvent.VK_9);
                                robot.delay(delayBetweenKeyPresses);// 延迟，以确保按键被识别
                                robot.keyRelease(KeyEvent.VK_9);
                                robot.delay(delayBetweenKeyPresses2);

                                // 检查条件
                                condition3 = ColorChecker.checkColorAndExecuteCommand(robot, 625, 705, 23, 30, 41, () -> {});
                                condition4 = ColorChecker.checkColorAndExecuteCommand(robot, 813, 705, 23, 30, 41, () -> {});

                                // 如果条件不满足，休眠 100 毫秒
                                if (!condition3 || !condition4) {
                                    try {
                                        Thread.sleep(500);
                                    } catch (InterruptedException e) {
                                        Thread.currentThread().interrupt();
                                    }
                                }
                            }
                            LOGGER.info("等待20秒");
                            robot.delay(20000);
                            Color color1 = robot1.getPixelColor(516, 836);
                            Color color19 = robot1.getPixelColor(575, 838);       //判断游戏画面点1出现(游戏是否在线)
                            if (color1.getRed() > 58&color1.getRed() < 75&color1.getGreen() > 69&color1.getGreen() <85&color1.getBlue() > 98
                                    &color1.getBlue() < 111&color19.getRed() > 53&color19.getRed() < 63&color19.getGreen() > 61&color19.getGreen() <72
                                    &color19.getBlue() > 91 &color19.getBlue() < 99) {
                                LOGGER.info("游戏画面出现");
                                boolean condition11 = ColorChecker.checkColorAndExecuteCommand(robot, 1388, 190, 214, 212, 174,
                                        () -> {});//难民村的村1

                                boolean condition12 = ColorChecker.checkColorAndExecuteCommand(robot, 1382, 190, 215, 213, 175,
                                        () -> {});//难民村的村2
                                Color color201 = robot1.getPixelColor(1388, 190);//高级的高2
                                System.out.println("Color at (1388, 190): " + color201);
                                Color color181= robot1.getPixelColor(1382, 190);
                                System.out.println("Color at (1382, 190): " + color181);

                            if (condition11 && condition12) {
                                LOGGER.info("确定位置在难民村开始进入24循环");
                                ten_1=24;


                            }else{
                                LOGGER.info("回程后位置不在难民村进入18循环定点");
                                ten_1=18;

                            }
                        }}

              }


                }else{
                    LOGGER.info("判断奥德采集图标未出现");
                    Thread.sleep(1000); //延迟
                    ten_1 = 8;
                    LOGGER.info("进入8循环");
                }





            }//判断奥德K出现没，没出现进入8重新设置，出现了判断空采等级决定是去练级还是采集，练级进入相应的练级循环中（未完成没写进入莫尔等）

            if (ten_1 == 19) {

                Thread.sleep(1000); //延迟
                Color color29 = robot1.getPixelColor(273, 733);//确定位置在阿尔点2
                Color color31 = robot1.getPixelColor(37, 691);
                Color color16 = robot1.getPixelColor(34, 695);
                Color color30 = robot1.getPixelColor(278, 733);// 确定位置在阿尔点1
                if (color29.getRed() > 140 & color16.getRed() > 150 & color30.getRed() > 145 & color31.getRed() > 145) {
                    Color color11 = robot1.getPixelColor(368, 434);  //判断v挡板位置正确

                    Color color10 = robot1.getPixelColor(11, 615); //

                    if (color11.getRed() == 255 & color10.getRed() > 137){
                        LOGGER.info("ten7step1判断V挡板小地图正确");
                        Color color21 = robot1.getPixelColor(1255, 214);
                        if ( color21.getRed() == 185){
                            LOGGER.info("ten7step1检测K出现");
                            robot.mouseMove(967 + (int) v1, 768 + (int) v1); // 鼠标移动到xx坐标轴 点击阻止
                            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                            robot.delay(50);
                            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                            robot.delay(200);
                            robot.delay(500);

                            LOGGER.info("按c+=定奇斯克1");

                            Thread.sleep(2000);
                            Color color1 = robot1.getPixelColor(600, 410);
                            Color color2 = robot1.getPixelColor(790, 510);
                            if (color1.getRed() > 169 & color2.getRed() > 194){
                                LOGGER.info("奇斯克定点提示出现");

                                MouseUtil.moveWithCurve(robot, 788, 512);
                                LOGGER.info("按c+=定奇斯克点确定");


                                ten_1 = 4;
                                LOGGER.info("定好奇斯克进入4循环");
                            }else {


                                ten_1 = 4;
                                LOGGER.info("奇斯克定点提示未出现进入4循环");
                            }


                        }else{
                            LOGGER.info("ten7step1检测K没出现点K");
                            KeyUtil.pressKey(robot, KeyEvent.VK_K, -1);

                        }

                    }else {
                        LOGGER.info("ten7step1检测VN没出现调整画面");
                        Thread.sleep(200);

                        KeyUtil.pressKey(robot, KeyEvent.VK_V, -1);
                        KeyUtil.pressKey(robot, KeyEvent.VK_N, -1);
                        KeyUtil.pressKey(robot, KeyEvent.VK_N, -1);
                        KeyUtil.pressKey(robot, KeyEvent.VK_N, -1);
                        LOGGER.info("ten7step2调整好画面设置");
                        Thread.sleep(1000);
                    }


                } else { //人没有回阿尔空采初始点点卷轴位置 暂时点卷轴，后面改回城
                    LOGGER.info("确定位置不在阿尔回城处点A+8回城卷轴");
                    KeyUtil.pressKey(robot, KeyEvent.VK_ALT, KeyEvent.VK_8);
                    Thread.sleep(15000); //延迟
                    LOGGER.info("等待15秒");

                }

            }//奥德技能75级以下，在阿尔采，确定位置是否在阿尔复活点，是的话走到第一个点底下，开始3循环

            if (ten_1 == 4) {
                final Counter[] ten_3 = {new Counter(0)};
                LOGGER.info("初始化3");

                outerLoop1:

                for (;;) {

                    LOGGER.info("进入4循环");
                    Color color2333 = robot1.getPixelColor(964, 849);
                    Color color199 = robot1.getPixelColor(1178, 831);

                    Color color208 = robot1.getPixelColor(153, 753);
                    Color color209 = robot1.getPixelColor(616, 661);
                    Color color210 = robot1.getPixelColor(1159, 825);

                    if (color2333.getRed() > 200 & color199.getGreen() < 60) {
                        LOGGER.info("ten4判断可以吃药和恢复飞行技能");
                        robot1.keyPress(KeyEvent.VK_EQUALS);//按住enter
                        robot1.delay(c);//按住一秒1秒后
                        robot1.keyRelease(KeyEvent.VK_EQUALS);
                        robot1.delay(c);
                        robot1.keyPress(KeyEvent.VK_0);
                        robot1.delay(c);//按住一秒1秒后
                        robot1.keyRelease(KeyEvent.VK_0);
                        LOGGER.info("点击=和0吃药和恢复飞行技能");
                    }
                    if (color210.getGreen() < 30 ) {
                        LOGGER.info("ten4判断飞行时间不够");
                        robot1.keyRelease(KeyEvent.VK_W);
                        Thread.sleep(c);
                        robot1.keyRelease(KeyEvent.VK_D);
                        LOGGER.info("关掉W和D并开始下降10秒");
                        robot.keyPress(KeyEvent.VK_F);//按下键盘按键 上升
                        robot.delay(15000);//按住延迟
                        robot.keyRelease(KeyEvent.VK_F); //释放键盘按键
                        Thread.sleep(200); //延迟
                        LOGGER.info("等待飞行时间恢复");
                        for(;;){
                        boolean condition1 = ColorChecker.checkColorAndExecuteCommand(robot, 1162, 825, 41, 117, 5,
                                () -> {});
                        if (condition1) {
                            LOGGER.info("飞行时间已恢复满");
                            Color color111 = robot1.getPixelColor(1160, 845);

                            if (color111.getRed() > 184) {
                                LOGGER.info("检测是可飞行地区");
                                Color color29 = robot1.getPixelColor(273, 733);//确定位置在阿尔点2
                                Color color31 = robot1.getPixelColor(37, 691);
                                Color color16 = robot1.getPixelColor(34, 695);
                                Color color30 = robot1.getPixelColor(278, 733);// 确定位置在阿尔点1
                                if (color29.getRed() > 140 & color16.getRed() > 150 & color30.getRed() > 145 & color31.getRed() > 145) {
                                    LOGGER.info("检测已回城从ten4step1重新开始");
                                    ten_step = 1;
                                    break;
                                }       //如果是超时需要这一步，其他地方采记得改这里

                            LOGGER.info("开始起飞");
                            KeyUtil.pressKey(robot, KeyEvent.VK_R,-1 );
                            KeyUtil.pressKey(robot, KeyEvent.VK_F,-1 );
                            LOGGER.info("停止前进并点击起飞按键");
                            MouseUtil.moveWithCurve(robot, 1160+ (int) v1, 850+ (int) v1);
                            Thread.sleep(1000); //延迟
                            robot.delay(4500);//按住延迟
                            LOGGER.info("开始上升");
                            robot.keyPress(KeyEvent.VK_R);//按下键盘按键 上升
                            robot.delay(2000);//按住延迟
                            robot.keyRelease(KeyEvent.VK_R); //释放键盘按键
                            Thread.sleep(200); //延迟
                            LOGGER.info("开始进入step3");
                            ten_step = 3;
                            break;
                        }else{
                                for(;;){
                                LOGGER.info("检测是禁飞行地区");
                                robot1.keyPress(KeyEvent.VK_SPACE);
                                robot1.delay(300);
                                robot1.keyRelease(KeyEvent.VK_SPACE);
                                robot.delay(100);
                                robot.mouseMove(1160 + (int) v1, 850 + (int) v1); //
                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                robot.delay(20);
                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                LOGGER.info("跳跃起飞");
                                robot.delay(2000);
                                Color color22 = robot1.getPixelColor(1162, 836);

                                if (color22.getRed() > 184) {
                                    LOGGER.info("检测已经不在禁飞行地区");
                                    LOGGER.info("开始点R上升");
                                    robot.keyPress(KeyEvent.VK_R);//按下键盘按键 上升
                                    robot.delay(2000);//按住延迟
                                    LOGGER.info("上升2秒");
                                    robot.keyPress(KeyEvent.VK_W);//按下键盘按键 上升
                                    robot.keyPress(KeyEvent.VK_D);//按下键盘按键 上升
                                    robot.delay((int) v4);//按住延迟
                                    LOGGER.info("上升2秒");
                                    robot.keyRelease(KeyEvent.VK_D);
                                    robot.delay(2000);
                                    robot.keyRelease(KeyEvent.VK_W);
                                    robot.keyRelease(KeyEvent.VK_R);
                                    LOGGER.info("开始进入ten_step =3");

                                    ten_step =3;
                                    break outerLoop1;
                                }
                                    LOGGER.info("等待12秒");
                                    Thread.sleep(12000);

                                }


                            }
                        }
                            Thread.sleep(1000);

                    }}
                    boolean condition5 = ColorChecker.checkColorAndExecuteCommand(robot, 1196, 111, 249, 244, 202,
                            () -> {});
                    boolean condition6 = ColorChecker.checkColorAndExecuteCommand(robot, 1193, 114, 21, 34, 42,
                            () -> {});


                    if (condition5&condition6) {

                        LOGGER.info("ten4判断虚弱");
                        robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                        robot.delay(50);
                        robot.keyRelease(KeyEvent.VK_E);
                        robot.delay(50);
                        robot.keyRelease(KeyEvent.VK_Q);
                        robot.delay(50);//按住延迟
                        robot.keyRelease(KeyEvent.VK_D);
                        robot.delay(50);//按住延迟
                        robot.keyRelease(KeyEvent.VK_A);
                        LOGGER.info("开始进入ten4step1循环");
                        ten_step = 1;
                        break;
                    }
                    Color color22 = robot1.getPixelColor(1330, 327);// 80%左右的位置是灰色
                    Color color23 = robot1.getPixelColor(1126, 304);//初级的初点2
                    Color color24 = robot1.getPixelColor(1119, 308);// 初级的初点1
                    if (color22.getGreen() > 134 & color23.getRed() > 170 & color24.getRed() > 185) {

                        LOGGER.info("进入ten7step1");
                        robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                        robot.delay(50);
                        robot.keyRelease(KeyEvent.VK_E);
                        robot.delay(50);
                        robot.keyRelease(KeyEvent.VK_Q);
                        robot.delay(50);//按住延迟
                        robot.keyRelease(KeyEvent.VK_D);
                        robot.delay(50);//按住延迟
                        robot.keyRelease(KeyEvent.VK_A);
                        LOGGER.info("关掉W和D并开始下降10秒");
                        robot.keyPress(KeyEvent.VK_F);//按下键盘按键 下降
                        robot.delay(15000);//按住延迟
                        robot.keyRelease(KeyEvent.VK_F); //释放键盘按键
                        Thread.sleep(200); //延迟
                        LOGGER.info("开始关翅膀");
                        robot.keyPress(KeyEvent.VK_PAGE_DOWN);//按下键盘按键 上升
                        robot.delay(50);//按住延迟
                        robot.keyRelease(KeyEvent.VK_PAGE_DOWN); //释放键盘按键
                        LOGGER.info("点A+8吃卷轴回城");
                        KeyUtil.pressKey(robot, KeyEvent.VK_ALT, KeyEvent.VK_9);
                        LOGGER.info("开始进入ten1=7循环");
                        ten_1 = 7;
                        break outerLoop1;

                    }

                    if (ten_step == 1) {

                        //去的路径
                        LOGGER.info("进入ten4step7");

                        if (color208.getRed() > 230) {

                            if (condition5&condition6) {
                                LOGGER.info("判断有虚弱休息240秒");
                                robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_E);
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_Q);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_D);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_A);
                                Thread.sleep(240000);
                            }
                            LOGGER.info("往前走");
                            Thread.sleep(500); //延迟
                            robot1.keyPress(KeyEvent.VK_W);//往前走
                            Color color32 = robot1.getPixelColor(248, 775); // 走到既定点停止起飞上升
                            if (color32.getRed() > 140) {
                                LOGGER.info("判断走到起飞点附近");

                                Thread.sleep(200); //延迟
                                robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                                KeyUtil.pressKey(robot, KeyEvent.VK_R,-1 );
                                KeyUtil.pressKey(robot, KeyEvent.VK_F,-1 );
                                LOGGER.info("停止前进并点击起飞按键");
                                MouseUtil.moveWithCurve(robot, 1160+ (int) v1, 850+ (int) v1);
                                Thread.sleep(1000); //延迟
                                LOGGER.info("开始点R上升");
                                robot.keyPress(KeyEvent.VK_R);//按下键盘按键 上升
                                robot.delay(4500);//按住延迟
                                LOGGER.info("上升4.5秒停止");
                                robot.keyRelease(KeyEvent.VK_R); //释放键盘按键
                                Thread.sleep(200); //延迟
                                ten_step = 3;
                                LOGGER.info("开始进入step = 3");
                            }
                        } else {
                            LOGGER.info("角度不对开始转向2");
                            robot1.keyPress(KeyEvent.VK_D);
                            robot1.delay(10);
                            robot1.keyRelease(KeyEvent.VK_D);
                            Thread.sleep(200);
                            LOGGER.info("开始回到step = 1");
                            ten_step = 1;
                        }

                    }
                    if (ten_step == 2){

                            LOGGER.info("进入ten4step2");
                        robot1.keyRelease(KeyEvent.VK_W);
                        Thread.sleep(c);
                        robot1.keyRelease(KeyEvent.VK_D);
                        LOGGER.info("关掉W和D并开始下降10秒");
                        robot.keyPress(KeyEvent.VK_F);//按下键盘按键 上升
                        robot.delay(15000);//按住延迟
                        robot.keyRelease(KeyEvent.VK_F); //释放键盘按键
                        Thread.sleep(200); //延迟
                        LOGGER.info("等待飞行时间恢复");
                        for(;;){
                            boolean condition1 = ColorChecker.checkColorAndExecuteCommand(robot, 1162, 825, 41, 117, 5,
                                    () -> {});
                            if (condition1) {
                                LOGGER.info("飞行时间已恢复满");
                                Color color111 = robot1.getPixelColor(1160, 845);



                                if (color111.getRed() > 184) {
                                    LOGGER.info("检测是可飞行地区");
                                    Color color29 = robot1.getPixelColor(273, 733);//确定位置在阿尔点2
                                    Color color31 = robot1.getPixelColor(37, 691);
                                    Color color16 = robot1.getPixelColor(34, 695);
                                    Color color30 = robot1.getPixelColor(278, 733);// 确定位置在阿尔点1
                                    if (color29.getRed() > 140 & color16.getRed() > 150 & color30.getRed() > 145 & color31.getRed() > 145) {
                                        LOGGER.info("检测已回城从ten4step1重新开始");
                                        ten_step = 1;
                                        break;
                                    }       //如果是超时需要这一步，其他地方采记得改这里

                                    LOGGER.info("开始起飞");
                                    KeyUtil.pressKey(robot, KeyEvent.VK_R,-1 );
                                    KeyUtil.pressKey(robot, KeyEvent.VK_F,-1 );
                                    LOGGER.info("停止前进并点击起飞按键");
                                    MouseUtil.moveWithCurve(robot, 1160+ (int) v1, 850+ (int) v1);
                                    Thread.sleep(1000); //延迟
                                    robot.delay(4500);//按住延迟
                                    LOGGER.info("开始上升");
                                    robot.keyPress(KeyEvent.VK_R);//按下键盘按键 上升
                                    robot.delay(2000);//按住延迟
                                    robot.keyRelease(KeyEvent.VK_R); //释放键盘按键
                                    Thread.sleep(200); //延迟
                                    LOGGER.info("开始进入step3");
                                    ten_step = 3;
                                    break;
                                }else{
                                    for(;;){
                                        LOGGER.info("检测是禁飞行地区");
                                        robot1.keyPress(KeyEvent.VK_SPACE);
                                        robot1.delay(300);
                                        robot1.keyRelease(KeyEvent.VK_SPACE);
                                        robot.delay(100);
                                        robot.mouseMove(1160 + (int) v1, 850 + (int) v1); //
                                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                        robot.delay(20);
                                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                        LOGGER.info("跳跃起飞");
                                        robot.delay(2000);
                                        Color color202 = robot1.getPixelColor(1162, 836);

                                        if (color202.getRed() > 184) {
                                            LOGGER.info("检测已经不在禁飞行地区");
                                            LOGGER.info("开始点R上升");
                                            robot.keyPress(KeyEvent.VK_R);//按下键盘按键 上升
                                            robot.delay(2000);//按住延迟
                                            LOGGER.info("上升2秒");
                                            robot.keyPress(KeyEvent.VK_W);//按下键盘按键 上升
                                            robot.keyPress(KeyEvent.VK_D);//按下键盘按键 上升
                                            robot.delay((int) v4);//按住延迟
                                            LOGGER.info("上升2秒");
                                            robot.keyRelease(KeyEvent.VK_D);
                                            robot.delay(2000);
                                            robot.keyRelease(KeyEvent.VK_W);
                                            robot.keyRelease(KeyEvent.VK_R);
                                            LOGGER.info("开始进入ten_step =3");

                                            ten_step =3;
                                            break outerLoop1;
                                        }
                                        LOGGER.info("等待12秒");
                                        Thread.sleep(12000);

                                    }


                                }
                            }
                            Thread.sleep(1000);

                        }

                    }

                    if (ten_step == 3) {
                        LOGGER.info("进入ten4step3");
                        Rectangle screenRange = new Rectangle(1267, 12, 167, 167);
                        String keyword = "小地图奥德图标";
                        String folderPath = "D:/截图/正确截图";
                        int similarity = 95;
                        int n = 1; // 获取第一近的点
                        int keyToPress = KeyEvent.VK_6; // 按下并释放的键 (例如 6)
                        long delayAfterCombinedMethod = CombinedTask.combinedMethod(screenRange, keyword, folderPath, similarity, n, keyToPress);
                        LOGGER.info("ten4step3找最近的点");

                        Thread.sleep(c);
                        LOGGER.info("ten4step3开始进入step7");
                        ten_step = 7;
                    }
                    if (ten_step == 4) {
                        LOGGER.info("进入ten4step4");// 10次没采到
                        Rectangle screenRange = new Rectangle(1267, 12, 167, 167);
                        String keyword = "小地图奥德图标";
                        String folderPath = "D:/截图/正确截图";
                        int similarity = 95;
                        int n = 2; // 获取第二近的点
                        int keyToPress = KeyEvent.VK_6; // 按下并释放的键 (例如 6)
                        long delayAfterCombinedMethod = CombinedTask.combinedMethod(screenRange, keyword, folderPath, similarity, n, keyToPress);
                        LOGGER.info("ten4step4找第二近的点");

                        Thread.sleep(c);
                        ten_step = 7;

                    }
                    if (ten_step == 5) {

                        LOGGER.info("进入ten4step5");

                        Color color4 = robot1.getPixelColor(616, 661);
                        if (color4.getRed() > 210) {
                            System.out.println("Color at (616, 661): " + color4);
                            ten_3[0].setValue(1);

                            LOGGER.info("ten2=14step5成功率出现等待");


                        }else{
                            LOGGER.info("ten2=14step5成功率未出现按6");
                            robot1.delay(200);

                            robot1.keyPress(KeyEvent.VK_6);                //如果没采集
                            robot1.delay(c);
                            robot1.keyRelease(KeyEvent.VK_6);

                            Color color1 = robot1.getPixelColor(787, 309);
                            Color color2 = robot1.getPixelColor(770, 309);
                            if (color1.getRed() > 251 & color2.getRed() > 251){
                                LOGGER.info("ten2=14step5周围没有奥德出现去step3");
                                robot1.delay(c);
                                robot1.keyPress(KeyEvent.VK_A);
                                robot1.delay(c);
                                robot1.delay(1000);
                                robot1.keyRelease(KeyEvent.VK_A);
                                robot1.delay(2500);
                                ten_step = 3;
                                break ;
                            }
                            robot1.delay(1000);
                            ten_step = 5;
                        }

                    }
                    if (ten_step == 6) {
                        robot1.keyPress(KeyEvent.VK_W);
                        robot1.keyPress(KeyEvent.VK_D);
                        robot1.delay(1000);
                        robot1.keyRelease(KeyEvent.VK_D);
                        robot1.delay(1000);
                        robot1.keyPress(KeyEvent.VK_W);
                        Thread.sleep(c);

                    }
                    if (ten_step == 7) {
                        LOGGER.info("step7进入循环");
                        robot1.delay(200);

                        robot1.keyPress(KeyEvent.VK_6);                //如果没采集
                        robot1.delay(c);
                        robot1.keyRelease(KeyEvent.VK_6);
                        robot1.delay(1000);
                        LOGGER.info("step7进入循环按6");


                        for(;;){
                            LOGGER.info("step7进入for循环");
                            if (ten_step != 7) {
                                break;
                            }

                            int[][] colors = {
                                    {787, 309, 255, 234, 183},//找不到奥德目标
                                    {770, 309, 255, 234, 183},
                                    {791, 309, 255, 234, 183},//等级不够采不到
                                    {706, 309, 255, 234, 183},
                                    {761, 307, 255, 234, 183},//其他人在采集
                                    {722, 312, 255, 234, 183},// x1, y1, red1
                            };
                            int timeoutSeconds = 20;
                            int keyDelayMin = 600;
                            int keyDelayMax = 900;
                            AtomicBoolean stopChecking = new AtomicBoolean(false);
                            int color5X = 616;
                            int color5Y = 661;

                            CustomState customState = new CustomState();
                            double finalV = v2;
                            double finalV1 = v3;
                            double finalV2 = v7;
                            Runnable commandA = () -> {
                                LOGGER.info("step7周围没有可采奥德重复一次");
                                ten_3[0].increment();

                                if (ten_3[0].getValue() % 3 == 0) {
                                    Runnable bCommand = () -> {
                                        while (!Thread.currentThread().isInterrupted()) {
                                            LOGGER.info("判断ten4step7是否可以吃药");
                                            Color color23331 = robot1.getPixelColor(964, 849);
                                            Color color1991 = robot1.getPixelColor(1178, 831);

                                            if (color23331.getRed() > 200 & color1991.getGreen() < 60) {
                                                LOGGER.info("ten4判断可以吃药和恢复飞行技能");
                                                robot1.keyPress(KeyEvent.VK_EQUALS);//按住enter
                                                robot1.delay(c);//按住一秒1秒后
                                                robot1.keyRelease(KeyEvent.VK_EQUALS);
                                                robot1.delay(c);
                                                robot1.keyPress(KeyEvent.VK_0);
                                                robot1.delay(c);//按住一秒1秒后
                                                robot1.keyRelease(KeyEvent.VK_0);
                                                LOGGER.info("点击=和0吃药和恢复飞行技能");
                                            }
                                            Color color2101 = robot1.getPixelColor(1155, 826);
                                            if (color2101.getGreen() < 30 ) {
                                                LOGGER.info("判断1ten4step7没有飞行时间准备进入ten_step = 2");
                                                ten_step = 2;
                                                break ;
                                            }
                                            Color color29 = robot1.getPixelColor(273, 733);//确定位置在阿尔点2
                                            Color color31 = robot1.getPixelColor(37, 691);
                                            Color color16 = robot1.getPixelColor(34, 695);
                                            Color color30 = robot1.getPixelColor(278, 733);// 确定位置在阿尔点1
                                            if (color29.getRed() > 140 & color16.getRed() > 150 & color30.getRed() > 145 & color31.getRed() > 145) {
                                                LOGGER.info("ten4step7ten_3[0].getValue() == 3确定位置在阿尔准备进入step1");
                                                ten_step = 1;
                                                break ;
                                            }
                                            try {
                                                Thread.sleep(1000);
                                            } catch (InterruptedException e) {
                                                Thread.currentThread().interrupt();
                                            }
                                        }
                                    };

// 创建并启动B命令线
                                    Thread bCommandThread = new Thread(bCommand);
                                    bCommandThread.start();
                                    if (ten_3[0].getValue() <= 15) {                        // 3的倍数没采到
                                        // 创建包含B命令的Runnable

                                        System.out.println("2执行 D命令，ten_3 = " + ten_3[0].getValue());
// 执行A命令的代码
                                        robot1.keyPress(KeyEvent.VK_W);
                                        robot1.keyPress(KeyEvent.VK_D);
                                        robot1.delay(500);
                                        robot1.keyRelease(KeyEvent.VK_D);
                                        robot1.delay((int) finalV2);
                                        robot1.keyPress(KeyEvent.VK_W);
                                        robot1.delay(100);


                                        bCommandThread.interrupt();
                                        System.out.println("Before setting ten_step to 3");
                                        ten_step = 3;
                                        return;
// A命令执行完毕后，终止B命令线程

                                    }
                                    if (ten_3[0].getValue() >= 15 && ten_3[0].getValue() <= 30) {


                                        System.out.println("2执行 A 命令，ten_3 = " + ten_3[0].getValue());
                                        robot1.keyPress(KeyEvent.VK_W);
                                        robot1.keyPress(KeyEvent.VK_A);
                                        robot1.delay(500);
                                        robot1.keyRelease(KeyEvent.VK_A);
                                        robot1.delay((int) finalV2);
                                        robot1.keyPress(KeyEvent.VK_W);
                                        robot1.delay(100);
                                        LOGGER.info("2开始进入ten4step3");
                                        ten_step = 3;
                                        return;

                                    }
                                    if (ten_3[0].getValue() == 33) {                         // 33次没采到
                                        System.out.println("周围没有奥德准备摔死，ten_3 = " + ten_3[0].getValue());
                                        robot1.keyPress(KeyEvent.VK_R);                //如果没采集
                                        robot1.delay(10000);
                                        robot1.keyRelease(KeyEvent.VK_R);
                                        robot1.delay(100);
                                        robot.mouseMove(1160 + (int) v1, 850 + (int) v1); //
                                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                        robot.delay(20);
                                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                        ten_3[0].setValue(1);
                                        robot1.delay(20000);


                                        boolean condition3;
                                        boolean condition4;
                                        boolean condition9;
                                        boolean condition10;

                                        while (true) {
                                            // 获取颜色值
                                            Color color29 = robot1.getPixelColor(625, 705);
                                            Color color31 = robot1.getPixelColor(813, 705);
                                            Color color28 = robot1.getPixelColor(1196, 111);
                                            Color color30 = robot1.getPixelColor(1193, 114);

                                            System.out.println("3Color at (625, 705): " + color29);
                                            System.out.println("3Color at (813, 705): " + color31);
                                            System.out.println("3Color at (1196, 111): " + color28);
                                            System.out.println("3Color at (1193, 114): " + color30);


                                            // 检查条件
                                            condition3 = (color29.getRed() >= 23 - 4 && color29.getRed() <= 23 + 4) &&
                                                    (color29.getGreen() >= 30 - 4 && color29.getGreen() <= 30 + 4) &&
                                                    (color29.getBlue() >= 41 - 4 && color29.getBlue() <= 41 + 4);

                                            condition4 = (color31.getRed() >= 23 - 4 && color31.getRed() <= 23 + 4) &&
                                                    (color31.getGreen() >= 30 - 4 && color31.getGreen() <= 30 + 4) &&
                                                    (color31.getBlue() >= 41 - 4 && color31.getBlue() <= 41 + 4);

                                            condition9 = (color28.getRed() >= 249 - 4 && color28.getRed() <= 249 + 4) &&
                                                    (color28.getGreen() >= 244 - 4 && color28.getGreen() <= 244 + 4) &&
                                                    (color28.getBlue() >= 202 - 4 && color28.getBlue() <= 202 + 4);

                                            condition10 = (color30.getRed() >= 21 - 4 && color30.getRed() <= 21 + 4) &&
                                                    (color30.getGreen() >= 34 - 4 && color30.getGreen() <= 34 + 4) &&
                                                    (color30.getBlue() >= 42 - 4 && color30.getBlue() <= 42 + 4);

                                            // 如果满足条件，则跳出循环
                                            if ((condition3 && condition4) || (condition9 && condition10)) {
                                                break;
                                            }

                                            // 如果条件不满足，继续执行循环中的其他操作
                                            int delayBetweenKeyPresses = 100 + random.nextInt(301);
                                            int delayBetweenKeyPresses1 = 500 + random.nextInt(500);
                                            int delayBetweenKeyPresses2 = 500 + random.nextInt(100);
                                            robot.keyPress(KeyEvent.VK_8);
                                            robot.delay(delayBetweenKeyPresses); // 延迟，以确保按键被识别
                                            robot.keyRelease(KeyEvent.VK_8);

                                            // 生成 100-400 毫秒的随机延迟

                                            robot.delay(delayBetweenKeyPresses1);

                                            // 模拟按下键 9
                                            robot.keyPress(KeyEvent.VK_9);
                                            robot.delay(delayBetweenKeyPresses);// 延迟，以确保按键被识别
                                            robot.keyRelease(KeyEvent.VK_9);
                                            robot.delay(delayBetweenKeyPresses2);

                                            // 休眠 300 毫秒
                                            try {
                                                Thread.sleep(300);
                                            } catch (InterruptedException e) {
                                                Thread.currentThread().interrupt();
                                            }
                                        }
                                        robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                                        robot.delay(50);
                                        robot.keyRelease(KeyEvent.VK_E);
                                        robot.delay(50);
                                        robot.keyRelease(KeyEvent.VK_Q);
                                        robot.delay(50);//按住延迟
                                        robot.keyRelease(KeyEvent.VK_D);
                                        robot.delay(50);//按住延迟
                                        robot.keyRelease(KeyEvent.VK_A);//释放键盘按键
                                        LOGGER.info("ten4step7ten_3[0].getValue() == 9点9回城条出现释放WADQE等待25秒");
                                        robot.delay(25000);
                                        LOGGER.info("ten4step7ten_3[0].getValue() == 9点9回城条出现释放WADQE等待25秒完毕");


                                    }


                                }


                                robot1.delay(c);
                                LOGGER.info("ten4step7准备进入ten4steap4");

                                ten_step = 4;
                                return;

                            };
                            Optional<Runnable> commandB = Optional.empty();

                            Supplier<Boolean> stopCondition = () -> {
                                try {
                                    Robot robot2 = new Robot();
                                    Color color5 = robot2.getPixelColor(color5X, color5Y);

                                    Color color121 = robot1.getPixelColor(553, 380);
                                    System.out.println("Color at (553, 380): " + color121);
                                    Color color122 = robot1.getPixelColor(562, 381);
                                    System.out.println("Color at (562, 381): " + color122);
                                    Color color8 = robot2.getPixelColor(1196, 111);
                                    System.out.println("Color at (1196, 111): " + color8);
                                    Color color9 = robot2.getPixelColor(1193, 114);
                                    System.out.println("Color at (1193, 114): " + color9);
                                    Color color10 = robot2.getPixelColor(625, 705);
                                    System.out.println("Color at (608, 699): " + color10);
                                    Color color11 = robot2.getPixelColor(813, 705);
                                    System.out.println("Color at (830, 699): " + color11);

                                    boolean condition1 = color5.getRed() > 210;//成功率出现

                                    boolean condition8 = color8.getRed() > 245&color8.getRed() < 253&color8.getGreen() < 248&color8.getGreen() > 240
                                            &color8.getBlue() > 198&color8.getBlue() < 206;

                                    boolean condition9 = color9.getRed() > 17&color9.getRed() < 25&color9.getGreen() < 38&color9.getGreen() > 30
                                            &color9.getBlue() > 38&color9.getBlue() < 46;//摔死虚弱出现
                                    boolean condition3 = color121.getRed() > 182&color121.getRed() < 190&color121.getGreen() < 191&color121.getGreen() > 183
                                            &color121.getBlue() > 153&color121.getBlue() < 161;
                                    boolean condition4 = color122.getRed() > 209&color122.getRed() < 217&color122.getGreen() < 215&color122.getGreen() > 207
                                            &color122.getBlue() > 169&color122.getBlue() < 177;//死亡复活提示出现
                                    boolean condition10 = color10.getRed() > 19&color10.getRed() < 27&color10.getGreen() < 34&color10.getGreen() > 26
                                            &color10.getBlue() > 37&color10.getBlue() < 45;
                                    boolean condition11 = color11.getRed() > 19&color11.getRed() < 27&color11.getGreen() < 34&color11.getGreen() > 26
                                            &color11.getBlue() > 37&color11.getBlue() < 45;//紧急返回提示出现

                                    return condition1 || condition8&condition9||condition3&condition4||condition10&condition11;
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                    return true;
                                }
                            };
                            ColorChecker3.checkColorAndExecuteCommandWithTimeout(customState, colors, timeoutSeconds, keyDelayMin, keyDelayMax,
                                    commandA, commandB, stopChecking, stopCondition, KeyEvent.VK_6);


                            Color color5 = robot1.getPixelColor(616, 661);
                            System.out.println("Color at (616, 661): " + color5);

                            if (color5.getRed() > 210) {

                                LOGGER.info("ten4step7成功率出现进入step5");
                                ten_3[0].setValue(1);
                                System.out.println("ten_3 has been reset to: " + ten_3[0].getValue());
                                stopChecking.set(true);
                                ten_step = 5;
                                break ;

                            }
                            Color color2101 = robot1.getPixelColor(1159, 825);
                            if (color2101.getGreen() < 30 ) {
                                LOGGER.info("判断2ten4step7没有飞行时间准备进入ten_step = 2");

                                ten_step = 2;
                                break ;
                            }

                            boolean condition8 = ColorChecker.checkColorAndExecuteCommand(robot, 1196, 111, 249, 244, 202,
                                    () -> {});
                            boolean condition9 = ColorChecker.checkColorAndExecuteCommand(robot, 1193, 114, 21, 34, 42,
                                    () -> {});
                            Color color8 = robot.getPixelColor(1196, 111);
                            System.out.println("2Color at (1196, 111): " + color8);
                            Color color9 = robot.getPixelColor(1193, 114);
                            System.out.println("2Color at (1193, 114): " + color9);

                            if (condition8&condition9) {
                                LOGGER.info("判断ten4step7虚弱出现疑似摔死");
                                robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_E);
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_Q);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_D);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_A);//释放键盘按键

                                LOGGER.info("开始进入ten4step1循环");
                                ten_step =1;
                                break ;
                            }
                            Color color121 = robot1.getPixelColor(553, 380);
                            System.out.println("2Color at (553, 380): " + color121);
                            Color color122 = robot1.getPixelColor(562, 381);
                            System.out.println("2Color at (562, 381): " + color122);
                            if (color121.getRed() > 182&color121.getRed() < 190&color121.getGreen() < 191&color121.getGreen() > 183
                                    &color121.getBlue() > 153&color121.getBlue() < 161&color122.getRed() > 209&color122.getRed() < 217&color122.getGreen() < 215&color122.getGreen() > 207
                                    &color122.getBlue() > 169&color122.getBlue() < 177) {
                                LOGGER.info("ten4step7死亡复活提示出现释放WADQE");
                                robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_E);
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_Q);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_D);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_A);
                                robot.delay(50);
                                robot.mouseMove(842 + (int) v1, 479 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                robot.delay(20);
                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                robot.delay(50);
                                LOGGER.info("点击死亡确认并开始进入ten_step =1");
                                LOGGER.info("开始进入ten4step1循环");
                                ten_step =1;
                                break ;
                            }
                            boolean condition3 = ColorChecker.checkColorAndExecuteCommand(robot, 625, 705, 23, 30, 41,
                                    () -> {});

                            boolean condition4 = ColorChecker.checkColorAndExecuteCommand(robot, 813, 705, 23, 30, 41,
                                    () -> {});

                            if (condition3 && condition4) {
                                LOGGER.info("ten4step7点9回城条出现释放WADQE等待25秒");
                                robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_E);
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_Q);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_D);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_A);//释放键盘按键
                                Thread.sleep(25000);
                                for(;;){
                                    Color color29 = robot1.getPixelColor(273, 733);//确定位置在阿尔点2
                                    Color color31 = robot1.getPixelColor(37, 691);
                                    Color color16 = robot1.getPixelColor(34, 695);
                                    Color color30 = robot1.getPixelColor(278, 733);// 确定位置在阿尔点1
                                    if (color29.getRed() > 140 & color16.getRed() > 150 & color30.getRed() > 145 & color31.getRed() > 145||color121.getRed() > 182&color121.getRed() < 190&color121.getGreen() < 191&color121.getGreen() > 183
                                            &color121.getBlue() > 153&color121.getBlue() < 161&color122.getRed() > 209&color122.getRed() < 217&color122.getGreen() < 215&color122.getGreen() > 207
                                            &color122.getBlue() > 169&color122.getBlue() < 177) {
                                        LOGGER.info("ten4step7点9确定在阿尔回城处准备进入ten_step =8");
                                        ten_step =8;
                                        break ;
                                    }else{
                                        LOGGER.info("ten4step7点9确定不在阿尔回城处准备开始点8和9");
                                        int delayBetweenKeyPresses = 100 + random.nextInt(301);
                                        int delayBetweenKeyPresses1 = 500 + random.nextInt(500);
                                        int delayBetweenKeyPresses2 = 500 + random.nextInt(100);
                                        robot.keyPress(KeyEvent.VK_8);
                                        robot.delay(delayBetweenKeyPresses); // 延迟，以确保按键被识别
                                        robot.keyRelease(KeyEvent.VK_8);

                                        // 生成 100-400 毫秒的随机延迟

                                        robot.delay(delayBetweenKeyPresses1);

                                        // 模拟按下键 9
                                        robot.keyPress(KeyEvent.VK_9);
                                        robot.delay(delayBetweenKeyPresses);// 延迟，以确保按键被识别
                                        robot.keyRelease(KeyEvent.VK_9);
                                        robot.delay(delayBetweenKeyPresses2);
                                    }
                                }
                            }
                        }
                    }
                    if (ten_step == 8) {

                        LOGGER.info("进入ten4step8准备释放weqda");
                        robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                        robot.delay(50);
                        robot.keyRelease(KeyEvent.VK_E);
                        robot.delay(50);
                        robot.keyRelease(KeyEvent.VK_Q);
                        robot.delay(50);//按住延迟
                        robot.keyRelease(KeyEvent.VK_D);
                        robot.delay(50);//按住延迟
                        robot.keyRelease(KeyEvent.VK_A);
                        for(;;){
                        Color color121 = robot1.getPixelColor(553, 380);
                        System.out.println("2Color at (553, 380): " + color121);
                        Color color122 = robot1.getPixelColor(562, 381);
                        System.out.println("2Color at (562, 381): " + color122);
                        if (color121.getRed() > 182&color121.getRed() < 190&color121.getGreen() < 191&color121.getGreen() > 183
                                &color121.getBlue() > 153&color121.getBlue() < 161&color122.getRed() > 209&color122.getRed() < 217&color122.getGreen() < 215&color122.getGreen() > 207
                                &color122.getBlue() > 169&color122.getBlue() < 177) {
                            LOGGER.info("ten4step8死亡复活提示出现");
                            robot.mouseMove(842 + (int) v1, 479 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                            robot.delay(20);
                            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                            robot.delay(50);

                            LOGGER.info("开始进入ten4step1循环");
                            ten_step =1;
                            break ;
                        }
                            Color color29 = robot1.getPixelColor(273, 733);//确定位置在阿尔点2
                            Color color31 = robot1.getPixelColor(37, 691);
                            Color color16 = robot1.getPixelColor(34, 695);
                            Color color30 = robot1.getPixelColor(278, 733);// 确定位置在阿尔点1
                            if (color29.getRed() > 140 & color16.getRed() > 150 & color30.getRed() > 145 & color31.getRed() > 145||color121.getRed() > 182&color121.getRed() < 190&color121.getGreen() < 191&color121.getGreen() > 183
                                    &color121.getBlue() > 153&color121.getBlue() < 161&color122.getRed() > 209&color122.getRed() < 217&color122.getGreen() < 215&color122.getGreen() > 207
                                    &color122.getBlue() > 169&color122.getBlue() < 177) {
                                LOGGER.info("开始进入ten4step1循环");
                                ten_step =1;
                                break ;
                            }



                    }}


                }


            }//在阿尔开始采集，到达75级之后进入7循环
            if (ten_1 == 7) {
                LOGGER.info("进入7循环");
                Thread.sleep(2000);

                Color color1 = robot1.getPixelColor(516, 836);
                Color color19 = robot1.getPixelColor(575, 838);       //判断游戏画面点1出现(游戏是否在线)
                if (color1.getRed() > 58&color1.getRed() < 75&color1.getGreen() > 69&color1.getGreen() <85&color1.getBlue() > 98
                        &color1.getBlue() < 111&color19.getRed() > 53&color19.getRed() < 63&color19.getGreen() > 61&color19.getGreen() <72
                        &color19.getBlue() > 91 &color19.getBlue() < 99) {
                    LOGGER.info("ten7step2检测游戏画面出现准备进入ten7step1");
                    ten_step=1;

                    if (ten_step == 1){
                        LOGGER.info("进入ten7step1");
                        Color color11 = robot1.getPixelColor(368, 434);  //判断v挡板位置正确

                        Color color10 = robot1.getPixelColor(11, 615); //

                        if (color11.getRed() == 255 & color10.getRed() > 137){
                            LOGGER.info("ten7step1判断V挡板小地图正确");
                            Color color21 = robot1.getPixelColor(1255, 214);
                            if ( color21.getRed() == 185){
                                LOGGER.info("ten7step1检测K出现");
                                ten_step=2;


                            }else{
                                LOGGER.info("ten7step1检测K没出现点K");
                                KeyUtil.pressKey(robot, KeyEvent.VK_K, -1);

                            }

                        }else {
                            LOGGER.info("ten7step1检测VN没出现调整画面");
                            Thread.sleep(200);

                            KeyUtil.pressKey(robot, KeyEvent.VK_V, -1);
                            KeyUtil.pressKey(robot, KeyEvent.VK_N, -1);
                            KeyUtil.pressKey(robot, KeyEvent.VK_N, -1);
                            KeyUtil.pressKey(robot, KeyEvent.VK_N, -1);
                            LOGGER.info("ten7step2调整好画面设置");
                            Thread.sleep(1000);
                        }


                    }
                    if (ten_step == 2){
                        Color color29 = robot1.getPixelColor(114, 756);//确定位置在莫点2
                        Color color31 = robot1.getPixelColor(112, 760);
                        Color color16 = robot1.getPixelColor(204, 886);
                        Color color32 = robot1.getPixelColor(208, 887);// 确定位置在莫尔点1
                        if (color29.getRed() > 160 & color16.getRed() > 145 & color32.getRed() > 135 & color31.getRed() > 115) {
                            LOGGER.info("ten16step2确定位置在莫尔回城处点RF");
                            KeyUtil.pressKey(robot, KeyEvent.VK_R,-1 );
                            Thread.sleep(1000);
                            KeyUtil.pressKey(robot, KeyEvent.VK_F,-1 );
                            Thread.sleep(1000);


                            boolean condition3;
                            boolean condition4;
                            boolean condition9;
                            boolean condition10;

                            while (true) {
                                // 获取颜色值

                                Color color3 = robot1.getPixelColor(597, 407);
                                Color color2 = robot1.getPixelColor(607, 410);
                                Color color28 = robot1.getPixelColor(687, 313);
                                Color color30 = robot1.getPixelColor(715, 310);


                                System.out.println("3Color at (600, 410): " + color3);
                                System.out.println("3Color at (790, 510): " + color2);
                                System.out.println("3Color at (687, 313): " + color28);
                                System.out.println("3Color at (715, 310): " + color30);



                                // 检查条件
                                condition3 = (color3.getRed() > 209);

                                condition4 = (color2.getRed() > 212);
                                condition9 = (color28.getRed() >= 255 - 4 && color28.getRed() <= 255 + 4) &&
                                        (color28.getGreen() >= 234 - 4 && color28.getGreen() <= 234 + 4) &&
                                        (color28.getBlue() >= 183 - 4 && color28.getBlue() <=183 + 4);

                                condition10 = (color30.getRed() >= 255 - 4 && color30.getRed() <= 255 + 4) &&
                                        (color30.getGreen() >= 234 - 4 && color30.getGreen() <= 234 + 4) &&
                                        (color30.getBlue() >= 183 - 4 && color30.getBlue() <= 183 + 4);



                                // 如果满足条件，则跳出循环
                                if ((condition3 && condition4) || (condition9 && condition10)) {
                                    break;
                                }
                                LOGGER.info("ten7step2按c+=定奇斯克1");

                                // 如果条件不满足，继续执行循环中的其他操作
                                int delayBetweenKeyPresses = 80 + random.nextInt(100);
                                int delayBetweenKeyPresses1 = 500 + random.nextInt(500);
                                int delayBetweenKeyPresses2 = 1000 + random.nextInt(200);

                                robot.mouseMove(967 + (int) v1, 768 + (int) v1); // 鼠标移动到xx坐标轴 点击阻止
                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                robot.delay(delayBetweenKeyPresses);
                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                robot.delay(200);
                                robot.delay(delayBetweenKeyPresses2);

                                // 休眠 300 毫秒
                                try {
                                    Thread.sleep(300);
                                } catch (InterruptedException e) {
                                    Thread.currentThread().interrupt();
                                }
                            }

                            Thread.sleep(500);
                            Color color3 = robot1.getPixelColor(597, 407);
                            Color color2 = robot1.getPixelColor(607, 410);
                            if (color3.getRed() > 209 & color2.getRed() > 212){
                                LOGGER.info("奇斯克定点提示出现");

                                MouseUtil.moveWithCurve(robot, 788, 512);
                                LOGGER.info("按c+=定奇斯克点确定");
                                Color color22 = robot1.getPixelColor(1330, 327);// 80%左右的位置是灰色
                                Color color23 = robot1.getPixelColor(1126, 304);//初级的初点2
                                Color color24 = robot1.getPixelColor(1119, 308);// 初级的初点1

                                if (color22.getGreen() > 134 & color23.getRed() > 170 & color24.getRed() > 185) {
                                    Thread.sleep(1000); //延迟
                                    LOGGER.info("ten10判断奥德采集技能75级~100级");
                                    ten_1 = 16;
                                    LOGGER.info("定好奇斯克进入ten16循环");
                                }
                                boolean condition5 = ColorChecker.checkColorAndExecuteCommand(robot, 1122, 303, 214, 213, 174,
                                        () -> {});

                                boolean condition6 = ColorChecker.checkColorAndExecuteCommand(robot, 1122, 309, 198, 197, 163,
                                        () -> {});


                                if (condition5 && condition6) {
                                    LOGGER.info("ten10判断中级未到199准备进入ten21");
                                    ten_1 = 21;
                                    LOGGER.info("定好奇斯克进入ten21循环");

                                }


                            }else {
                                LOGGER.info("奇斯克定点提示未出现进入相应循环");
                                Color color22 = robot1.getPixelColor(1330, 327);// 80%左右的位置是灰色
                                Color color23 = robot1.getPixelColor(1126, 304);//初级的初点2
                                Color color24 = robot1.getPixelColor(1119, 308);// 初级的初点1

                                if (color22.getGreen() > 134 & color23.getRed() > 170 & color24.getRed() > 185) {
                                    Thread.sleep(1000); //延迟
                                    LOGGER.info("ten10判断奥德采集技能75级~100级");
                                    ten_1 = 16;
                                    LOGGER.info("定好奇斯克进入ten16循环");
                                }
                                boolean condition5 = ColorChecker.checkColorAndExecuteCommand(robot, 1122, 303, 214, 213, 174,
                                        () -> {});

                                boolean condition6 = ColorChecker.checkColorAndExecuteCommand(robot, 1122, 309, 198, 197, 163,
                                        () -> {});


                                if (condition5 && condition6) {
                                    LOGGER.info("ten10判断中级未到199准备进入ten21");
                                    ten_1 = 21;
                                    LOGGER.info("定好奇斯克进入ten21循环");

                                }
                            }

                        } else { //人没有回阿尔空采初始点点卷轴位置 暂时点卷轴，后面改回城
                            LOGGER.info("确定位置不在莫尔回城处点A+9回城卷轴");
                            KeyUtil.pressKey(robot, KeyEvent.VK_ALT, KeyEvent.VK_9);
                            Thread.sleep(15000); //延迟
                            LOGGER.info("等待15秒");


                        }


                    }



                }


                    /* 写错了从阿尔回城劵去空间师到莫尔路径
                    LOGGER.info("点A+8吃卷轴回城");
                    KeyUtil.pressKey(robot, KeyEvent.VK_ALT, KeyEvent.VK_8);
                    LOGGER.info("休息15秒");
                    Thread.sleep(15000);
                    for (;;){
                    Color color213 = robot1.getPixelColor(146, 756);
                    if (color213.getRed() > 230) {
                        Thread.sleep(200);
                        LOGGER.info("方向正确开始往前走");
                        robot1.keyPress(KeyEvent.VK_W);
                        Thread.sleep(200);
                        Color color214 = robot1.getPixelColor(18, 653);
                        if (color214.getRed() > 165){
                            LOGGER.info("到达目的地开始释放W");
                            Thread.sleep(200);
                            robot1.keyRelease(KeyEvent.VK_W);
                            Thread.sleep(200);
                            while (true){Color color215 = robot1.getPixelColor(475, 29);
                            System.out.println("Color at (475, 29): " + color215);
                            if (color215.getGreen() > 210&color215.getGreen() < 245&color215.getRed() > 60&color215.getRed() < 80){
                                LOGGER.info("选到正确的NPC乌金开始点莫尔海姆目的地");
                                KeyUtil.pressKey(robot, KeyEvent.VK_C, -1);
                                MouseUtil.moveWithCurve(robot, 215, 258);
                                MouseUtil.moveWithCurve(robot, 142, 330);
                                MouseUtil.moveWithCurve(robot, 788, 504);
                                LOGGER.info("开始休息20秒");
                                Thread.sleep(20000);
                                LOGGER.info("开始进入step2");
                                ten_step = 2;
                                continue outerLoop;


                            }else{
                                LOGGER.info("按F8选择NPC");
                                Thread.sleep(200);
                                KeyUtil.pressKey(robot, KeyEvent.VK_F8, -1);
                                Thread.sleep(500);
                            }}
                        }



                    }
                    else{
                        LOGGER.info("角度不对开始转向1");

                        robot1.keyPress(KeyEvent.VK_D);
                        robot1.delay(20);
                        robot1.keyRelease(KeyEvent.VK_D);
                        Thread.sleep(200);

                    }



                }*/


                }//到达莫尔海姆定奇斯克
            if (ten_1 == 24) {
                LOGGER.info("进入24循环");
                Thread.sleep(2000);

                Color color1 = robot1.getPixelColor(516, 836);
                Color color19 = robot1.getPixelColor(575, 838);       //判断游戏画面点1出现(游戏是否在线)
                if (color1.getRed() > 58&color1.getRed() < 75&color1.getGreen() > 69&color1.getGreen() <85&color1.getBlue() > 98
                        &color1.getBlue() < 111&color19.getRed() > 53&color19.getRed() < 63&color19.getGreen() > 61&color19.getGreen() <72
                        &color19.getBlue() > 91 &color19.getBlue() < 99) {
                    LOGGER.info("ten24step2检测游戏画面出现准备进入ten24step1");
                    ten_step=1;

                    if (ten_step == 1){
                        LOGGER.info("进入ten24step1");
                        Color color11 = robot1.getPixelColor(368, 434);  //判断v挡板位置正确

                        Color color10 = robot1.getPixelColor(11, 615); //

                        if (color11.getRed() == 255 & color10.getRed() > 137){
                            LOGGER.info("ten24step1判断V挡板小地图正确");
                            Color color21 = robot1.getPixelColor(1255, 214);
                            if ( color21.getRed() == 185){
                                LOGGER.info("ten24step1检测K出现");
                                ten_step=2;


                            }else{
                                LOGGER.info("ten24step1检测K没出现点K");
                                KeyUtil.pressKey(robot, KeyEvent.VK_K, -1);

                            }

                        }else {
                            LOGGER.info("ten24step1检测VN没出现调整画面");
                            Thread.sleep(200);

                            KeyUtil.pressKey(robot, KeyEvent.VK_V, -1);
                            KeyUtil.pressKey(robot, KeyEvent.VK_N, -1);
                            KeyUtil.pressKey(robot, KeyEvent.VK_N, -1);
                            KeyUtil.pressKey(robot, KeyEvent.VK_N, -1);
                            LOGGER.info("ten24step2调整好画面设置");
                            Thread.sleep(1000);
                        }


                    }
                    if (ten_step == 2){
                        boolean condition9 = ColorChecker.checkColorAndExecuteCommand(robot, 1388, 190, 214, 212, 174,
                                () -> {});//难民村的村1

                        boolean condition10 = ColorChecker.checkColorAndExecuteCommand(robot, 1382, 190, 215, 213, 175,
                                () -> {});//难民村的村2

                        if (condition9 && condition10) {
                            LOGGER.info("ten24step2确定位置在难民村点RF");
                            KeyUtil.pressKey(robot, KeyEvent.VK_R,-1 );
                            Thread.sleep(1000);
                            KeyUtil.pressKey(robot, KeyEvent.VK_F,-1 );
                            Thread.sleep(1000);

                            LOGGER.info("准备进入25循环");
                            ten_1 = 25;

                        } else { //人没有回阿尔空采初始点点卷轴位置 暂时点卷轴，后面改回城
                            LOGGER.info("确定位置不在难民村点89回城");
                            KeyUtil.pressKey(robot, KeyEvent.VK_8,-1 );
                            Thread.sleep(1000);
                            KeyUtil.pressKey(robot, KeyEvent.VK_9,-1 );
                            Thread.sleep(15000); //延迟
                            LOGGER.info("等待15秒");


                        }


                    }



                }


                    /* 写错了从阿尔回城劵去空间师到莫尔路径
                    LOGGER.info("点A+8吃卷轴回城");
                    KeyUtil.pressKey(robot, KeyEvent.VK_ALT, KeyEvent.VK_8);
                    LOGGER.info("休息15秒");
                    Thread.sleep(15000);
                    for (;;){
                    Color color213 = robot1.getPixelColor(146, 756);
                    if (color213.getRed() > 230) {
                        Thread.sleep(200);
                        LOGGER.info("方向正确开始往前走");
                        robot1.keyPress(KeyEvent.VK_W);
                        Thread.sleep(200);
                        Color color214 = robot1.getPixelColor(18, 653);
                        if (color214.getRed() > 165){
                            LOGGER.info("到达目的地开始释放W");
                            Thread.sleep(200);
                            robot1.keyRelease(KeyEvent.VK_W);
                            Thread.sleep(200);
                            while (true){Color color215 = robot1.getPixelColor(475, 29);
                            System.out.println("Color at (475, 29): " + color215);
                            if (color215.getGreen() > 210&color215.getGreen() < 245&color215.getRed() > 60&color215.getRed() < 80){
                                LOGGER.info("选到正确的NPC乌金开始点莫尔海姆目的地");
                                KeyUtil.pressKey(robot, KeyEvent.VK_C, -1);
                                MouseUtil.moveWithCurve(robot, 215, 258);
                                MouseUtil.moveWithCurve(robot, 142, 330);
                                MouseUtil.moveWithCurve(robot, 788, 504);
                                LOGGER.info("开始休息20秒");
                                Thread.sleep(20000);
                                LOGGER.info("开始进入step2");
                                ten_step = 2;
                                continue outerLoop;


                            }else{
                                LOGGER.info("按F8选择NPC");
                                Thread.sleep(200);
                                KeyUtil.pressKey(robot, KeyEvent.VK_F8, -1);
                                Thread.sleep(500);
                            }}
                        }



                    }
                    else{
                        LOGGER.info("角度不对开始转向1");

                        robot1.keyPress(KeyEvent.VK_D);
                        robot1.delay(20);
                        robot1.keyRelease(KeyEvent.VK_D);
                        Thread.sleep(200);

                    }



                }*/


            }//在贝鲁斯兰难民村看看在不在回城点，不在的话进入18循环重新定点，在的话进入25循环采集
            if (ten_1 == 22) {
                LOGGER.info("进入22循环");
                Thread.sleep(2000);

                Color color1 = robot1.getPixelColor(516, 836);
                Color color19 = robot1.getPixelColor(575, 838);       //判断游戏画面点1出现(游戏是否在线)
                if (color1.getRed() > 58&color1.getRed() < 75&color1.getGreen() > 69&color1.getGreen() <85&color1.getBlue() > 98
                        &color1.getBlue() < 111&color19.getRed() > 53&color19.getRed() < 63&color19.getGreen() > 61&color19.getGreen() <72
                        &color19.getBlue() > 91 &color19.getBlue() < 99) {
                    LOGGER.info("ten22step1检测游戏画面出现准备进入ten7step1");
                    ten_step=1;

                    if (ten_step == 1){
                        LOGGER.info("进入ten22step1");
                        Color color11 = robot1.getPixelColor(368, 434);  //判断v挡板位置正确

                        Color color10 = robot1.getPixelColor(11, 615); //

                        if (color11.getRed() == 255 & color10.getRed() > 137){
                            LOGGER.info("ten22step1判断V挡板小地图正确");
                            Color color21 = robot1.getPixelColor(1255, 214);
                            if ( color21.getRed() == 185){
                                LOGGER.info("ten22step1检测K出现");
                                ten_step=2;


                            }else{
                                LOGGER.info("ten7step1检测K没出现点K");
                                KeyUtil.pressKey(robot, KeyEvent.VK_K, -1);

                            }

                        }else {
                            LOGGER.info("ten22step1检测VN没出现调整画面");
                            Thread.sleep(200);

                            KeyUtil.pressKey(robot, KeyEvent.VK_V, -1);
                            KeyUtil.pressKey(robot, KeyEvent.VK_N, -1);
                            KeyUtil.pressKey(robot, KeyEvent.VK_N, -1);
                            KeyUtil.pressKey(robot, KeyEvent.VK_N, -1);
                            LOGGER.info("ten22step2调整好画面设置");
                            Thread.sleep(1000);
                        }


                    }
                    if (ten_step == 2){
                        Color color29 = robot1.getPixelColor(237, 758);//确定位置在贝鲁点2
                        Color color31 = robot1.getPixelColor(238, 761);
                        Color color16 = robot1.getPixelColor(274, 801);
                        Color color32 = robot1.getPixelColor(278, 801);// 确定位置在贝鲁点1
                        if (color29.getRed() > 159 & color16.getRed() > 153 & color32.getRed() > 112 & color31.getRed() > 156) {
                            LOGGER.info("ten16step2确定位置在莫尔回城处点RF");
                            KeyUtil.pressKey(robot, KeyEvent.VK_R,-1 );
                            Thread.sleep(1000);
                            KeyUtil.pressKey(robot, KeyEvent.VK_F,-1 );
                            Thread.sleep(1000);


                            boolean condition3;
                            boolean condition4;
                            boolean condition9;
                            boolean condition10;

                            while (true) {
                                // 获取颜色值

                                Color color3 = robot1.getPixelColor(597, 407);
                                Color color2 = robot1.getPixelColor(607, 410);
                                Color color28 = robot1.getPixelColor(687, 313);
                                Color color30 = robot1.getPixelColor(715, 310);


                                System.out.println("3Color at (600, 410): " + color3);
                                System.out.println("3Color at (790, 510): " + color2);
                                System.out.println("3Color at (687, 313): " + color28);
                                System.out.println("3Color at (715, 310): " + color30);



                                // 检查条件
                                condition3 = (color3.getRed() > 209);

                                condition4 = (color2.getRed() > 212);
                                condition9 = (color28.getRed() >= 255 - 4 && color28.getRed() <= 255 + 4) &&
                                        (color28.getGreen() >= 234 - 4 && color28.getGreen() <= 234 + 4) &&
                                        (color28.getBlue() >= 183 - 4 && color28.getBlue() <=183 + 4);

                                condition10 = (color30.getRed() >= 255 - 4 && color30.getRed() <= 255 + 4) &&
                                        (color30.getGreen() >= 234 - 4 && color30.getGreen() <= 234 + 4) &&
                                        (color30.getBlue() >= 183 - 4 && color30.getBlue() <= 183 + 4);



                                // 如果满足条件，则跳出循环
                                if ((condition3 && condition4) || (condition9 && condition10)) {
                                    break;
                                }
                                LOGGER.info("ten22step2按c+=定奇斯克1");

                                // 如果条件不满足，继续执行循环中的其他操作
                                int delayBetweenKeyPresses = 80 + random.nextInt(100);
                                int delayBetweenKeyPresses1 = 500 + random.nextInt(500);
                                int delayBetweenKeyPresses2 = 1000 + random.nextInt(200);

                                robot.mouseMove(967 + (int) v1, 768 + (int) v1); // 鼠标移动到xx坐标轴 点击C=
                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                robot.delay(delayBetweenKeyPresses);
                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                robot.delay(200);
                                robot.delay(delayBetweenKeyPresses2);

                                // 休眠 300 毫秒
                                try {
                                    Thread.sleep(300);
                                } catch (InterruptedException e) {
                                    Thread.currentThread().interrupt();
                                }
                            }

                            Thread.sleep(500);
                            Color color3 = robot1.getPixelColor(597, 407);
                            Color color2 = robot1.getPixelColor(607, 410);
                            if (color3.getRed() > 209 & color2.getRed() > 214){
                                LOGGER.info("奇斯克定点提示出现");

                                MouseUtil.moveWithCurve(robot, 788, 512);
                                LOGGER.info("按c+=定奇斯克点确定");
                                Thread.sleep(300);

                                LOGGER.info("准备进入ten23");
                                ten_1 = 23;


                            }else {
                                LOGGER.info("奇斯克定点提示未出现进入相应循环");
                                LOGGER.info("准备进入ten23");
                                Thread.sleep(300);
                                ten_1 = 23;
                            }

                        } else { //人没有回阿尔空采初始点点卷轴位置 暂时点卷轴，后面改回城
                            LOGGER.info("确定位置不在莫尔回城处点A+9回城卷轴");
                            KeyUtil.pressKey(robot, KeyEvent.VK_ALT, KeyEvent.VK_0);
                            Thread.sleep(15000); //延迟
                            LOGGER.info("等待15秒");


                        }


                    }



                }


                    /* 写错了从阿尔回城劵去空间师到莫尔路径
                    LOGGER.info("点A+8吃卷轴回城");
                    KeyUtil.pressKey(robot, KeyEvent.VK_ALT, KeyEvent.VK_8);
                    LOGGER.info("休息15秒");
                    Thread.sleep(15000);
                    for (;;){
                    Color color213 = robot1.getPixelColor(146, 756);
                    if (color213.getRed() > 230) {
                        Thread.sleep(200);
                        LOGGER.info("方向正确开始往前走");
                        robot1.keyPress(KeyEvent.VK_W);
                        Thread.sleep(200);
                        Color color214 = robot1.getPixelColor(18, 653);
                        if (color214.getRed() > 165){
                            LOGGER.info("到达目的地开始释放W");
                            Thread.sleep(200);
                            robot1.keyRelease(KeyEvent.VK_W);
                            Thread.sleep(200);
                            while (true){Color color215 = robot1.getPixelColor(475, 29);
                            System.out.println("Color at (475, 29): " + color215);
                            if (color215.getGreen() > 210&color215.getGreen() < 245&color215.getRed() > 60&color215.getRed() < 80){
                                LOGGER.info("选到正确的NPC乌金开始点莫尔海姆目的地");
                                KeyUtil.pressKey(robot, KeyEvent.VK_C, -1);
                                MouseUtil.moveWithCurve(robot, 215, 258);
                                MouseUtil.moveWithCurve(robot, 142, 330);
                                MouseUtil.moveWithCurve(robot, 788, 504);
                                LOGGER.info("开始休息20秒");
                                Thread.sleep(20000);
                                LOGGER.info("开始进入step2");
                                ten_step = 2;
                                continue outerLoop;


                            }else{
                                LOGGER.info("按F8选择NPC");
                                Thread.sleep(200);
                                KeyUtil.pressKey(robot, KeyEvent.VK_F8, -1);
                                Thread.sleep(500);
                            }}
                        }



                    }
                    else{
                        LOGGER.info("角度不对开始转向1");

                        robot1.keyPress(KeyEvent.VK_D);
                        robot1.delay(20);
                        robot1.keyRelease(KeyEvent.VK_D);
                        Thread.sleep(200);

                    }



                }*/


            }//到达贝鲁斯兰定奇斯克

            if (ten_1 == 16) {
                final Counter[] ten_3 = {new Counter(0)};
                LOGGER.info("初始化3");

                AtomicInteger localTenStep = new AtomicInteger(1);

                outerLoop2:

                for (;;) {

                    LOGGER.info("进入16循环");
                    Color color2333 = robot1.getPixelColor(964, 849);
                    Color color199 = robot1.getPixelColor(1178, 831);

                    Color color208 = robot1.getPixelColor(143, 754);
                    Color color209 = robot1.getPixelColor(616, 661);
                    Color color210 = robot1.getPixelColor(1159, 825);

                    if (color2333.getRed() > 200 & color199.getGreen() < 60) {
                        LOGGER.info("ten16判断可以吃药和恢复飞行技能");
                        robot1.keyPress(KeyEvent.VK_EQUALS);//按住enter
                        robot1.delay(c);//按住一秒1秒后
                        robot1.keyRelease(KeyEvent.VK_EQUALS);
                        robot1.delay(c);
                        robot1.keyPress(KeyEvent.VK_0);
                        robot1.delay(c);//按住一秒1秒后
                        robot1.keyRelease(KeyEvent.VK_0);
                        LOGGER.info("点击=和0吃药和恢复飞行技能");
                    }
                    if (color210.getGreen() < 30 ) {
                        LOGGER.info("ten16判断飞行时间不够");
                        robot1.keyRelease(KeyEvent.VK_W);
                        Thread.sleep(c);
                        robot1.keyRelease(KeyEvent.VK_D);
                        LOGGER.info("ten16关掉W和D并开始下降10秒");
                        robot.keyPress(KeyEvent.VK_F);//按下键盘按键 上升
                        robot.delay(15000);//按住延迟
                        robot.keyRelease(KeyEvent.VK_F); //释放键盘按键
                        Thread.sleep(200); //延迟
                        LOGGER.info("ten16等待飞行时间恢复");
                        for(;;){
                            boolean condition1 = ColorChecker.checkColorAndExecuteCommand(robot, 1162, 825, 41, 117, 5,
                                    () -> {});
                            if (condition1) {
                                LOGGER.info("ten16飞行时间已恢复满");
                                Color color111 = robot1.getPixelColor(1160, 845);

                                if (color111.getRed() > 184) {
                                    LOGGER.info("ten16检测是可飞行地区");
                                    Color color29 = robot1.getPixelColor(114, 756);//确定位置在莫点2
                                    Color color31 = robot1.getPixelColor(112, 760);
                                    Color color16 = robot1.getPixelColor(204, 886);
                                    Color color30 = robot1.getPixelColor(208, 887);// 确定位置在莫尔点1
                                    if (color29.getRed() > 160 & color16.getRed() > 145 & color30.getRed() > 135 & color31.getRed() > 115) {
                                        LOGGER.info("ten16检测已回城从ten16step1重新开始");
                                        localTenStep.set(1);
                                        break;
                                    }       //如果是超时需要这一步，其他地方采记得改这里

                                    LOGGER.info("ten16开始起飞");
                                    KeyUtil.pressKey(robot, KeyEvent.VK_R,-1 );
                                    KeyUtil.pressKey(robot, KeyEvent.VK_F,-1 );
                                    LOGGER.info("ten16停止前进并点击起飞按键");
                                    MouseUtil.moveWithCurve(robot, 1160+ (int) v1, 850+ (int) v1);
                                    Thread.sleep(1000); //延迟
                                    robot.delay(4500);//按住延迟
                                    LOGGER.info("开始上升");
                                    robot.keyPress(KeyEvent.VK_R);//按下键盘按键 上升
                                    robot.delay(2000);//按住延迟
                                    robot.keyRelease(KeyEvent.VK_R); //释放键盘按键
                                    Thread.sleep(200); //延迟
                                    LOGGER.info("ten16开始进入step3");
                                    localTenStep.set(3);
                                    break;
                                }else{
                                    for(;;){
                                        LOGGER.info("ten16检测是禁飞行地区");
                                        robot1.keyPress(KeyEvent.VK_SPACE);
                                        robot1.delay(300);
                                        robot1.keyRelease(KeyEvent.VK_SPACE);
                                        robot.delay(100);
                                        robot.mouseMove(1160 + (int) v1, 850 + (int) v1); //
                                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                        robot.delay(20);
                                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                        LOGGER.info("跳跃起飞");
                                        robot.delay(2000);
                                        Color color22 = robot1.getPixelColor(1162, 836);

                                        if (color22.getRed() > 184) {
                                            LOGGER.info("检测已经不在禁飞行地区");
                                            LOGGER.info("开始点R上升");
                                            robot.keyPress(KeyEvent.VK_R);//按下键盘按键 上升
                                            robot.delay(2000);//按住延迟
                                            LOGGER.info("上升2秒");
                                            robot.keyPress(KeyEvent.VK_W);//按下键盘按键 上升
                                            robot.keyPress(KeyEvent.VK_D);//按下键盘按键 上升
                                            robot.delay((int) v4);//按住延迟
                                            LOGGER.info("上升2秒");
                                            robot.keyRelease(KeyEvent.VK_D);
                                            robot.delay(2000);
                                            robot.keyRelease(KeyEvent.VK_W);
                                            robot.keyRelease(KeyEvent.VK_R);
                                            LOGGER.info("ten16开始进入ten_step =3");

                                            localTenStep.set(3);
                                            break outerLoop2;
                                        }
                                        LOGGER.info("等待12秒");
                                        Thread.sleep(12000);

                                    }


                                }
                            }
                            Thread.sleep(1000);

                        }}
                    boolean condition5 = ColorChecker.checkColorAndExecuteCommand(robot, 1196, 111, 249, 244, 202,
                            () -> {});
                    boolean condition6 = ColorChecker.checkColorAndExecuteCommand(robot, 1193, 114, 21, 34, 42,
                            () -> {});


                    if (condition5&condition6) {

                        LOGGER.info("ten16判断虚弱");
                        robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                        robot.delay(50);
                        robot.keyRelease(KeyEvent.VK_E);
                        robot.delay(50);
                        robot.keyRelease(KeyEvent.VK_Q);
                        robot.delay(50);//按住延迟
                        robot.keyRelease(KeyEvent.VK_D);
                        robot.delay(50);//按住延迟
                        robot.keyRelease(KeyEvent.VK_A);
                        LOGGER.info("开始进入ten16step1循环");
                        localTenStep.set(1);
                        break;
                    }
                    Color color22 = robot1.getPixelColor(1397, 327);// 100级是绿色
                    Color color23 = robot1.getPixelColor(1126, 304);//初级的初点2
                    Color color24 = robot1.getPixelColor(1119, 308);// 初级的初点1
                    if (color22.getGreen() > 148 & color23.getRed() > 170 & color24.getRed() > 185) {

                        LOGGER.info("判断ten16升级到100级开始进入ten20");

                        ten_1 =20 ;
                        continue outerLoop5;

                    }
                    boolean condition7 = ColorChecker.checkColorAndExecuteCommand(robot, 1122, 303, 214, 213, 174,
                            () -> {});//中级的中点1

                    boolean condition13 = ColorChecker.checkColorAndExecuteCommand(robot, 1122, 309, 198, 197, 163,
                            () -> {});//中级的中点2


                    if (condition7 && condition13&color22.getGreen() > 148) {
                        LOGGER.info("判断ten16升级到200级开始进入ten20");

                        ten_1 =20 ;
                        continue outerLoop5;
                    }

                    if (localTenStep.get() == 1) {

                        //去的路径
                        LOGGER.info("进入ten16step1");

                        Color color207 = robot1.getPixelColor(143, 756);
                        System.out.println("Color at (143, 756): " + color207);
                        if (color207.getRed() > 114) {

                            if (condition5&condition6) {
                                LOGGER.info("ten16step1判断有虚弱休息240秒");
                                robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_E);
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_Q);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_D);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_A);
                                Thread.sleep(240000);
                            }
                            LOGGER.info("ten16step1往前走");
                            Thread.sleep(200); //延迟
                            robot1.keyPress(KeyEvent.VK_W);//往前走
                            localTenStep.set(9);
                            outerLoop4:
                            for (;;){
                                LOGGER.info("ten16step1进入for循环");
                                if (localTenStep.get() == 9){
                                    LOGGER.info("进入ten16step9");
                                    Color color32 = robot1.getPixelColor(253, 840); // 转向
                                    System.out.println("Color at (253, 840): " + color207);
                                    if (color32.getRed() > 180) {
                                        LOGGER.info("ten16step1判断转向1");
                                        AngleCalculatorTask task = new AngleCalculatorTask(robot, 141, 751);
                                        Thread.sleep(100);

                                        LOGGER.info("5-1");

                                        task.run();
                                        localTenStep.set(10);
                                        LOGGER.info("localTenStep.set(10) was executed");
                                        continue;


                                    }}
                                if (localTenStep.get() == 10){
                                    AngleCalculatorTask task = new AngleCalculatorTask(robot, 141, 751);
                                    Thread.sleep(100);

                                    LOGGER.info("5-1");

                                    task.run();

                                    int[][] colors = {
                                            {63, 857, 165} // x1, y1, red1
                                    };
                                    Color color206 = robot1.getPixelColor(253, 840);
                                    System.out.println("Color at (253, 840): " + color206);
                                    ColorChecker2 colorCheckerInstance = new ColorChecker2();

                                    CountDownLatch latch = new CountDownLatch(1);
                                    colorCheckerInstance.setLatch(latch);
                                    CustomState customState = new CustomState();
                                    ColorChecker2.checkColorAndExecuteCommandWithTimeout(customState, colors, 30, 600, 900,
                                            () -> {
                                                double v9 = 0.03 + random.nextDouble() * (0.03 - 0.01);//定义随机延迟在0.05-0.01秒之间 鼠标的延迟 robot.delay((int) v);

                                                v9 = v9 * 1000;

                                                LOGGER.info("ten16step1判断走到起飞点附近");
                                                robot.keyRelease(KeyEvent.VK_W); //释放键盘按键

                                                LOGGER.info("停止前进并点击起飞按键");

                                                robot.mouseMove(1160 + (int) v1, 850 + (int) v1); // 鼠标移动到xx坐标轴 点击阻止
                                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                                robot.delay((int) v9);
                                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                                robot.delay(200);


                                                LOGGER.info("开始点R上升");
                                                robot.keyPress(KeyEvent.VK_R);//按下键盘按键 上升
                                                robot.delay(4500);//按住延迟
                                                LOGGER.info("上升4.5秒停止");
                                                robot.keyRelease(KeyEvent.VK_R); //释放键盘按键

                                                LOGGER.info("ten16step1开始进入step = 3");
                                                colorCheckerInstance.getLatch().countDown();


                                            },
                                            Optional.empty());
                                    try {
                                        latch.await(); // 等待 run() 方法执行完成
                                        localTenStep.set(3);
                                        break outerLoop4;
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }}



                                }

                        } else {
                            LOGGER.info("ten16step1角度不对开始转向3");
                            robot1.keyPress(KeyEvent.VK_D);
                            robot1.delay(20);
                            robot1.keyRelease(KeyEvent.VK_D);
                            Thread.sleep(200);
                            LOGGER.info("开始回到step = 1");
                            localTenStep.set(1);

                        }}





                    if (localTenStep.get() == 2){

                        LOGGER.info("进入ten16step2");
                        robot1.keyRelease(KeyEvent.VK_W);
                        Thread.sleep(c);
                        robot1.keyRelease(KeyEvent.VK_D);
                        LOGGER.info("关掉W和D并开始下降10秒");
                        robot.keyPress(KeyEvent.VK_F);//按下键盘按键 上升
                        robot.delay(15000);//按住延迟
                        robot.keyRelease(KeyEvent.VK_F); //释放键盘按键
                        Thread.sleep(200); //延迟
                        LOGGER.info("等待飞行时间恢复");
                        for(;;){
                            boolean condition1 = ColorChecker.checkColorAndExecuteCommand(robot, 1162, 825, 41, 117, 5,
                                    () -> {});
                            if (condition1) {
                                LOGGER.info("ten16step2飞行时间已恢复满");
                                Color color111 = robot1.getPixelColor(1160, 845);



                                if (color111.getRed() > 184) {
                                    LOGGER.info("ten16step2检测是可飞行地区");
                                    Color color29 = robot1.getPixelColor(114, 756);//确定位置在莫点2
                                    Color color31 = robot1.getPixelColor(112, 760);
                                    Color color16 = robot1.getPixelColor(204, 886);
                                    Color color30 = robot1.getPixelColor(208, 887);// 确定位置在莫尔点1
                                    if (color29.getRed() > 160 & color16.getRed() > 145 & color30.getRed() > 135 & color31.getRed() > 115) {
                                        LOGGER.info("检测已回城从ten4step1重新开始");
                                        localTenStep.set(1);
                                        break;
                                    }       //如果是超时需要这一步，其他地方采记得改这里

                                    LOGGER.info("ten16step2开始起飞");
                                    KeyUtil.pressKey(robot, KeyEvent.VK_R,-1 );
                                    KeyUtil.pressKey(robot, KeyEvent.VK_F,-1 );
                                    LOGGER.info("停止前进并点击起飞按键");
                                    MouseUtil.moveWithCurve(robot, 1160+ (int) v1, 850+ (int) v1);
                                    Thread.sleep(1000); //延迟
                                    robot.delay(4500);//按住延迟
                                    LOGGER.info("开始上升");
                                    robot.keyPress(KeyEvent.VK_R);//按下键盘按键 上升
                                    robot.delay(2000);//按住延迟
                                    robot.keyRelease(KeyEvent.VK_R); //释放键盘按键
                                    Thread.sleep(200); //延迟
                                    LOGGER.info("ten16step2开始进入step3");
                                    localTenStep.set(3);
                                    break;
                                }else{
                                    for(;;){
                                        LOGGER.info("ten16step2检测是禁飞行地区");
                                        robot1.keyPress(KeyEvent.VK_SPACE);
                                        robot1.delay(300);
                                        robot1.keyRelease(KeyEvent.VK_SPACE);
                                        robot.delay(100);
                                        robot.mouseMove(1160 + (int) v1, 850 + (int) v1); //
                                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                        robot.delay(20);
                                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                        LOGGER.info("跳跃起飞");
                                        robot.delay(2000);
                                        Color color202 = robot1.getPixelColor(1162, 836);

                                        if (color202.getRed() > 184) {
                                            LOGGER.info("ten16step2检测已经不在禁飞行地区");
                                            LOGGER.info("开始点R上升");
                                            robot.keyPress(KeyEvent.VK_R);//按下键盘按键 上升
                                            robot.delay(2000);//按住延迟
                                            LOGGER.info("上升2秒");
                                            robot.keyPress(KeyEvent.VK_W);//按下键盘按键 上升
                                            robot.keyPress(KeyEvent.VK_D);//按下键盘按键 上升
                                            robot.delay((int) v4);//按住延迟
                                            LOGGER.info("上升2秒");
                                            robot.keyRelease(KeyEvent.VK_D);
                                            robot.delay(2000);
                                            robot.keyRelease(KeyEvent.VK_W);
                                            robot.keyRelease(KeyEvent.VK_R);
                                            LOGGER.info("ten16step2开始进入ten_step =3");

                                            localTenStep.set(3);
                                            break ;
                                        }
                                        LOGGER.info("等待12秒");
                                        Thread.sleep(12000);

                                    }


                                }
                            }
                            Thread.sleep(1000);

                        }

                    }

                    if (localTenStep.get() == 3) {
                        LOGGER.info("进入ten16step3");
                        Rectangle screenRange = new Rectangle(1267, 12, 167, 167);
                        String keyword = "小地图奥德图标";
                        String folderPath = "D:/截图/正确截图";
                        int similarity = 95;
                        int n = 1; // 获取第一近的点
                        int keyToPress = KeyEvent.VK_6; // 按下并释放的键 (例如 6)
                        long delayAfterCombinedMethod = CombinedTask.combinedMethod(screenRange, keyword, folderPath, similarity, n, keyToPress);
                        LOGGER.info("ten16step3找最近的点");

                        Thread.sleep(c);
                        LOGGER.info("ten16step3开始进入step7");
                        localTenStep.set(7);
                    }
                    if (localTenStep.get() == 4) {
                        LOGGER.info("进入ten16step4");// 10次没采到
                        Rectangle screenRange = new Rectangle(1267, 12, 167, 167);
                        String keyword = "小地图奥德图标";
                        String folderPath = "D:/截图/正确截图";
                        int similarity = 95;
                        int n = 2; // 获取第二近的点
                        int keyToPress = KeyEvent.VK_6; // 按下并释放的键 (例如 6)
                        long delayAfterCombinedMethod = CombinedTask.combinedMethod(screenRange, keyword, folderPath, similarity, n, keyToPress);
                        LOGGER.info("ten16step4找第二近的点");

                        Thread.sleep(c);
                        localTenStep.set(7);

                    }
                    if (localTenStep.get() == 5) {

                        LOGGER.info("进入ten16step5");

                        Color color4 = robot1.getPixelColor(616, 661);
                        if (color4.getRed() > 210) {
                            System.out.println("Color at (616, 661): " + color4);
                            ten_3[0].setValue(1);

                            LOGGER.info("ten16step5成功率出现等待");


                        }else{
                            LOGGER.info("ten16step5成功率未出现按6");
                            robot1.delay(200);

                            robot1.keyPress(KeyEvent.VK_6);                //如果没采集
                            robot1.delay(c);
                            robot1.keyRelease(KeyEvent.VK_6);

                            Color color1 = robot1.getPixelColor(787, 309);
                            Color color2 = robot1.getPixelColor(770, 309);
                            if (color1.getRed() > 251 & color2.getRed() > 251){
                                LOGGER.info("ten2=16step5周围没有奥德出现去step3");
                                robot1.delay(c);
                                robot1.keyPress(KeyEvent.VK_A);
                                robot1.delay(c);
                                robot1.delay(1000);
                                robot1.keyRelease(KeyEvent.VK_A);
                                robot1.delay(2500);
                                localTenStep.set(3);
                                LOGGER.info("localTenStep.set(3) was executed");
                                continue;


                            }
                            robot1.delay(1000);
                            localTenStep.set(5);
                        }

                    }
                    if (localTenStep.get() == 6) {
                        robot1.keyPress(KeyEvent.VK_W);
                        robot1.keyPress(KeyEvent.VK_D);
                        robot1.delay(1000);
                        robot1.keyRelease(KeyEvent.VK_D);
                        robot1.delay(1000);
                        robot1.keyPress(KeyEvent.VK_W);
                        Thread.sleep(c);

                    }
                    if (localTenStep.get() == 7) {
                        LOGGER.info("ten16step7进入循环");
                        robot1.delay(200);

                        robot1.keyPress(KeyEvent.VK_6);                //如果没采集
                        robot1.delay(c);
                        robot1.keyRelease(KeyEvent.VK_6);
                        robot1.delay(1000);
                        LOGGER.info("ten16step7进入循环按6");


                        for(;;){
                            LOGGER.info("ten16step7进入for循环");
                            if (localTenStep.get() != 7) {
                                break;
                            }

                            int[][] colors = {
                                    {787, 309, 255, 234, 183},//找不到奥德目标
                                    {770, 309, 255, 234, 183},
                                    {791, 309, 255, 234, 183},//等级不够采不到
                                    {706, 309, 255, 234, 183},
                                    {761, 307, 255, 234, 183},//其他人在采集
                                    {722, 312, 255, 234, 183},// x1, y1, red1
                            };
                            int timeoutSeconds = 20;
                            int keyDelayMin = 600;
                            int keyDelayMax = 900;
                            AtomicBoolean stopChecking = new AtomicBoolean(false);
                            int color5X = 616;
                            int color5Y = 661;

                            CustomState customState = new CustomState();
                            double finalV = v2;
                            double finalV1 = v3;
                            double finalV2 = v7;
                            Runnable commandA = () -> {
                                LOGGER.info("ten16step7周围没有可采奥德重复一次");
                                ten_3[0].increment();

                                if (ten_3[0].getValue() % 3 == 0) {
                                    Runnable bCommand = () -> {
                                        while (!Thread.currentThread().isInterrupted()) {
                                            LOGGER.info("判断ten16step7是否可以吃药");
                                            Color color23331 = robot1.getPixelColor(964, 849);
                                            Color color1991 = robot1.getPixelColor(1178, 831);

                                            if (color23331.getRed() > 200 & color1991.getGreen() < 60) {
                                                LOGGER.info("ten4判断可以吃药和恢复飞行技能");
                                                robot1.delay(c);//按住一秒1秒后
                                                robot1.keyPress(KeyEvent.VK_EQUALS);//按住enter
                                                robot1.delay(c);//按住一秒1秒后
                                                robot1.keyRelease(KeyEvent.VK_EQUALS);
                                                robot1.delay(c);
                                                robot1.keyPress(KeyEvent.VK_0);
                                                robot1.delay(c);//按住一秒1秒后
                                                robot1.keyRelease(KeyEvent.VK_0);
                                                LOGGER.info("点击=和0吃药和恢复飞行技能");
                                                robot1.delay(c);
                                            }
                                            Color color2101 = robot1.getPixelColor(1155, 826);
                                            if (color2101.getGreen() < 30 ) {
                                                LOGGER.info("判断1ten16step7没有飞行时间准备进入ten_step = 2");
                                                localTenStep.set(2);
                                                break ;
                                            }
                                            Color color29 = robot1.getPixelColor(114, 756);//确定位置在莫点2
                                            Color color31 = robot1.getPixelColor(112, 760);
                                            Color color16 = robot1.getPixelColor(204, 886);
                                            Color color30 = robot1.getPixelColor(208, 887);// 确定位置在莫尔点1
                                            if (color29.getRed() > 160 & color16.getRed() > 145 & color30.getRed() > 135 & color31.getRed() > 115) {
                                                LOGGER.info("ten16step7ten_3[0].getValue() == 3确定位置在阿尔准备进入step1");
                                                localTenStep.set(1);
                                                break ;
                                            }
                                            try {
                                                Thread.sleep(1000);
                                            } catch (InterruptedException e) {
                                                Thread.currentThread().interrupt();
                                            }
                                        }
                                    };

// 创建并启动B命令线
                                    Thread bCommandThread = new Thread(bCommand);
                                    bCommandThread.start();
                                    if (ten_3[0].getValue() <= 15) {

                                        System.out.println("2执行 D命令，ten_3 = " + ten_3[0].getValue());
// 执行A命令的代码
                                        robot1.keyPress(KeyEvent.VK_W);
                                        robot1.keyPress(KeyEvent.VK_D);
                                        robot1.delay(500);
                                        robot1.keyRelease(KeyEvent.VK_D);
                                        robot1.delay((int) finalV2);
                                        robot1.keyPress(KeyEvent.VK_W);
                                        robot1.delay(100);


                                        bCommandThread.interrupt();
                                        System.out.println("Before setting ten_step to 3");
                                        localTenStep.set(3);
                                        return;
// A命令执行完毕后，终止B命令线程

                                    }
                                    if (ten_3[0].getValue() >= 15 && ten_3[0].getValue() <= 30) {


                                        System.out.println("2执行 A 命令，ten_3 = " + ten_3[0].getValue());
                                        robot1.keyPress(KeyEvent.VK_W);
                                        robot1.keyPress(KeyEvent.VK_A);
                                        robot1.delay(500);
                                        robot1.keyRelease(KeyEvent.VK_A);
                                        robot1.delay((int) finalV2);
                                        robot1.keyPress(KeyEvent.VK_W);
                                        robot1.delay(100);
                                        LOGGER.info("2开始进入ten16step3");
                                        localTenStep.set(3);
                                        return;

                                    }
                                    if (ten_3[0].getValue() == 33) {                         // 33次没采到
                                        System.out.println("ten16step7周围没有奥德准备摔死，ten_3 = " + ten_3[0].getValue());
                                        robot1.keyPress(KeyEvent.VK_R);                //如果没采集
                                        robot1.delay(10000);
                                        robot1.keyRelease(KeyEvent.VK_R);
                                        robot1.delay(100);
                                        robot.mouseMove(1160 + (int) v1, 850 + (int) v1); //
                                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                        robot.delay(20);
                                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                        ten_3[0].setValue(1);
                                        robot1.delay(20000);


                                        boolean condition3;
                                        boolean condition4;
                                        boolean condition9;
                                        boolean condition10;

                                        while (true) {
                                            // 获取颜色值
                                            Color color29 = robot1.getPixelColor(625, 705);
                                            Color color31 = robot1.getPixelColor(813, 705);
                                            Color color28 = robot1.getPixelColor(1196, 111);
                                            Color color30 = robot1.getPixelColor(1193, 114);

                                            System.out.println("3Color at (625, 705): " + color29);
                                            System.out.println("3Color at (813, 705): " + color31);
                                            System.out.println("3Color at (1196, 111): " + color28);
                                            System.out.println("3Color at (1193, 114): " + color30);


                                            // 检查条件
                                            condition3 = (color29.getRed() >= 23 - 4 && color29.getRed() <= 23 + 4) &&
                                                    (color29.getGreen() >= 30 - 4 && color29.getGreen() <= 30 + 4) &&
                                                    (color29.getBlue() >= 41 - 4 && color29.getBlue() <= 41 + 4);

                                            condition4 = (color31.getRed() >= 23 - 4 && color31.getRed() <= 23 + 4) &&
                                                    (color31.getGreen() >= 30 - 4 && color31.getGreen() <= 30 + 4) &&
                                                    (color31.getBlue() >= 41 - 4 && color31.getBlue() <= 41 + 4);

                                            condition9 = (color28.getRed() >= 249 - 4 && color28.getRed() <= 249 + 4) &&
                                                    (color28.getGreen() >= 244 - 4 && color28.getGreen() <= 244 + 4) &&
                                                    (color28.getBlue() >= 202 - 4 && color28.getBlue() <= 202 + 4);

                                            condition10 = (color30.getRed() >= 21 - 4 && color30.getRed() <= 21 + 4) &&
                                                    (color30.getGreen() >= 34 - 4 && color30.getGreen() <= 34 + 4) &&
                                                    (color30.getBlue() >= 42 - 4 && color30.getBlue() <= 42 + 4);

                                            // 如果满足条件，则跳出循环
                                            if ((condition3 && condition4) || (condition9 && condition10)) {
                                                break;
                                            }
                                            LOGGER.info("ten16stepten3=33条件不满足点89");

                                            // 如果条件不满足，继续执行循环中的其他操作
                                            int delayBetweenKeyPresses = 100 + random.nextInt(301);
                                            int delayBetweenKeyPresses1 = 500 + random.nextInt(500);
                                            int delayBetweenKeyPresses2 = 500 + random.nextInt(100);
                                            robot.keyPress(KeyEvent.VK_8);
                                            robot.delay(delayBetweenKeyPresses); // 延迟，以确保按键被识别
                                            robot.keyRelease(KeyEvent.VK_8);

                                            // 生成 100-400 毫秒的随机延迟

                                            robot.delay(delayBetweenKeyPresses1);

                                            // 模拟按下键 9
                                            robot.keyPress(KeyEvent.VK_9);
                                            robot.delay(delayBetweenKeyPresses);// 延迟，以确保按键被识别
                                            robot.keyRelease(KeyEvent.VK_9);
                                            robot.delay(delayBetweenKeyPresses2);

                                            // 休眠 300 毫秒
                                            try {
                                                Thread.sleep(300);
                                            } catch (InterruptedException e) {
                                                Thread.currentThread().interrupt();
                                            }
                                        }
                                        robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                                        robot.delay(50);
                                        robot.keyRelease(KeyEvent.VK_E);
                                        robot.delay(50);
                                        robot.keyRelease(KeyEvent.VK_Q);
                                        robot.delay(50);//按住延迟
                                        robot.keyRelease(KeyEvent.VK_D);
                                        robot.delay(50);//按住延迟
                                        robot.keyRelease(KeyEvent.VK_A);//释放键盘按键
                                        LOGGER.info("ten16step7ten_3[0].getValue() == 9点9回城条出现释放WADQE等待25秒");
                                        robot.delay(25000);
                                        LOGGER.info("ten16step7ten_3[0].getValue() == 9点9回城条出现释放WADQE等待25秒完毕");


                                    }


                                }


                                robot1.delay(c);
                                LOGGER.info("ten16step7准备进入ten4steap4");

                                localTenStep.set(4);
                                return;

                            };
                            Optional<Runnable> commandB = Optional.empty();

                            Supplier<Boolean> stopCondition = () -> {
                                try {
                                    Robot robot2 = new Robot();
                                    Color color5 = robot2.getPixelColor(color5X, color5Y);

                                    Color color121 = robot1.getPixelColor(553, 380);
                                    System.out.println("Color at (553, 380): " + color121);
                                    Color color122 = robot1.getPixelColor(562, 381);
                                    System.out.println("Color at (562, 381): " + color122);
                                    Color color8 = robot2.getPixelColor(1196, 111);
                                    System.out.println("Color at (1196, 111): " + color8);
                                    Color color9 = robot2.getPixelColor(1193, 114);
                                    System.out.println("Color at (1193, 114): " + color9);
                                    Color color10 = robot2.getPixelColor(625, 705);
                                    System.out.println("Color at (608, 699): " + color10);
                                    Color color11 = robot2.getPixelColor(813, 705);
                                    System.out.println("Color at (830, 699): " + color11);

                                    boolean condition1 = color5.getRed() > 210;//成功率出现

                                    boolean condition8 = color8.getRed() > 245&color8.getRed() < 253&color8.getGreen() < 248&color8.getGreen() > 240
                                            &color8.getBlue() > 198&color8.getBlue() < 206;

                                    boolean condition9 = color9.getRed() > 17&color9.getRed() < 25&color9.getGreen() < 38&color9.getGreen() > 30
                                            &color9.getBlue() > 38&color9.getBlue() < 46;//摔死虚弱出现
                                    boolean condition3 = color121.getRed() > 182&color121.getRed() < 190&color121.getGreen() < 191&color121.getGreen() > 183
                                            &color121.getBlue() > 153&color121.getBlue() < 161;
                                    boolean condition4 = color122.getRed() > 209&color122.getRed() < 217&color122.getGreen() < 215&color122.getGreen() > 207
                                            &color122.getBlue() > 169&color122.getBlue() < 177;//死亡复活提示出现
                                    boolean condition10 = color10.getRed() > 19&color10.getRed() < 27&color10.getGreen() < 34&color10.getGreen() > 26
                                            &color10.getBlue() > 37&color10.getBlue() < 45;
                                    boolean condition11 = color11.getRed() > 19&color11.getRed() < 27&color11.getGreen() < 34&color11.getGreen() > 26
                                            &color11.getBlue() > 37&color11.getBlue() < 45;//紧急返回提示出现

                                    return condition1 || condition8&condition9||condition3&condition4||condition10&condition11;
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                    return true;
                                }
                            };
                            ColorChecker3.checkColorAndExecuteCommandWithTimeout(customState, colors, timeoutSeconds, keyDelayMin, keyDelayMax,
                                    commandA, commandB, stopChecking, stopCondition, KeyEvent.VK_6);


                            Color color5 = robot1.getPixelColor(616, 661);
                            System.out.println("Color at (616, 661): " + color5);

                            if (color5.getRed() > 210) {

                                LOGGER.info("ten16step7成功率出现进入step5");
                                ten_3[0].setValue(1);
                                System.out.println("ten_3 has been reset to: " + ten_3[0].getValue());
                                stopChecking.set(true);
                                localTenStep.set(5);
                                break ;

                            }
                            Color color2101 = robot1.getPixelColor(1159, 825);
                            if (color2101.getGreen() < 30 ) {
                                LOGGER.info("判断2ten16step7没有飞行时间准备进入ten_step = 2");

                                localTenStep.set(2);
                                break ;
                            }

                            boolean condition8 = ColorChecker.checkColorAndExecuteCommand(robot, 1196, 111, 249, 244, 202,
                                    () -> {});
                            boolean condition9 = ColorChecker.checkColorAndExecuteCommand(robot, 1193, 114, 21, 34, 42,
                                    () -> {});
                            Color color8 = robot.getPixelColor(1196, 111);
                            System.out.println("2Color at (1196, 111): " + color8);
                            Color color9 = robot.getPixelColor(1193, 114);
                            System.out.println("2Color at (1193, 114): " + color9);

                            if (condition8&condition9) {
                                LOGGER.info("判断ten16step7虚弱出现疑似摔死");
                                robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_E);
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_Q);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_D);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_A);//释放键盘按键

                                LOGGER.info("开始进入ten16step1循环");
                                localTenStep.set(1);
                                break ;
                            }
                            Color color121 = robot1.getPixelColor(553, 380);
                            System.out.println("2Color at (553, 380): " + color121);
                            Color color122 = robot1.getPixelColor(562, 381);
                            System.out.println("2Color at (562, 381): " + color122);
                            if (color121.getRed() > 182&color121.getRed() < 190&color121.getGreen() < 191&color121.getGreen() > 183
                                    &color121.getBlue() > 153&color121.getBlue() < 161&color122.getRed() > 209&color122.getRed() < 217&color122.getGreen() < 215&color122.getGreen() > 207
                                    &color122.getBlue() > 169&color122.getBlue() < 177) {
                                LOGGER.info("ten16step7死亡复活提示出现释放WADQE");
                                robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_E);
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_Q);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_D);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_A);
                                robot.delay(50);
                                robot.mouseMove(842 + (int) v1, 479 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                robot.delay(20);
                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                robot.delay(50);
                                LOGGER.info("点击死亡确认并开始进入ten_step =1");
                                LOGGER.info("开始进入ten16step1循环");
                                localTenStep.set(1);
                                break ;
                            }
                            boolean condition3 = ColorChecker.checkColorAndExecuteCommand(robot, 625, 705, 23, 30, 41,
                                    () -> {});

                            boolean condition4 = ColorChecker.checkColorAndExecuteCommand(robot, 813, 705, 23, 30, 41,
                                    () -> {});

                            if (condition3 && condition4) {
                                LOGGER.info("ten16step7点9回城条出现释放WADQE等待25秒");
                                robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_E);
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_Q);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_D);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_A);//释放键盘按键
                                Thread.sleep(25000);
                                for(;;){
                                    Color color29 = robot1.getPixelColor(114, 756);//确定位置在莫点2
                                    Color color31 = robot1.getPixelColor(112, 760);
                                    Color color16 = robot1.getPixelColor(204, 886);
                                    Color color30 = robot1.getPixelColor(208, 887);// 确定位置在莫尔点1
                                    if (color29.getRed() > 160 & color16.getRed() > 145 & color30.getRed() > 135 & color31.getRed() > 115) {
                                        LOGGER.info("ten16step7点9确定在莫尔回城处准备进入ten_step =8");
                                        localTenStep.set(8);
                                        break ;
                                    }else{
                                        LOGGER.info("ten16step7点9确定不在莫尔回城处准备开始点8和9");
                                        int delayBetweenKeyPresses = 100 + random.nextInt(301);
                                        int delayBetweenKeyPresses1 = 500 + random.nextInt(500);
                                        int delayBetweenKeyPresses2 = 500 + random.nextInt(100);
                                        robot.keyPress(KeyEvent.VK_8);
                                        robot.delay(delayBetweenKeyPresses); // 延迟，以确保按键被识别
                                        robot.keyRelease(KeyEvent.VK_8);

                                        // 生成 100-400 毫秒的随机延迟

                                        robot.delay(delayBetweenKeyPresses1);

                                        // 模拟按下键 9
                                        robot.keyPress(KeyEvent.VK_9);
                                        robot.delay(delayBetweenKeyPresses);// 延迟，以确保按键被识别
                                        robot.keyRelease(KeyEvent.VK_9);
                                        robot.delay(delayBetweenKeyPresses2);
                                    }
                                }
                            }
                        }
                    }
                    if (localTenStep.get() == 8) {

                        LOGGER.info("进入ten16step8准备释放weqda");
                        robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                        robot.delay(50);
                        robot.keyRelease(KeyEvent.VK_E);
                        robot.delay(50);
                        robot.keyRelease(KeyEvent.VK_Q);
                        robot.delay(50);//按住延迟
                        robot.keyRelease(KeyEvent.VK_D);
                        robot.delay(50);//按住延迟
                        robot.keyRelease(KeyEvent.VK_A);
                        for(;;){
                            Color color121 = robot1.getPixelColor(553, 380);
                            System.out.println("2Color at (553, 380): " + color121);
                            Color color122 = robot1.getPixelColor(562, 381);
                            System.out.println("2Color at (562, 381): " + color122);
                            if (color121.getRed() > 182&color121.getRed() < 190&color121.getGreen() < 191&color121.getGreen() > 183
                                    &color121.getBlue() > 153&color121.getBlue() < 161&color122.getRed() > 209&color122.getRed() < 217&color122.getGreen() < 215&color122.getGreen() > 207
                                    &color122.getBlue() > 169&color122.getBlue() < 177) {
                                LOGGER.info("ten16step8死亡复活提示出现");
                                robot.mouseMove(842 + (int) v1, 479 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                robot.delay(20);
                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                robot.delay(50);

                                LOGGER.info("开始进入ten16step1循环");
                                localTenStep.set(1);
                                break ;
                            }
                            Color color29 = robot1.getPixelColor(114, 756);//确定位置在莫点2
                            Color color31 = robot1.getPixelColor(112, 760);
                            Color color16 = robot1.getPixelColor(204, 886);
                            Color color30 = robot1.getPixelColor(208, 887);// 确定位置在莫尔点1
                            if (color29.getRed() > 160 & color16.getRed() > 145 & color30.getRed() > 135 & color31.getRed() > 115) {
                                LOGGER.info("开始进入ten16step1循环");
                                localTenStep.set(1);
                                break ;
                            }



                        }}

                    LOGGER.info("在循环重新开始之前，localTenStep的值为：" + localTenStep.get());


                }
            }//在莫尔开始采集，75~100升级，100级后进入5循环
            if (ten_1 == 21) {
                final Counter[] ten_3 = {new Counter(0)};
                LOGGER.info("初始化3");

                AtomicInteger localTenStep = new AtomicInteger(1);

                outerLoop2:

                for (;;) {

                    LOGGER.info("进入21循环");
                    Color color2333 = robot1.getPixelColor(964, 849);
                    Color color199 = robot1.getPixelColor(1178, 831);

                    Color color208 = robot1.getPixelColor(143, 754);
                    Color color209 = robot1.getPixelColor(616, 661);
                    Color color210 = robot1.getPixelColor(1159, 825);

                    if (color2333.getRed() > 200 & color199.getGreen() < 60) {
                        LOGGER.info("ten21判断可以吃药和恢复飞行技能");
                        robot1.keyPress(KeyEvent.VK_EQUALS);//按住enter
                        robot1.delay(c);//按住一秒1秒后
                        robot1.keyRelease(KeyEvent.VK_EQUALS);
                        robot1.delay(c);
                        robot1.keyPress(KeyEvent.VK_0);
                        robot1.delay(c);//按住一秒1秒后
                        robot1.keyRelease(KeyEvent.VK_0);
                        LOGGER.info("点击=和0吃药和恢复飞行技能");
                    }
                    if (color210.getGreen() < 30 ) {
                        LOGGER.info("ten21判断飞行时间不够");
                        robot1.keyRelease(KeyEvent.VK_W);
                        Thread.sleep(c);
                        robot1.keyRelease(KeyEvent.VK_D);
                        LOGGER.info("ten21关掉W和D并开始下降10秒");
                        robot.keyPress(KeyEvent.VK_F);//按下键盘按键 上升
                        robot.delay(15000);//按住延迟
                        robot.keyRelease(KeyEvent.VK_F); //释放键盘按键
                        Thread.sleep(200); //延迟
                        LOGGER.info("ten21等待飞行时间恢复");
                        for(;;){
                            boolean condition1 = ColorChecker.checkColorAndExecuteCommand(robot, 1162, 825, 41, 117, 5,
                                    () -> {});
                            if (condition1) {
                                LOGGER.info("ten21飞行时间已恢复满");
                                Color color111 = robot1.getPixelColor(1160, 845);

                                if (color111.getRed() > 184) {
                                    LOGGER.info("ten21检测是可飞行地区");
                                    Color color29 = robot1.getPixelColor(114, 756);//确定位置在莫点2
                                    Color color31 = robot1.getPixelColor(112, 760);
                                    Color color16 = robot1.getPixelColor(204, 886);
                                    Color color30 = robot1.getPixelColor(208, 887);// 确定位置在莫尔点1
                                    if (color29.getRed() > 160 & color16.getRed() > 145 & color30.getRed() > 135 & color31.getRed() > 115) {
                                        LOGGER.info("ten16检测已回城从ten16step1重新开始");
                                        localTenStep.set(1);
                                        break;
                                    }       //如果是超时需要这一步，其他地方采记得改这里

                                    LOGGER.info("ten21开始起飞");
                                    KeyUtil.pressKey(robot, KeyEvent.VK_R,-1 );
                                    KeyUtil.pressKey(robot, KeyEvent.VK_F,-1 );
                                    LOGGER.info("ten21停止前进并点击起飞按键");
                                    MouseUtil.moveWithCurve(robot, 1160+ (int) v1, 850+ (int) v1);
                                    Thread.sleep(1000); //延迟
                                    robot.delay(4500);//按住延迟
                                    LOGGER.info("开始上升");
                                    robot.keyPress(KeyEvent.VK_R);//按下键盘按键 上升
                                    robot.delay(2000);//按住延迟
                                    robot.keyRelease(KeyEvent.VK_R); //释放键盘按键
                                    Thread.sleep(200); //延迟
                                    LOGGER.info("ten21开始进入step3");
                                    localTenStep.set(3);
                                    break;
                                }else{
                                    for(;;){
                                        LOGGER.info("ten21检测是禁飞行地区");
                                        robot1.keyPress(KeyEvent.VK_SPACE);
                                        robot1.delay(300);
                                        robot1.keyRelease(KeyEvent.VK_SPACE);
                                        robot.delay(100);
                                        robot.mouseMove(1160 + (int) v1, 850 + (int) v1); //
                                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                        robot.delay(20);
                                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                        LOGGER.info("跳跃起飞");
                                        robot.delay(2000);
                                        Color color22 = robot1.getPixelColor(1162, 836);

                                        if (color22.getRed() > 184) {
                                            LOGGER.info("检测已经不在禁飞行地区");
                                            LOGGER.info("开始点R上升");
                                            robot.keyPress(KeyEvent.VK_R);//按下键盘按键 上升
                                            robot.delay(2000);//按住延迟
                                            LOGGER.info("上升2秒");
                                            robot.keyPress(KeyEvent.VK_W);//按下键盘按键 上升
                                            robot.keyPress(KeyEvent.VK_D);//按下键盘按键 上升
                                            robot.delay((int) v4);//按住延迟
                                            LOGGER.info("上升2秒");
                                            robot.keyRelease(KeyEvent.VK_D);
                                            robot.delay(2000);
                                            robot.keyRelease(KeyEvent.VK_W);
                                            robot.keyRelease(KeyEvent.VK_R);
                                            LOGGER.info("ten16开始进入ten_step =3");

                                            localTenStep.set(3);
                                            break outerLoop2;
                                        }
                                        LOGGER.info("等待12秒");
                                        Thread.sleep(12000);

                                    }


                                }
                            }
                            Thread.sleep(1000);

                        }}
                    boolean condition5 = ColorChecker.checkColorAndExecuteCommand(robot, 1196, 111, 249, 244, 202,
                            () -> {});
                    boolean condition6 = ColorChecker.checkColorAndExecuteCommand(robot, 1193, 114, 21, 34, 42,
                            () -> {});


                    if (condition5&condition6) {

                        LOGGER.info("ten21判断虚弱");
                        robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                        robot.delay(50);
                        robot.keyRelease(KeyEvent.VK_E);
                        robot.delay(50);
                        robot.keyRelease(KeyEvent.VK_Q);
                        robot.delay(50);//按住延迟
                        robot.keyRelease(KeyEvent.VK_D);
                        robot.delay(50);//按住延迟
                        robot.keyRelease(KeyEvent.VK_A);
                        LOGGER.info("开始进入ten21step1循环");
                        localTenStep.set(1);
                        break;
                    }
                    Color color22 = robot1.getPixelColor(1397, 327);// 100级是绿色


                    boolean condition7 = ColorChecker.checkColorAndExecuteCommand(robot, 1122, 303, 214, 213, 174,
                            () -> {});//中级的中点1

                    boolean condition13 = ColorChecker.checkColorAndExecuteCommand(robot, 1122, 309, 198, 197, 163,
                            () -> {});//中级的中点2


                    if (condition7 && condition13&color22.getGreen() > 148) {
                        LOGGER.info("判断ten21升级到200级开始进入ten20");


                        ten_1 =20 ;
                        continue outerLoop5;

                    }

                    if (localTenStep.get() == 1) {

                        //去的路径
                        LOGGER.info("进入ten21step1");

                        Color color207 = robot1.getPixelColor(143, 756);
                        System.out.println("Color at (143, 756): " + color207);
                        if (color207.getRed() > 114) {

                            if (condition5&condition6) {
                                LOGGER.info("ten21step1判断有虚弱休息240秒");
                                robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_E);
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_Q);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_D);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_A);
                                Thread.sleep(240000);
                            }
                            LOGGER.info("ten16step1往前走");
                            Thread.sleep(200); //延迟
                            robot1.keyPress(KeyEvent.VK_W);//往前走
                            localTenStep.set(9);
                            outerLoop4:
                            for (;;){
                                LOGGER.info("ten21step1进入for循环");
                                if (localTenStep.get() == 9){
                                    LOGGER.info("进入ten21step9");
                                    Color color32 = robot1.getPixelColor(253, 840); // 转向
                                    System.out.println("Color at (253, 840): " + color207);
                                    if (color32.getRed() > 180) {
                                        LOGGER.info("ten21step1判断转向1");
                                        AngleCalculatorTask task = new AngleCalculatorTask(robot, 141, 751);
                                        Thread.sleep(100);

                                        LOGGER.info("5-1");

                                        task.run();
                                        localTenStep.set(10);
                                        LOGGER.info("localTenStep.set(10) was executed");
                                        continue;


                                    }}
                                if (localTenStep.get() == 10){
                                    AngleCalculatorTask task = new AngleCalculatorTask(robot, 141, 751);
                                    Thread.sleep(100);

                                    LOGGER.info("5-1");

                                    task.run();

                                    int[][] colors = {
                                            {63, 857, 165} // x1, y1, red1
                                    };
                                    Color color206 = robot1.getPixelColor(253, 840);
                                    System.out.println("Color at (253, 840): " + color206);
                                    ColorChecker2 colorCheckerInstance = new ColorChecker2();

                                    CountDownLatch latch = new CountDownLatch(1);
                                    colorCheckerInstance.setLatch(latch);
                                    CustomState customState = new CustomState();
                                    ColorChecker2.checkColorAndExecuteCommandWithTimeout(customState, colors, 30, 600, 900,
                                            () -> {
                                                double v9 = 0.03 + random.nextDouble() * (0.03 - 0.01);//定义随机延迟在0.05-0.01秒之间 鼠标的延迟 robot.delay((int) v);

                                                v9 = v9 * 1000;

                                                LOGGER.info("ten21step1判断走到起飞点附近");
                                                robot.keyRelease(KeyEvent.VK_W); //释放键盘按键

                                                LOGGER.info("停止前进并点击起飞按键");

                                                robot.mouseMove(1160 + (int) v1, 850 + (int) v1); // 鼠标移动到xx坐标轴 点击阻止
                                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                                robot.delay((int) v9);
                                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                                robot.delay(200);


                                                LOGGER.info("开始点R上升");
                                                robot.keyPress(KeyEvent.VK_R);//按下键盘按键 上升
                                                robot.delay(4500);//按住延迟
                                                LOGGER.info("上升4.5秒停止");
                                                robot.keyRelease(KeyEvent.VK_R); //释放键盘按键

                                                LOGGER.info("ten21step1开始进入step = 3");
                                                colorCheckerInstance.getLatch().countDown();


                                            },
                                            Optional.empty());
                                    try {
                                        latch.await(); // 等待 run() 方法执行完成
                                        localTenStep.set(3);
                                        break outerLoop4;
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }}



                            }

                        } else {
                            LOGGER.info("ten21step1角度不对开始转向3");
                            robot1.keyPress(KeyEvent.VK_D);
                            robot1.delay(20);
                            robot1.keyRelease(KeyEvent.VK_D);
                            Thread.sleep(200);
                            LOGGER.info("开始回到step = 1");
                            localTenStep.set(1);

                        }}





                    if (localTenStep.get() == 2){

                        LOGGER.info("进入ten21step2");
                        robot1.keyRelease(KeyEvent.VK_W);
                        Thread.sleep(c);
                        robot1.keyRelease(KeyEvent.VK_D);
                        LOGGER.info("关掉W和D并开始下降10秒");
                        robot.keyPress(KeyEvent.VK_F);//按下键盘按键 上升
                        robot.delay(15000);//按住延迟
                        robot.keyRelease(KeyEvent.VK_F); //释放键盘按键
                        Thread.sleep(200); //延迟
                        LOGGER.info("等待飞行时间恢复");
                        for(;;){
                            boolean condition1 = ColorChecker.checkColorAndExecuteCommand(robot, 1162, 825, 41, 117, 5,
                                    () -> {});
                            if (condition1) {
                                LOGGER.info("ten21step2飞行时间已恢复满");
                                Color color111 = robot1.getPixelColor(1160, 845);



                                if (color111.getRed() > 184) {
                                    LOGGER.info("ten21step2检测是可飞行地区");
                                    Color color29 = robot1.getPixelColor(114, 756);//确定位置在莫点2
                                    Color color31 = robot1.getPixelColor(112, 760);
                                    Color color16 = robot1.getPixelColor(204, 886);
                                    Color color30 = robot1.getPixelColor(208, 887);// 确定位置在莫尔点1
                                    if (color29.getRed() > 160 & color16.getRed() > 145 & color30.getRed() > 135 & color31.getRed() > 115) {
                                        LOGGER.info("检测已回城从ten21step1重新开始");
                                        localTenStep.set(1);
                                        break;
                                    }       //如果是超时需要这一步，其他地方采记得改这里

                                    LOGGER.info("ten21step2开始起飞");
                                    KeyUtil.pressKey(robot, KeyEvent.VK_R,-1 );
                                    KeyUtil.pressKey(robot, KeyEvent.VK_F,-1 );
                                    LOGGER.info("停止前进并点击起飞按键");
                                    MouseUtil.moveWithCurve(robot, 1160+ (int) v1, 850+ (int) v1);
                                    Thread.sleep(1000); //延迟
                                    robot.delay(4500);//按住延迟
                                    LOGGER.info("开始上升");
                                    robot.keyPress(KeyEvent.VK_R);//按下键盘按键 上升
                                    robot.delay(2000);//按住延迟
                                    robot.keyRelease(KeyEvent.VK_R); //释放键盘按键
                                    Thread.sleep(200); //延迟
                                    LOGGER.info("ten16step2开始进入step3");
                                    localTenStep.set(3);
                                    break;
                                }else{
                                    for(;;){
                                        LOGGER.info("ten16step2检测是禁飞行地区");
                                        robot1.keyPress(KeyEvent.VK_SPACE);
                                        robot1.delay(300);
                                        robot1.keyRelease(KeyEvent.VK_SPACE);
                                        robot.delay(100);
                                        robot.mouseMove(1160 + (int) v1, 850 + (int) v1); //
                                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                        robot.delay(20);
                                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                        LOGGER.info("跳跃起飞");
                                        robot.delay(2000);
                                        Color color202 = robot1.getPixelColor(1162, 836);

                                        if (color202.getRed() > 184) {
                                            LOGGER.info("ten16step2检测已经不在禁飞行地区");
                                            LOGGER.info("开始点R上升");
                                            robot.keyPress(KeyEvent.VK_R);//按下键盘按键 上升
                                            robot.delay(2000);//按住延迟
                                            LOGGER.info("上升2秒");
                                            robot.keyPress(KeyEvent.VK_W);//按下键盘按键 上升
                                            robot.keyPress(KeyEvent.VK_D);//按下键盘按键 上升
                                            robot.delay((int) v4);//按住延迟
                                            LOGGER.info("上升2秒");
                                            robot.keyRelease(KeyEvent.VK_D);
                                            robot.delay(2000);
                                            robot.keyRelease(KeyEvent.VK_W);
                                            robot.keyRelease(KeyEvent.VK_R);
                                            LOGGER.info("ten16step2开始进入ten_step =3");

                                            localTenStep.set(3);
                                            break ;
                                        }
                                        LOGGER.info("等待12秒");
                                        Thread.sleep(12000);

                                    }


                                }
                            }
                            Thread.sleep(1000);

                        }

                    }

                    if (localTenStep.get() == 3) {
                        LOGGER.info("进入ten21step3");
                        Rectangle screenRange = new Rectangle(1267, 12, 167, 167);
                        String keyword = "小地图奥德图标";
                        String folderPath = "D:/截图/正确截图";
                        int similarity = 95;
                        int n = 1; // 获取第一近的点
                        int keyToPress = KeyEvent.VK_5; // 按下并释放的键 (例如 6)
                        long delayAfterCombinedMethod = CombinedTask.combinedMethod(screenRange, keyword, folderPath, similarity, n, keyToPress);
                        LOGGER.info("ten21step3找最近的点");

                        Thread.sleep(c);
                        LOGGER.info("ten21step3开始进入step7");
                        localTenStep.set(7);
                    }
                    if (localTenStep.get() == 4) {
                        LOGGER.info("进入ten21step4");// 10次没采到
                        Rectangle screenRange = new Rectangle(1267, 12, 167, 167);
                        String keyword = "小地图奥德图标";
                        String folderPath = "D:/截图/正确截图";
                        int similarity = 95;
                        int n = 2; // 获取第二近的点
                        int keyToPress = KeyEvent.VK_5; // 按下并释放的键 (例如 6)
                        long delayAfterCombinedMethod = CombinedTask.combinedMethod(screenRange, keyword, folderPath, similarity, n, keyToPress);
                        LOGGER.info("ten21step4找第二近的点");

                        Thread.sleep(c);
                        localTenStep.set(7);

                    }
                    if (localTenStep.get() == 5) {

                        LOGGER.info("进入ten21step5");

                        Color color4 = robot1.getPixelColor(616, 661);
                        if (color4.getRed() > 210) {
                            System.out.println("Color at (616, 661): " + color4);
                            ten_3[0].setValue(1);
                            robot1.delay(500);
                            LOGGER.info("ten21step5成功率出现等待");



                        }else{
                            LOGGER.info("ten21step5成功率未出现按5");
                            robot1.delay(200);

                            robot1.keyPress(KeyEvent.VK_5);                //如果没采集
                            robot1.delay(c);
                            robot1.keyRelease(KeyEvent.VK_5);
                            boolean condition14 = ColorChecker.checkColorAndExecuteCommand(robot, 790, 309, 255, 234, 183,
                                    () -> {});//等级不够采不到

                            boolean condition15 = ColorChecker.checkColorAndExecuteCommand(robot, 750, 312, 255, 234, 183,
                                    () -> {});//等级不够采不到


                            Color color1 = robot1.getPixelColor(787, 309);//周围没有奥德
                            Color color2 = robot1.getPixelColor(770, 309);
                            if ((color1.getRed() > 251 & color2.getRed() > 251)|| (condition14 && condition15)){
                                LOGGER.info("ten2=21step5周围没有奥德出现去step3");
                                robot1.delay(c);
                                robot1.keyPress(KeyEvent.VK_A);
                                robot1.delay(c);
                                robot1.delay(1000);
                                robot1.keyRelease(KeyEvent.VK_A);
                                robot1.delay(2500);
                                localTenStep.set(3);
                                LOGGER.info("localTenStep.set(3) was executed");
                                continue;


                            }
                            boolean condition16 = ColorChecker.checkColorAndExecuteCommand(robot, 761, 307, 255, 234, 183,
                                    () -> {});//有其他人在采

                            boolean condition17 = ColorChecker.checkColorAndExecuteCommand(robot, 722, 312, 255, 234, 183,
                                    () -> {});//有其他人在采
                            if (condition16 & condition17){
                                LOGGER.info("ten2=21step5周围有其他人在采去step4");
                                robot1.delay(c);
                                robot1.keyPress(KeyEvent.VK_A);
                                robot1.delay(c);
                                robot1.delay(1000);
                                robot1.keyRelease(KeyEvent.VK_A);
                                robot1.delay(2500);
                                localTenStep.set(4);
                                LOGGER.info("localTenStep.set(4) was executed");
                                continue;
                            }
                            robot1.delay(1000);
                            localTenStep.set(5);
                        }

                    }
                    if (localTenStep.get() == 6) {
                        robot1.keyPress(KeyEvent.VK_W);
                        robot1.keyPress(KeyEvent.VK_D);
                        robot1.delay(1000);
                        robot1.keyRelease(KeyEvent.VK_D);
                        robot1.delay(1000);
                        robot1.keyPress(KeyEvent.VK_W);
                        Thread.sleep(c);

                    }
                    if (localTenStep.get() == 7) {
                        LOGGER.info("ten21step7进入循环");
                        robot1.delay(200);

                        robot1.keyPress(KeyEvent.VK_5);                //如果没采集
                        robot1.delay(c);
                        robot1.keyRelease(KeyEvent.VK_5);
                        robot1.delay(1000);
                        LOGGER.info("ten21step7进入循环按6");


                        for(;;){
                            LOGGER.info("ten21step7进入for循环");
                            if (localTenStep.get() != 7) {
                                break;
                            }

                            int[][] colors = {
                                    {787, 309, 255, 234, 183},//找不到奥德目标
                                    {770, 309, 255, 234, 183},
                                    {791, 309, 255, 234, 183},//等级不够采不到
                                    {706, 309, 255, 234, 183},
                                    {761, 307, 255, 234, 183},//其他人在采集
                                    {722, 312, 255, 234, 183},// x1, y1, red1
                            };
                            int timeoutSeconds = 20;
                            int keyDelayMin = 600;
                            int keyDelayMax = 900;
                            AtomicBoolean stopChecking = new AtomicBoolean(false);
                            int color5X = 616;
                            int color5Y = 661;

                            CustomState customState = new CustomState();
                            double finalV = v2;
                            double finalV1 = v3;
                            double finalV2 = v7;
                            Runnable commandA = () -> {
                                LOGGER.info("ten21step7周围没有可采奥德重复一次");
                                ten_3[0].increment();

                                if (ten_3[0].getValue() % 3 == 0) {
                                    Runnable bCommand = () -> {
                                        while (!Thread.currentThread().isInterrupted()) {
                                            LOGGER.info("判断ten21step7是否可以吃药");
                                            Color color23331 = robot1.getPixelColor(964, 849);
                                            Color color1991 = robot1.getPixelColor(1178, 831);

                                            if (color23331.getRed() > 200 & color1991.getGreen() < 60) {
                                                LOGGER.info("ten21判断可以吃药和恢复飞行技能");
                                                robot1.delay(c);//按住一秒1秒后
                                                robot1.keyPress(KeyEvent.VK_EQUALS);//按住enter
                                                robot1.delay(c);//按住一秒1秒后
                                                robot1.keyRelease(KeyEvent.VK_EQUALS);
                                                robot1.delay(c);
                                                robot1.keyPress(KeyEvent.VK_0);
                                                robot1.delay(c);//按住一秒1秒后
                                                robot1.keyRelease(KeyEvent.VK_0);
                                                LOGGER.info("点击=和0吃药和恢复飞行技能");
                                                robot1.delay(c);
                                            }
                                            Color color2101 = robot1.getPixelColor(1155, 826);
                                            if (color2101.getGreen() < 30 ) {
                                                LOGGER.info("判断1ten21step7没有飞行时间准备进入ten_step = 2");
                                                localTenStep.set(2);
                                                break ;
                                            }
                                            Color color29 = robot1.getPixelColor(114, 756);//确定位置在莫点2
                                            Color color31 = robot1.getPixelColor(112, 760);
                                            Color color16 = robot1.getPixelColor(204, 886);
                                            Color color30 = robot1.getPixelColor(208, 887);// 确定位置在莫尔点1
                                            if (color29.getRed() > 160 & color16.getRed() > 145 & color30.getRed() > 135 & color31.getRed() > 115) {
                                                LOGGER.info("ten21step7ten_3[0].getValue() == 3确定位置在阿尔准备进入step1");
                                                localTenStep.set(1);
                                                break ;
                                            }
                                            try {
                                                Thread.sleep(1000);
                                            } catch (InterruptedException e) {
                                                Thread.currentThread().interrupt();
                                            }
                                        }
                                    };

// 创建并启动B命令线
                                    Thread bCommandThread = new Thread(bCommand);
                                    bCommandThread.start();
                                    if (ten_3[0].getValue() <= 15) {

                                        System.out.println("ten212执行 D命令，ten_3 = " + ten_3[0].getValue());
// 执行A命令的代码
                                        robot1.keyPress(KeyEvent.VK_W);
                                        robot1.keyPress(KeyEvent.VK_D);
                                        robot1.delay(500);
                                        robot1.keyRelease(KeyEvent.VK_D);
                                        robot1.delay((int) finalV2);
                                        robot1.keyPress(KeyEvent.VK_W);
                                        robot1.delay(100);


                                        bCommandThread.interrupt();
                                        System.out.println("Before setting ten_step to 3");
                                        localTenStep.set(3);
                                        return;
// A命令执行完毕后，终止B命令线程

                                    }
                                    if (ten_3[0].getValue() >= 15 && ten_3[0].getValue() <= 30) {


                                        System.out.println("ten212执行 A 命令，ten_3 = " + ten_3[0].getValue());
                                        robot1.keyPress(KeyEvent.VK_W);
                                        robot1.keyPress(KeyEvent.VK_A);
                                        robot1.delay(500);
                                        robot1.keyRelease(KeyEvent.VK_A);
                                        robot1.delay((int) finalV2);
                                        robot1.keyPress(KeyEvent.VK_W);
                                        robot1.delay(100);
                                        LOGGER.info("2开始进入ten16step3");
                                        localTenStep.set(3);
                                        return;

                                    }
                                    if (ten_3[0].getValue() == 33) {                         // 33次没采到
                                        System.out.println("ten21step7周围没有奥德准备摔死，ten_3 = " + ten_3[0].getValue());
                                        robot1.keyPress(KeyEvent.VK_R);                //如果没采集
                                        robot1.delay(10000);
                                        robot1.keyRelease(KeyEvent.VK_R);
                                        robot1.delay(100);
                                        robot.mouseMove(1160 + (int) v1, 850 + (int) v1); //
                                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                        robot.delay(20);
                                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                        ten_3[0].setValue(1);
                                        robot1.delay(20000);


                                        boolean condition3;
                                        boolean condition4;
                                        boolean condition9;
                                        boolean condition10;

                                        while (true) {
                                            // 获取颜色值
                                            Color color29 = robot1.getPixelColor(625, 705);
                                            Color color31 = robot1.getPixelColor(813, 705);
                                            Color color28 = robot1.getPixelColor(1196, 111);
                                            Color color30 = robot1.getPixelColor(1193, 114);

                                            System.out.println("3Color at (625, 705): " + color29);
                                            System.out.println("3Color at (813, 705): " + color31);
                                            System.out.println("3Color at (1196, 111): " + color28);
                                            System.out.println("3Color at (1193, 114): " + color30);


                                            // 检查条件
                                            condition3 = (color29.getRed() >= 23 - 4 && color29.getRed() <= 23 + 4) &&
                                                    (color29.getGreen() >= 30 - 4 && color29.getGreen() <= 30 + 4) &&
                                                    (color29.getBlue() >= 41 - 4 && color29.getBlue() <= 41 + 4);

                                            condition4 = (color31.getRed() >= 23 - 4 && color31.getRed() <= 23 + 4) &&
                                                    (color31.getGreen() >= 30 - 4 && color31.getGreen() <= 30 + 4) &&
                                                    (color31.getBlue() >= 41 - 4 && color31.getBlue() <= 41 + 4);

                                            condition9 = (color28.getRed() >= 249 - 4 && color28.getRed() <= 249 + 4) &&
                                                    (color28.getGreen() >= 244 - 4 && color28.getGreen() <= 244 + 4) &&
                                                    (color28.getBlue() >= 202 - 4 && color28.getBlue() <= 202 + 4);

                                            condition10 = (color30.getRed() >= 21 - 4 && color30.getRed() <= 21 + 4) &&
                                                    (color30.getGreen() >= 34 - 4 && color30.getGreen() <= 34 + 4) &&
                                                    (color30.getBlue() >= 42 - 4 && color30.getBlue() <= 42 + 4);

                                            // 如果满足条件，则跳出循环
                                            if ((condition3 && condition4) || (condition9 && condition10)) {
                                                break;
                                            }
                                            LOGGER.info("ten21stepten3=33条件不满足点89");

                                            // 如果条件不满足，继续执行循环中的其他操作
                                            int delayBetweenKeyPresses = 100 + random.nextInt(301);
                                            int delayBetweenKeyPresses1 = 500 + random.nextInt(500);
                                            int delayBetweenKeyPresses2 = 500 + random.nextInt(100);
                                            robot.keyPress(KeyEvent.VK_8);
                                            robot.delay(delayBetweenKeyPresses); // 延迟，以确保按键被识别
                                            robot.keyRelease(KeyEvent.VK_8);

                                            // 生成 100-400 毫秒的随机延迟

                                            robot.delay(delayBetweenKeyPresses1);

                                            // 模拟按下键 9
                                            robot.keyPress(KeyEvent.VK_9);
                                            robot.delay(delayBetweenKeyPresses);// 延迟，以确保按键被识别
                                            robot.keyRelease(KeyEvent.VK_9);
                                            robot.delay(delayBetweenKeyPresses2);

                                            // 休眠 300 毫秒
                                            try {
                                                Thread.sleep(300);
                                            } catch (InterruptedException e) {
                                                Thread.currentThread().interrupt();
                                            }
                                        }
                                        robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                                        robot.delay(50);
                                        robot.keyRelease(KeyEvent.VK_E);
                                        robot.delay(50);
                                        robot.keyRelease(KeyEvent.VK_Q);
                                        robot.delay(50);//按住延迟
                                        robot.keyRelease(KeyEvent.VK_D);
                                        robot.delay(50);//按住延迟
                                        robot.keyRelease(KeyEvent.VK_A);//释放键盘按键
                                        LOGGER.info("ten21step7ten_3[0].getValue() == 9点9回城条出现释放WADQE等待25秒");
                                        robot.delay(25000);
                                        LOGGER.info("ten21step7ten_3[0].getValue() == 9点9回城条出现释放WADQE等待25秒完毕");


                                    }


                                }


                                robot1.delay(c);
                                LOGGER.info("ten21step7准备进入ten4steap4");

                                localTenStep.set(4);
                                return;

                            };
                            Optional<Runnable> commandB = Optional.empty();

                            Supplier<Boolean> stopCondition = () -> {
                                try {
                                    Robot robot2 = new Robot();
                                    Color color5 = robot2.getPixelColor(color5X, color5Y);

                                    Color color121 = robot1.getPixelColor(553, 380);
                                    System.out.println("Color at (553, 380): " + color121);
                                    Color color122 = robot1.getPixelColor(562, 381);
                                    System.out.println("Color at (562, 381): " + color122);
                                    Color color8 = robot2.getPixelColor(1196, 111);
                                    System.out.println("Color at (1196, 111): " + color8);
                                    Color color9 = robot2.getPixelColor(1193, 114);
                                    System.out.println("Color at (1193, 114): " + color9);
                                    Color color10 = robot2.getPixelColor(625, 705);
                                    System.out.println("Color at (608, 699): " + color10);
                                    Color color11 = robot2.getPixelColor(813, 705);
                                    System.out.println("Color at (830, 699): " + color11);

                                    boolean condition1 = color5.getRed() > 210;//成功率出现

                                    boolean condition8 = color8.getRed() > 245&color8.getRed() < 253&color8.getGreen() < 248&color8.getGreen() > 240
                                            &color8.getBlue() > 198&color8.getBlue() < 206;

                                    boolean condition9 = color9.getRed() > 17&color9.getRed() < 25&color9.getGreen() < 38&color9.getGreen() > 30
                                            &color9.getBlue() > 38&color9.getBlue() < 46;//摔死虚弱出现
                                    boolean condition3 = color121.getRed() > 182&color121.getRed() < 190&color121.getGreen() < 191&color121.getGreen() > 183
                                            &color121.getBlue() > 153&color121.getBlue() < 161;
                                    boolean condition4 = color122.getRed() > 209&color122.getRed() < 217&color122.getGreen() < 215&color122.getGreen() > 207
                                            &color122.getBlue() > 169&color122.getBlue() < 177;//死亡复活提示出现
                                    boolean condition10 = color10.getRed() > 19&color10.getRed() < 27&color10.getGreen() < 34&color10.getGreen() > 26
                                            &color10.getBlue() > 37&color10.getBlue() < 45;
                                    boolean condition11 = color11.getRed() > 19&color11.getRed() < 27&color11.getGreen() < 34&color11.getGreen() > 26
                                            &color11.getBlue() > 37&color11.getBlue() < 45;//紧急返回提示出现

                                    return condition1 || condition8&condition9||condition3&condition4||condition10&condition11;
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                    return true;
                                }
                            };
                            ColorChecker3.checkColorAndExecuteCommandWithTimeout(customState, colors, timeoutSeconds, keyDelayMin, keyDelayMax,
                                    commandA, commandB, stopChecking, stopCondition, KeyEvent.VK_5);

                            boolean condition18 = ColorChecker.checkColorAndExecuteCommand(robot, 620, 662, 214, 212, 173,
                                    () -> {});//有其他人在采

                            boolean condition19 = ColorChecker.checkColorAndExecuteCommand(robot, 630, 674, 215, 213, 174,
                                    () -> {});//有其他人在采

                            Color color5 = robot1.getPixelColor(616, 661);
                            Color color6 = robot1.getPixelColor(620, 662);
                            Color color7 = robot1.getPixelColor(630, 674);
                            System.out.println("Color at (616, 661): " + color5);
                            System.out.println("Color at (620, 662): " + color6);
                            System.out.println("Color at (630, 674): " + color7);

                            if (color5.getRed() > 210&condition18 && condition19) {

                                LOGGER.info("ten21step7成功率出现进入step5");
                                ten_3[0].setValue(1);
                                System.out.println("ten_3 has been reset to: " + ten_3[0].getValue());
                                stopChecking.set(true);
                                localTenStep.set(5);
                                break ;

                            }
                            Color color2101 = robot1.getPixelColor(1159, 825);
                            if (color2101.getGreen() < 30 ) {
                                LOGGER.info("判断2ten21step7没有飞行时间准备进入ten_step = 2");

                                localTenStep.set(2);
                                break ;
                            }

                            boolean condition8 = ColorChecker.checkColorAndExecuteCommand(robot, 1196, 111, 249, 244, 202,
                                    () -> {});
                            boolean condition9 = ColorChecker.checkColorAndExecuteCommand(robot, 1193, 114, 21, 34, 42,
                                    () -> {});
                            Color color8 = robot.getPixelColor(1196, 111);
                            System.out.println("2Color at (1196, 111): " + color8);
                            Color color9 = robot.getPixelColor(1193, 114);
                            System.out.println("2Color at (1193, 114): " + color9);

                            if (condition8&condition9) {
                                LOGGER.info("判断ten16step7虚弱出现疑似摔死");
                                robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_E);
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_Q);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_D);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_A);//释放键盘按键

                                LOGGER.info("开始进入ten16step1循环");
                                localTenStep.set(1);
                                break ;
                            }
                            Color color121 = robot1.getPixelColor(553, 380);
                            System.out.println("2Color at (553, 380): " + color121);
                            Color color122 = robot1.getPixelColor(562, 381);
                            System.out.println("2Color at (562, 381): " + color122);
                            if (color121.getRed() > 182&color121.getRed() < 190&color121.getGreen() < 191&color121.getGreen() > 183
                                    &color121.getBlue() > 153&color121.getBlue() < 161&color122.getRed() > 209&color122.getRed() < 217&color122.getGreen() < 215&color122.getGreen() > 207
                                    &color122.getBlue() > 169&color122.getBlue() < 177) {
                                LOGGER.info("ten16step7死亡复活提示出现释放WADQE");
                                robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_E);
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_Q);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_D);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_A);
                                robot.delay(50);
                                robot.mouseMove(842 + (int) v1, 479 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                robot.delay(20);
                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                robot.delay(50);
                                LOGGER.info("点击死亡确认并开始进入ten_step =1");
                                LOGGER.info("开始进入ten16step1循环");
                                localTenStep.set(1);
                                break ;
                            }
                            boolean condition3 = ColorChecker.checkColorAndExecuteCommand(robot, 625, 705, 23, 30, 41,
                                    () -> {});

                            boolean condition4 = ColorChecker.checkColorAndExecuteCommand(robot, 813, 705, 23, 30, 41,
                                    () -> {});

                            if (condition3 && condition4) {
                                LOGGER.info("ten21step7点9回城条出现释放WADQE等待25秒");
                                robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_E);
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_Q);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_D);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_A);//释放键盘按键
                                Thread.sleep(25000);
                                for(;;){
                                    Color color29 = robot1.getPixelColor(114, 756);//确定位置在莫点2
                                    Color color31 = robot1.getPixelColor(112, 760);
                                    Color color16 = robot1.getPixelColor(204, 886);
                                    Color color30 = robot1.getPixelColor(208, 887);// 确定位置在莫尔点1
                                    if (color29.getRed() > 160 & color16.getRed() > 145 & color30.getRed() > 135 & color31.getRed() > 115) {
                                        LOGGER.info("ten21step7点9确定在莫尔回城处准备进入ten_step =8");
                                        localTenStep.set(8);
                                        break ;
                                    }else{
                                        LOGGER.info("ten21step7点9确定不在莫尔回城处准备开始点8和9");
                                        int delayBetweenKeyPresses = 100 + random.nextInt(301);
                                        int delayBetweenKeyPresses1 = 500 + random.nextInt(500);
                                        int delayBetweenKeyPresses2 = 500 + random.nextInt(100);
                                        robot.keyPress(KeyEvent.VK_8);
                                        robot.delay(delayBetweenKeyPresses); // 延迟，以确保按键被识别
                                        robot.keyRelease(KeyEvent.VK_8);

                                        // 生成 100-400 毫秒的随机延迟

                                        robot.delay(delayBetweenKeyPresses1);

                                        // 模拟按下键 9
                                        robot.keyPress(KeyEvent.VK_9);
                                        robot.delay(delayBetweenKeyPresses);// 延迟，以确保按键被识别
                                        robot.keyRelease(KeyEvent.VK_9);
                                        robot.delay(delayBetweenKeyPresses2);
                                    }
                                }
                            }
                        }
                    }
                    if (localTenStep.get() == 8) {

                        LOGGER.info("进入ten21step8准备释放weqda");
                        robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                        robot.delay(50);
                        robot.keyRelease(KeyEvent.VK_E);
                        robot.delay(50);
                        robot.keyRelease(KeyEvent.VK_Q);
                        robot.delay(50);//按住延迟
                        robot.keyRelease(KeyEvent.VK_D);
                        robot.delay(50);//按住延迟
                        robot.keyRelease(KeyEvent.VK_A);
                        for(;;){
                            Color color121 = robot1.getPixelColor(553, 380);
                            System.out.println("2Color at (553, 380): " + color121);
                            Color color122 = robot1.getPixelColor(562, 381);
                            System.out.println("2Color at (562, 381): " + color122);
                            if (color121.getRed() > 182&color121.getRed() < 190&color121.getGreen() < 191&color121.getGreen() > 183
                                    &color121.getBlue() > 153&color121.getBlue() < 161&color122.getRed() > 209&color122.getRed() < 217&color122.getGreen() < 215&color122.getGreen() > 207
                                    &color122.getBlue() > 169&color122.getBlue() < 177) {
                                LOGGER.info("ten21step8死亡复活提示出现");
                                robot.mouseMove(842 + (int) v1, 479 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                robot.delay(20);
                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                robot.delay(50);

                                LOGGER.info("开始进入ten21step1循环");
                                localTenStep.set(1);
                                break ;
                            }
                            Color color29 = robot1.getPixelColor(114, 756);//确定位置在莫点2
                            Color color31 = robot1.getPixelColor(112, 760);
                            Color color16 = robot1.getPixelColor(204, 886);
                            Color color30 = robot1.getPixelColor(208, 887);// 确定位置在莫尔点1
                            if (color29.getRed() > 160 & color16.getRed() > 145 & color30.getRed() > 135 & color31.getRed() > 115) {
                                LOGGER.info("开始进入ten21step1循环");
                                localTenStep.set(1);
                                break ;
                            }



                        }}

                    LOGGER.info("在循环重新开始之前，localTenStep的值为：" + localTenStep.get());


                }
            }//在莫尔开始采集，100~200升级，200级后进入5循环
            if (ten_1 == 23) {
                final Counter[] ten_3 = {new Counter(0)};
                LOGGER.info("初始化3");
                counter = 0;
                LOGGER.info("初始化counter");

                AtomicInteger localTenStep = new AtomicInteger(1);

                outerLoop2:

                for (;;) {

                    LOGGER.info("进入23循环");
                    Color color2333 = robot1.getPixelColor(964, 849);
                    Color color199 = robot1.getPixelColor(1178, 831);

                    Color color208 = robot1.getPixelColor(143, 754);
                    Color color209 = robot1.getPixelColor(616, 661);
                    Color color210 = robot1.getPixelColor(1159, 825);

                    if (color2333.getRed() > 200 & color199.getGreen() < 60) {
                        LOGGER.info("ten23判断可以吃药和恢复飞行技能");
                        robot1.keyPress(KeyEvent.VK_EQUALS);//按住enter
                        robot1.delay(c);//按住一秒1秒后
                        robot1.keyRelease(KeyEvent.VK_EQUALS);
                        robot1.delay(c);
                        robot1.keyPress(KeyEvent.VK_0);
                        robot1.delay(c);//按住一秒1秒后
                        robot1.keyRelease(KeyEvent.VK_0);
                        LOGGER.info("点击=和0吃药和恢复飞行技能");
                    }
                    if (color210.getGreen() < 30) {
                        LOGGER.info("ten23判断飞行时间不够");
                        robot1.keyRelease(KeyEvent.VK_W);
                        Thread.sleep(c);
                        robot1.keyRelease(KeyEvent.VK_D);
                        LOGGER.info("ten23关掉W和D并开始下降10秒");
                        robot.keyPress(KeyEvent.VK_F);//按下键盘按键 上升
                        robot.delay(15000);//按住延迟
                        robot.keyRelease(KeyEvent.VK_F); //释放键盘按键
                        Thread.sleep(200); //延迟
                        LOGGER.info("ten23等待飞行时间恢复");
                        for (; ; ) {
                            boolean condition1 = ColorChecker.checkColorAndExecuteCommand(robot, 1162, 825, 41, 117, 5,
                                    () -> {
                                    });
                            if (condition1) {
                                LOGGER.info("ten23飞行时间已恢复满");
                                Color color111 = robot1.getPixelColor(1160, 845);

                                if (color111.getRed() > 184) {
                                    LOGGER.info("ten23检测是可飞行地区");
                                    Color color29 = robot1.getPixelColor(237, 758);//确定位置在贝鲁点2
                                    Color color31 = robot1.getPixelColor(238, 761);
                                    Color color16 = robot1.getPixelColor(274, 801);
                                    Color color32 = robot1.getPixelColor(278, 801);// 确定位置在贝鲁点1
                                    if (color29.getRed() > 159 & color16.getRed() > 153 & color32.getRed() > 112 & color31.getRed() > 156) {
                                        LOGGER.info("ten16检测已回城从ten23step1重新开始");
                                        localTenStep.set(1);
                                        break;
                                    }       //如果是超时需要这一步，其他地方采记得改这里

                                    LOGGER.info("ten23开始起飞");
                                    KeyUtil.pressKey(robot, KeyEvent.VK_R, -1);
                                    KeyUtil.pressKey(robot, KeyEvent.VK_F, -1);
                                    LOGGER.info("ten16停止前进并点击起飞按键");
                                    MouseUtil.moveWithCurve(robot, 1160 + (int) v1, 850 + (int) v1);
                                    Thread.sleep(1000); //延迟
                                    robot.delay(4500);//按住延迟
                                    LOGGER.info("开始上升");
                                    robot.keyPress(KeyEvent.VK_R);//按下键盘按键 上升
                                    robot.delay(2000);//按住延迟
                                    robot.keyRelease(KeyEvent.VK_R); //释放键盘按键
                                    Thread.sleep(200); //延迟
                                    LOGGER.info("ten23开始进入step3");
                                    localTenStep.set(3);
                                    break;
                                } else {
                                    for (; ; ) {
                                        LOGGER.info("ten23检测是禁飞行地区");
                                        robot1.keyPress(KeyEvent.VK_SPACE);
                                        robot1.delay(300);
                                        robot1.keyRelease(KeyEvent.VK_SPACE);
                                        robot.delay(100);
                                        robot.mouseMove(1160 + (int) v1, 850 + (int) v1); //
                                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                        robot.delay(20);
                                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                        LOGGER.info("跳跃起飞");
                                        robot.delay(2000);
                                        Color color22 = robot1.getPixelColor(1162, 836);

                                        if (color22.getRed() > 184) {
                                            LOGGER.info("检测已经不在禁飞行地区");
                                            LOGGER.info("开始点R上升");
                                            robot.keyPress(KeyEvent.VK_R);//按下键盘按键 上升
                                            robot.delay(2000);//按住延迟
                                            LOGGER.info("上升2秒");
                                            robot.keyPress(KeyEvent.VK_W);//按下键盘按键 上升
                                            robot.keyPress(KeyEvent.VK_D);//按下键盘按键 上升
                                            robot.delay((int) v4);//按住延迟
                                            LOGGER.info("上升2秒");
                                            robot.keyRelease(KeyEvent.VK_D);
                                            robot.delay(2000);
                                            robot.keyRelease(KeyEvent.VK_W);
                                            robot.keyRelease(KeyEvent.VK_R);
                                            LOGGER.info("ten23开始进入ten_step =3");

                                            localTenStep.set(3);
                                            break outerLoop2;
                                        }
                                        LOGGER.info("等待12秒");
                                        Thread.sleep(12000);

                                    }


                                }
                            }
                            Thread.sleep(1000);

                        }
                    }
                    boolean condition5 = ColorChecker.checkColorAndExecuteCommand(robot, 1196, 111, 249, 244, 202,
                            () -> {
                            });
                    boolean condition6 = ColorChecker.checkColorAndExecuteCommand(robot, 1193, 114, 21, 34, 42,
                            () -> {
                            });


                    if (condition5 & condition6) {

                        LOGGER.info("ten23判断虚弱");
                        robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                        robot.delay(50);
                        robot.keyRelease(KeyEvent.VK_E);
                        robot.delay(50);
                        robot.keyRelease(KeyEvent.VK_Q);
                        robot.delay(50);//按住延迟
                        robot.keyRelease(KeyEvent.VK_D);
                        robot.delay(50);//按住延迟
                        robot.keyRelease(KeyEvent.VK_A);
                        LOGGER.info("开始进入ten23step1循环");
                        localTenStep.set(1);
                        break;
                    }
                    Color color22 = robot1.getPixelColor(1397, 327);// 100级是绿色


                    boolean condition100 = ColorChecker.checkColorAndExecuteCommand(robot, 1124, 311, 189, 188, 156,
                            () -> {
                            });//上级的上

                    boolean condition101 = ColorChecker.checkColorAndExecuteCommand(robot, 1119, 311, 189, 188, 156,
                            () -> {
                            });//上级的上


                    if (condition100 && condition101 & color22.getGreen() > 148) {
                        LOGGER.info("判断ten23升级到300级开始进入ten20");


                        ten_1 = 20;
                        continue outerLoop5;

                    }
                    boolean[] executeStep3 = new boolean[1];


                    if (localTenStep.get() == 1) {
                        LOGGER.info("进入23-step1循环");
                        Color color206 = robot1.getPixelColor(153, 755);
                        //去的路径

                        if (color206.getRed() > 222) {
                            LOGGER.info("23-step1找到起始方向");

                            boolean condition7 = ColorChecker.checkColorAndExecuteCommand(robot, 1196, 111, 249, 244, 202,
                                    () -> {
                                    });
                            boolean condition8 = ColorChecker.checkColorAndExecuteCommand(robot, 1193, 114, 21, 34, 42,
                                    () -> {
                                    });


                            if (condition7 & condition8) {
                                Thread.sleep(240000);
                                LOGGER.info("判断虚弱");
                            }
                            LOGGER.info("23-step1往前走");
                            Thread.sleep(500); //延迟
                            robot1.keyPress(KeyEvent.VK_W);//往前走
                            Color color32 = robot1.getPixelColor(244, 818);
                            ColorChecker.checkColorAndExecuteCommandWithTimeout(244, 818, 157, 150, 89, 30,
                                    500, KeyEvent.VK_Q, KeyEvent.VK_SPACE);
                            System.out.println("Color at (244, 818): " + color32);
                            if (color32.getRed() > 140) {
                                LOGGER.info("23-step1判断走到第一个转弯点");
                                localTenStep.set(9);
                                LOGGER.info("进入23-step3");

                                outerLoop4:
                                for (; ; ) {
                                    boolean condition3 = ColorChecker.checkColorAndExecuteCommand(robot, 625, 705, 23, 30, 41,
                                            () -> {
                                            });

                                    boolean condition4 = ColorChecker.checkColorAndExecuteCommand(robot, 813, 705, 23, 30, 41,
                                            () -> {
                                            });
                                    boolean condition102 = ColorChecker.checkColorAndExecuteCommand(robot, 631, 695, 12, 16, 19,
                                            () -> {
                                            });
                                    Color color123 = robot1.getPixelColor(625, 705);
                                    System.out.println("2Color at (625, 705): " + color123);
                                    Color color124 = robot1.getPixelColor(813, 705);
                                    System.out.println("2Color at (813, 705): " + color124);
                                    Color color125 = robot1.getPixelColor(631, 695);
                                    System.out.println("2Color at (631, 695): " + color125);

                                    if (condition3 && condition4 & condition102) {
                                        LOGGER.info("ten23step1点9回城条出现准备进入step8");
                                        localTenStep.set(8);
                                        break outerLoop4;
                                    }
                                    Color color121 = robot1.getPixelColor(553, 380);
                                    Color color122 = robot1.getPixelColor(562, 381);
                                    if (color121.getRed() > 182 & color121.getRed() < 190 & color121.getGreen() < 191 & color121.getGreen() > 183
                                            & color121.getBlue() > 153 & color121.getBlue() < 161 & color122.getRed() > 209 & color122.getRed() < 217 & color122.getGreen() < 215 & color122.getGreen() > 207
                                            & color122.getBlue() > 169 & color122.getBlue() < 177) {
                                        LOGGER.info("ten23step8死亡复活提示出现");
                                        robot.mouseMove(842 + (int) v1, 479 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                        robot.delay(20);
                                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                        robot.delay(50);

                                        LOGGER.info("开始进入ten23step1循环");
                                        localTenStep.set(1);
                                        break outerLoop4;
                                    }

                                    if (localTenStep.get() == 9) {
                                        AngleCalculatorTask task = new AngleCalculatorTask(robot, 154, 754);
                                        Thread.sleep(100);
                                        LOGGER.info("23-STEP3-1");
                                        task.run();
                                        boolean condition1 = ColorChecker.checkColorAndExecuteCommand(robot, 211, 871, 165, 156, 92,
                                                () -> {
                                                });
                                        if (condition1) {
                                            LOGGER.info("判断出23-STEP3-2按e");
                                            KeyUtil.pressKey(robot, KeyEvent.VK_E, -1);
                                        }

                                        int[][] colors = {
                                                {155, 807, 165} // x1, y1, red1
                                        };
                                        AtomicBoolean exitOuterLoop4 = new AtomicBoolean(false);
                                        ColorChecker4.Callback callback = new ColorChecker4.Callback() {
                                            @Override
                                            public void onTaskCompleted() {
                                                System.out.println("Callback: onTaskCompleted() called.");
                                                executeStep3[0] = true;
                                            }
                                        };
                                        Color color277 = robot1.getPixelColor(155, 807);
                                        System.out.println("Color at (155, 807): " + color277);
                                        ColorChecker2 colorChecker = new ColorChecker2();

                                        CustomState customState = new CustomState();
                                        ColorChecker4.checkColorAndExecuteCommandWithTimeout(customState, colors, 10, 900, 1200,
                                                () -> {

                                                    LOGGER.info("ten21step1判断走到起飞点附近");
                                                    robot.keyRelease(KeyEvent.VK_W); //释放键盘按键

                                                    localTenStep.set(10);
                                                    executeStep3[0] = true;
                                                    return;


                                                },
                                                Optional.empty(),
                                                callback);
                                        if (executeStep3[0]) {
                                            localTenStep.set(10);
                                            break outerLoop4;
                                        }

                                        LOGGER.info("ten21step1A运行完毕");

                                    }

                                }

                            }
                        } else {
                            LOGGER.info("角度不对开始转向2");
                            robot1.keyPress(KeyEvent.VK_A);
                            robot1.delay(10);
                            robot1.keyRelease(KeyEvent.VK_A);
                            Thread.sleep(200);
                            LOGGER.info("开始回到23-step = 1");
                            localTenStep.set(1);
                        }
                    }
                    if (localTenStep.get() == 10) {
                        double v9 = 0.03 + random.nextDouble() * (0.03 - 0.01);//定义随机延迟在0.05-0.01秒之间 鼠标的延迟 robot.delay((int) v);

                        v9 = v9 * 1000;
                        LOGGER.info("停止前进并点击起飞按键");

                        robot.mouseMove(1160 + (int) v1, 850 + (int) v1); // 鼠标移动到xx坐标轴 点击阻止
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                        robot.delay((int) v9);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                        robot.delay(200);


                        LOGGER.info("开始点R上升");
                        robot.keyPress(KeyEvent.VK_R);//按下键盘按键 上升
                        robot.delay(16500);//按住延迟
                        LOGGER.info("上升4.5秒停止");
                        robot.keyRelease(KeyEvent.VK_R); //释放键盘按键

                        LOGGER.info("ten21step1开始进入step = 3");
                        localTenStep.set(3);
                    }

                    if (localTenStep.get() == 2) {

                        LOGGER.info("进入ten23step2");
                        robot1.keyRelease(KeyEvent.VK_W);
                        Thread.sleep(c);
                        robot1.keyRelease(KeyEvent.VK_D);
                        LOGGER.info("关掉W和D并开始下降10秒");
                        robot.keyPress(KeyEvent.VK_F);//按下键盘按键 上升
                        robot.delay(15000);//按住延迟
                        robot.keyRelease(KeyEvent.VK_F); //释放键盘按键
                        Thread.sleep(200); //延迟
                        LOGGER.info("等待飞行时间恢复");
                        for (; ; ) {
                            boolean condition1 = ColorChecker.checkColorAndExecuteCommand(robot, 1162, 825, 41, 117, 5,
                                    () -> {
                                    });
                            if (condition1) {
                                LOGGER.info("ten23step2飞行时间已恢复满");
                                Color color111 = robot1.getPixelColor(1160, 845);


                                if (color111.getRed() > 184) {
                                    LOGGER.info("ten23step2检测是可飞行地区");
                                    Color color29 = robot1.getPixelColor(237, 758);//确定位置在贝鲁点2
                                    Color color31 = robot1.getPixelColor(238, 761);
                                    Color color16 = robot1.getPixelColor(274, 801);
                                    Color color32 = robot1.getPixelColor(278, 801);// 确定位置在贝鲁点1
                                    if (color29.getRed() > 159 & color16.getRed() > 153 & color32.getRed() > 112 & color31.getRed() > 156) {
                                        LOGGER.info("检测在贝鲁回城点从ten23step1重新开始");
                                        localTenStep.set(1);
                                        break;
                                    }       //如果是超时需要这一步，其他地方采记得改这里

                                    LOGGER.info("ten23step2开始起飞");
                                    KeyUtil.pressKey(robot, KeyEvent.VK_R, -1);
                                    KeyUtil.pressKey(robot, KeyEvent.VK_F, -1);
                                    LOGGER.info("停止前进并点击起飞按键");
                                    MouseUtil.moveWithCurve(robot, 1160 + (int) v1, 850 + (int) v1);
                                    Thread.sleep(1000); //延迟
                                    robot.delay(4500);//按住延迟
                                    LOGGER.info("开始上升");
                                    robot.keyPress(KeyEvent.VK_R);//按下键盘按键 上升
                                    robot.delay(2000);//按住延迟
                                    robot.keyRelease(KeyEvent.VK_R); //释放键盘按键
                                    Thread.sleep(200); //延迟
                                    LOGGER.info("ten23step2开始进入step3");
                                    localTenStep.set(3);
                                    break;
                                } else {
                                    for (; ; ) {
                                        LOGGER.info("ten23step2检测是禁飞行地区");
                                        robot1.keyPress(KeyEvent.VK_SPACE);
                                        robot1.delay(300);
                                        robot1.keyRelease(KeyEvent.VK_SPACE);
                                        robot.delay(100);
                                        robot.mouseMove(1160 + (int) v1, 850 + (int) v1); //
                                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                        robot.delay(20);
                                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                        LOGGER.info("跳跃起飞");
                                        robot.delay(2000);
                                        Color color202 = robot1.getPixelColor(1162, 836);

                                        if (color202.getRed() > 184) {
                                            LOGGER.info("ten16step2检测已经不在禁飞行地区");
                                            LOGGER.info("开始点R上升");
                                            robot.keyPress(KeyEvent.VK_R);//按下键盘按键 上升
                                            robot.delay(2000);//按住延迟
                                            LOGGER.info("上升2秒");
                                            robot.keyPress(KeyEvent.VK_W);//按下键盘按键 上升
                                            robot.keyPress(KeyEvent.VK_D);//按下键盘按键 上升
                                            robot.delay((int) v4);//按住延迟
                                            LOGGER.info("上升2秒");
                                            robot.keyRelease(KeyEvent.VK_D);
                                            robot.delay(2000);
                                            robot.keyRelease(KeyEvent.VK_W);
                                            robot.keyRelease(KeyEvent.VK_R);
                                            LOGGER.info("ten16step2开始进入ten_step =3");

                                            localTenStep.set(3);
                                            break;
                                        }
                                        LOGGER.info("等待12秒");
                                        Thread.sleep(12000);

                                    }


                                }
                            }
                            Thread.sleep(1000);

                        }

                    }

                    if (localTenStep.get() == 3 ) {
                        LOGGER.info("进入ten23step3");
                        Rectangle screenRange = new Rectangle(1267, 12, 167, 167);
                        String keyword = "小地图奥德图标";
                        String folderPath = "D:/截图/正确截图";
                        int similarity = 95;
                        int n = 1; // 获取第一近的点
                        int keyToPress = KeyEvent.VK_4; // 按下并释放的键 (例如 6)
                        long delayAfterCombinedMethod = CombinedTask.combinedMethod(screenRange, keyword, folderPath, similarity, n, keyToPress);
                        LOGGER.info("ten23step3找最近的点");

                        Thread.sleep(c);
                        LOGGER.info("ten23step3开始进入step7");
                        localTenStep.set(7);
                    }
                    if (localTenStep.get() == 4) {
                        LOGGER.info("进入ten23step4");// 10次没采到
                        Rectangle screenRange = new Rectangle(1267, 12, 167, 167);
                        String keyword = "小地图奥德图标";
                        String folderPath = "D:/截图/正确截图";
                        int similarity = 95;
                        int n = 2; // 获取第二近的点
                        int keyToPress = KeyEvent.VK_4; // 按下并释放的键 (例如 6)
                        long delayAfterCombinedMethod = CombinedTask.combinedMethod(screenRange, keyword, folderPath, similarity, n, keyToPress);
                        LOGGER.info("ten23step4找第二近的点");

                        Thread.sleep(c);
                        localTenStep.set(7);

                    }
                    if (localTenStep.get() == 5) {

                        LOGGER.info("进入ten23step5");

                        Color color4 = robot1.getPixelColor(616, 661);
                        if (color4.getRed() > 210) {
                            System.out.println("Color at (616, 661): " + color4);
                            ten_3[0].setValue(1);
                            robot1.delay(500);
                            LOGGER.info("ten23step5成功率出现等待");


                        } else {
                            LOGGER.info("ten23step5成功率未出现按5");
                            robot1.delay(200);

                            robot1.keyPress(KeyEvent.VK_4);                //如果没采集
                            robot1.delay(c);
                            robot1.keyRelease(KeyEvent.VK_4);
                            boolean condition14 = ColorChecker.checkColorAndExecuteCommand(robot, 790, 309, 255, 234, 183,
                                    () -> {
                                    });//等级不够采不到

                            boolean condition15 = ColorChecker.checkColorAndExecuteCommand(robot, 750, 312, 255, 234, 183,
                                    () -> {
                                    });//等级不够采不到


                            Color color1 = robot1.getPixelColor(787, 309);//周围没有奥德
                            Color color2 = robot1.getPixelColor(770, 309);
                            if ((color1.getRed() > 251 & color2.getRed() > 251) || (condition14 && condition15)) {
                                LOGGER.info("ten2=23step5周围没有奥德出现去step3");
                                robot1.delay(c);
                                robot1.keyPress(KeyEvent.VK_A);
                                robot1.delay(c);
                                robot1.delay(1000);
                                robot1.keyRelease(KeyEvent.VK_A);
                                robot1.delay(2500);
                                localTenStep.set(3);
                                LOGGER.info("localTenStep.set(3) was executed");
                                continue;


                            }
                            boolean condition16 = ColorChecker.checkColorAndExecuteCommand(robot, 761, 307, 255, 234, 183,
                                    () -> {
                                    });//有其他人在采

                            boolean condition17 = ColorChecker.checkColorAndExecuteCommand(robot, 722, 312, 255, 234, 183,
                                    () -> {
                                    });//有其他人在采
                            if (condition16 & condition17) {
                                LOGGER.info("ten2=23step5周围有其他人在采去step4");
                                robot1.delay(c);
                                robot1.keyPress(KeyEvent.VK_A);
                                robot1.delay(c);
                                robot1.delay(1000);
                                robot1.keyRelease(KeyEvent.VK_A);
                                robot1.delay(2500);
                                localTenStep.set(4);
                                LOGGER.info("localTenStep.set(4) was executed");
                                continue;
                            }
                            robot1.delay(1000);
                            localTenStep.set(5);
                        }

                    }
                    if (localTenStep.get() == 6) {
                        robot1.keyPress(KeyEvent.VK_W);
                        robot1.keyPress(KeyEvent.VK_D);
                        robot1.delay(1000);
                        robot1.keyRelease(KeyEvent.VK_D);
                        robot1.delay(1000);
                        robot1.keyPress(KeyEvent.VK_W);
                        Thread.sleep(c);

                    }
                    if (localTenStep.get() == 7) {
                        LOGGER.info("ten23step7进入循环");
                        robot1.delay(200);

                        robot1.keyPress(KeyEvent.VK_4);                //如果没采集
                        robot1.delay(c);
                        robot1.keyRelease(KeyEvent.VK_4);
                        robot1.delay(500);
                        LOGGER.info("ten23step7进入循环按6");


                        for (; ; ) {

                            if (localTenStep.get() != 7) {
                                break;
                            }

                            int[][] colors = {
                                    {787, 309, 255, 234, 183},//找不到奥德目标
                                    {770, 309, 255, 234, 183},
                                    {791, 309, 255, 234, 183},//等级不够采不到
                                    {706, 309, 255, 234, 183},
                                    {761, 307, 255, 234, 183},//其他人在采集
                                    {722, 312, 255, 234, 183},// x1, y1, red1
                            };
                            int timeoutSeconds = 15;
                            int keyDelayMin = 600;
                            int keyDelayMax = 900;
                            AtomicBoolean stopChecking = new AtomicBoolean(false);
                            int color5X = 616;
                            int color5Y = 661;

                            CustomState customState = new CustomState();
                            double finalV = v2;
                            double finalV1 = v3;
                            double finalV2 = v7;
                            double finalV3 = v5;
                            double finalV4 = v10;
                            Runnable commandA = () -> {
                                LOGGER.info("ten23step7周围没有可采奥德重复一次");
                                ten_3[0].increment();

                                if (ten_3[0].getValue() % 3 == 0) {
                                    Runnable bCommand = () -> {
                                        while (!Thread.currentThread().isInterrupted()) {

                                            Color color23331 = robot1.getPixelColor(964, 849);
                                            Color color1991 = robot1.getPixelColor(1178, 831);

                                            if (color23331.getRed() > 200 & color1991.getGreen() < 60) {
                                                LOGGER.info("ten23判断可以吃药和恢复飞行技能");
                                                robot1.delay(c);//按住一秒1秒后
                                                robot1.keyPress(KeyEvent.VK_EQUALS);//按住enter
                                                robot1.delay(c);//按住一秒1秒后
                                                robot1.keyRelease(KeyEvent.VK_EQUALS);
                                                robot1.delay(c);
                                                robot1.keyPress(KeyEvent.VK_0);
                                                robot1.delay(c);//按住一秒1秒后
                                                robot1.keyRelease(KeyEvent.VK_0);
                                                LOGGER.info("点击=和0吃药和恢复飞行技能");
                                                robot1.delay(c);
                                            }
                                            Color color2101 = robot1.getPixelColor(1155, 826);
                                            if (color2101.getGreen() < 30) {
                                                LOGGER.info("判断1ten23step7没有飞行时间准备进入ten_step = 2");
                                                localTenStep.set(2);
                                                break;
                                            }
                                            Color color29 = robot1.getPixelColor(237, 758);//确定位置在贝鲁点2
                                            Color color31 = robot1.getPixelColor(238, 761);
                                            Color color16 = robot1.getPixelColor(274, 801);
                                            Color color32 = robot1.getPixelColor(278, 801);// 确定位置在贝鲁点1
                                            Color color161 = robot1.getPixelColor(200, 824);
                                            Color color321 = robot1.getPixelColor(258, 862);// 确定位置在贝鲁点3
                                            if (color29.getRed() > 159 & color16.getRed() > 153 & color32.getRed() > 112 & color31.getRed() > 156 & color321.getRed() > 162 & color161.getRed() > 159) {
                                                LOGGER.info("ten23step7ten_3[0].getValue() == 3确定位置在阿尔准备进入step1");
                                                localTenStep.set(8);
                                                break;
                                            }
                                            try {
                                                Thread.sleep(1000);
                                            } catch (InterruptedException e) {
                                                Thread.currentThread().interrupt();
                                            }
                                        }
                                    };

// 创建并启动B命令线
                                    Thread bCommandThread = new Thread(bCommand);
                                    bCommandThread.start();
                                    if (ten_3[0].getValue() < 9) {

                                        System.out.println("2执行 D命令，ten_3 = " + ten_3[0].getValue());
// 执行A命令的代码
                                        robot1.keyPress(KeyEvent.VK_W);
                                        LOGGER.info("ten23step7ten_3[0].getValue() <= 15按下W");
                                        robot1.keyPress(KeyEvent.VK_D);
                                        LOGGER.info("ten23step7ten_3[0].getValue() <= 15按下D");
                                        robot1.delay(500);
                                        robot1.keyRelease(KeyEvent.VK_D);
                                        LOGGER.info("ten23step7ten_3[0].getValue() <= 15释放D");
                                        robot1.delay((int) finalV2);
                                        robot1.keyPress(KeyEvent.VK_W);
                                        LOGGER.info("ten23step7ten_3[0].getValue() <= 15释放W");
                                        robot1.delay(100);


                                        bCommandThread.interrupt();
                                        System.out.println("Before setting ten_step to 3");
                                        localTenStep.set(3);
                                        return;
// A命令执行完毕后，终止B命令线程

                                    }
                                    // 在外部定义一个计数器
                                    // 在外部定义一个 AtomicBoolean


// 当 ten_3[0].getValue() == 9 时
                                    if (ten_3[0].getValue() == 9) {
                                        counter++;

                                        // 根据 alternate 的值判断执行第一种操作或第二种操作
                                        if (counter % 2 != 0) {
                                            // 第一次和第三次执行的操作
                                            robot1.keyPress(KeyEvent.VK_R);
                                            LOGGER.info("Executing operation 1 (first and third time)");
                                            robot1.delay((int) finalV3);
                                            robot1.keyRelease(KeyEvent.VK_R);
                                            LOGGER.info("Operation 1 complete");
                                            localTenStep.set(3);
                                        } else {
                                            // 第二次执行的操作
                                            robot1.keyPress(KeyEvent.VK_F);
                                            LOGGER.info("Executing operation 2 (second time)");
                                            robot1.delay((int) finalV3);
                                            robot1.keyRelease(KeyEvent.VK_F);
                                            LOGGER.info("Operation 2 complete");
                                            localTenStep.set(3);
                                        }

                                        return;
                                    }
                                    if (ten_3[0].getValue() >= 15 && ten_3[0].getValue() <= 18) {

                                        System.out.println("2执行 D命令，ten_3 = " + ten_3[0].getValue());
// 执行A命令的代码
                                        robot1.keyPress(KeyEvent.VK_W);
                                        LOGGER.info("ten23step7ten_3[0].getValue() <= 15按下W");
                                        robot1.keyPress(KeyEvent.VK_D);
                                        LOGGER.info("ten23step7ten_3[0].getValue() <= 15按下D");
                                        robot1.delay(500);
                                        robot1.keyRelease(KeyEvent.VK_D);
                                        LOGGER.info("ten23step7ten_3[0].getValue() <= 15释放D");
                                        robot1.delay((int) finalV2);
                                        robot1.keyPress(KeyEvent.VK_W);
                                        LOGGER.info("ten23step7ten_3[0].getValue() <= 15释放W");
                                        robot1.delay(100);


                                        bCommandThread.interrupt();
                                        System.out.println("Before setting ten_step to 3");
                                        localTenStep.set(3);
                                        return;
// A命令执行完毕后，终止B命令线程

                                    }
                                    if (ten_3[0].getValue() >= 21 && ten_3[0].getValue() <= 30) {


                                        System.out.println("ten232执行 A 命令，ten_3 = " + ten_3[0].getValue());
                                        robot1.keyPress(KeyEvent.VK_W);
                                        LOGGER.info("ten23step7ten_3[0].getValue() >= 15 && ten_3[0].getValue() <= 30按下W");
                                        robot1.keyPress(KeyEvent.VK_A);
                                        LOGGER.info("ten23step7ten_3[0].getValue() >= 15 && ten_3[0].getValue() <= 30按下A");
                                        robot1.delay(500);
                                        robot1.keyRelease(KeyEvent.VK_A);
                                        LOGGER.info("ten23step7ten_3[0].getValue() >= 15 && ten_3[0].getValue() <= 30释放A");
                                        robot1.delay((int) finalV2);
                                        robot1.keyPress(KeyEvent.VK_W);
                                        LOGGER.info("ten23step7ten_3[0].getValue() >= 15 && ten_3[0].getValue() <= 30释放W");
                                        robot1.delay(100);
                                        LOGGER.info("2开始进入ten23step3");
                                        localTenStep.set(3);
                                        return;

                                    }

                                    if (ten_3[0].getValue() == 33) {                         // 33次没采到
                                        System.out.println("ten23step7周围没有奥德准备摔死，ten_3 = " + ten_3[0].getValue());
                                        robot1.keyPress(KeyEvent.VK_R);                //如果没采集
                                        robot1.delay(10000);
                                        robot1.keyRelease(KeyEvent.VK_R);
                                        robot1.delay(100);
                                        robot.mouseMove(1160 + (int) v1, 850 + (int) v1); //
                                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                        robot.delay(20);
                                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                        ten_3[0].setValue(1);
                                        robot1.delay(20000);


                                        boolean condition3;
                                        boolean condition4;
                                        boolean condition9;
                                        boolean condition10;

                                        while (true) {
                                            // 获取颜色值
                                            Color color29 = robot1.getPixelColor(625, 705);
                                            Color color31 = robot1.getPixelColor(813, 705);
                                            Color color28 = robot1.getPixelColor(1196, 111);
                                            Color color30 = robot1.getPixelColor(1193, 114);

                                            System.out.println("3Color at (625, 705): " + color29);
                                            System.out.println("3Color at (813, 705): " + color31);
                                            System.out.println("3Color at (1196, 111): " + color28);
                                            System.out.println("3Color at (1193, 114): " + color30);


                                            // 检查条件
                                            condition3 = (color29.getRed() >= 23 - 4 && color29.getRed() <= 23 + 4) &&
                                                    (color29.getGreen() >= 30 - 4 && color29.getGreen() <= 30 + 4) &&
                                                    (color29.getBlue() >= 41 - 4 && color29.getBlue() <= 41 + 4);

                                            condition4 = (color31.getRed() >= 23 - 4 && color31.getRed() <= 23 + 4) &&
                                                    (color31.getGreen() >= 30 - 4 && color31.getGreen() <= 30 + 4) &&
                                                    (color31.getBlue() >= 41 - 4 && color31.getBlue() <= 41 + 4);

                                            condition9 = (color28.getRed() >= 249 - 4 && color28.getRed() <= 249 + 4) &&
                                                    (color28.getGreen() >= 244 - 4 && color28.getGreen() <= 244 + 4) &&
                                                    (color28.getBlue() >= 202 - 4 && color28.getBlue() <= 202 + 4);

                                            condition10 = (color30.getRed() >= 21 - 4 && color30.getRed() <= 21 + 4) &&
                                                    (color30.getGreen() >= 34 - 4 && color30.getGreen() <= 34 + 4) &&
                                                    (color30.getBlue() >= 42 - 4 && color30.getBlue() <= 42 + 4);

                                            // 如果满足条件，则跳出循环
                                            if ((condition3 && condition4) || (condition9 && condition10)) {
                                                break;
                                            }
                                            LOGGER.info("ten23stepten3=33条件不满足点89");

                                            // 如果条件不满足，继续执行循环中的其他操作
                                            int delayBetweenKeyPresses = 100 + random.nextInt(301);
                                            int delayBetweenKeyPresses1 = 500 + random.nextInt(500);
                                            int delayBetweenKeyPresses2 = 500 + random.nextInt(100);
                                            robot.keyPress(KeyEvent.VK_8);
                                            robot.delay(delayBetweenKeyPresses); // 延迟，以确保按键被识别
                                            robot.keyRelease(KeyEvent.VK_8);

                                            // 生成 100-400 毫秒的随机延迟

                                            robot.delay(delayBetweenKeyPresses1);

                                            // 模拟按下键 9
                                            robot.keyPress(KeyEvent.VK_9);
                                            robot.delay(delayBetweenKeyPresses);// 延迟，以确保按键被识别
                                            robot.keyRelease(KeyEvent.VK_9);
                                            robot.delay(delayBetweenKeyPresses2);

                                            // 休眠 300 毫秒
                                            try {
                                                Thread.sleep(300);
                                            } catch (InterruptedException e) {
                                                Thread.currentThread().interrupt();
                                            }
                                        }
                                        robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                                        robot.delay(50);
                                        robot.keyRelease(KeyEvent.VK_E);
                                        robot.delay(50);
                                        robot.keyRelease(KeyEvent.VK_Q);
                                        robot.delay(50);//按住延迟
                                        robot.keyRelease(KeyEvent.VK_D);
                                        robot.delay(50);//按住延迟
                                        robot.keyRelease(KeyEvent.VK_A);//释放键盘按键
                                        LOGGER.info("ten23step7ten_3[0].getValue() == 9点9回城条出现释放WADQE等待25秒");
                                        robot.delay(25000);
                                        LOGGER.info("ten23step7ten_3[0].getValue() == 9点9回城条出现释放WADQE等待25秒完毕");


                                    }


                                }


                                robot1.delay(c);
                                LOGGER.info("ten23step7准备进入ten4steap4");

                                localTenStep.set(4);
                                return;

                            };
                            Optional<Runnable> commandB = Optional.empty();

                            Supplier<Boolean> stopCondition = () -> {
                                try {
                                    Robot robot2 = new Robot();
                                    Color color5 = robot2.getPixelColor(color5X, color5Y);

                                    Color color121 = robot1.getPixelColor(553, 380);

                                    Color color122 = robot1.getPixelColor(562, 381);

                                    Color color8 = robot2.getPixelColor(1196, 111);

                                    Color color9 = robot2.getPixelColor(1193, 114);

                                    Color color10 = robot2.getPixelColor(625, 705);

                                    Color color11 = robot2.getPixelColor(813, 705);


                                    boolean condition1 = color5.getRed() > 210;//成功率出现

                                    boolean condition8 = color8.getRed() > 245 & color8.getRed() < 253 & color8.getGreen() < 248 & color8.getGreen() > 240
                                            & color8.getBlue() > 198 & color8.getBlue() < 206;

                                    boolean condition9 = color9.getRed() > 17 & color9.getRed() < 25 & color9.getGreen() < 38 & color9.getGreen() > 30
                                            & color9.getBlue() > 38 & color9.getBlue() < 46;//摔死虚弱出现
                                    boolean condition3 = color121.getRed() > 182 & color121.getRed() < 190 & color121.getGreen() < 191 & color121.getGreen() > 183
                                            & color121.getBlue() > 153 & color121.getBlue() < 161;
                                    boolean condition4 = color122.getRed() > 209 & color122.getRed() < 217 & color122.getGreen() < 215 & color122.getGreen() > 207
                                            & color122.getBlue() > 169 & color122.getBlue() < 177;//死亡复活提示出现
                                    boolean condition10 = color10.getRed() > 19 & color10.getRed() < 27 & color10.getGreen() < 34 & color10.getGreen() > 26
                                            & color10.getBlue() > 37 & color10.getBlue() < 45;
                                    boolean condition11 = color11.getRed() > 19 & color11.getRed() < 27 & color11.getGreen() < 34 & color11.getGreen() > 26
                                            & color11.getBlue() > 37 & color11.getBlue() < 45;//紧急返回提示出现

                                    return condition1 || condition8 & condition9 || condition3 & condition4 || condition10 & condition11;
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                    return true;
                                }
                            };
                            ColorChecker3.checkColorAndExecuteCommandWithTimeout(customState, colors, timeoutSeconds, keyDelayMin, keyDelayMax,
                                    commandA, commandB, stopChecking, stopCondition, KeyEvent.VK_4);

                            boolean condition18 = ColorChecker.checkColorAndExecuteCommand(robot, 620, 662, 214, 212, 173,
                                    () -> {
                                    });//有其他人在采

                            boolean condition19 = ColorChecker.checkColorAndExecuteCommand(robot, 630, 674, 215, 213, 174,
                                    () -> {
                                    });//有其他人在采

                            Color color5 = robot1.getPixelColor(616, 661);
                            Color color6 = robot1.getPixelColor(620, 662);
                            Color color7 = robot1.getPixelColor(630, 674);


                            if (color5.getRed() > 210 & condition18 && condition19) {

                                LOGGER.info("ten23step7成功率出现进入step5");
                                ten_3[0].setValue(1);
                                System.out.println("ten_3 has been reset to: " + ten_3[0].getValue());
                                stopChecking.set(true);
                                localTenStep.set(5);
                                break;

                            }
                            Color color2101 = robot1.getPixelColor(1159, 825);
                            if (color2101.getGreen() < 30) {
                                LOGGER.info("判断2ten23step7没有飞行时间准备进入ten_step = 2");

                                localTenStep.set(2);
                                break;
                            }

                            boolean condition8 = ColorChecker.checkColorAndExecuteCommand(robot, 1196, 111, 249, 244, 202,
                                    () -> {
                                    });
                            boolean condition9 = ColorChecker.checkColorAndExecuteCommand(robot, 1193, 114, 21, 34, 42,
                                    () -> {
                                    });
                            Color color8 = robot.getPixelColor(1196, 111);

                            Color color9 = robot.getPixelColor(1193, 114);


                            if (condition8 & condition9) {
                                LOGGER.info("判断ten23step7虚弱出现疑似摔死");
                                robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_E);
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_Q);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_D);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_A);//释放键盘按键

                                LOGGER.info("开始进入ten23step1循环");
                                localTenStep.set(1);
                                break;
                            }
                            Color color121 = robot1.getPixelColor(553, 380);

                            Color color122 = robot1.getPixelColor(562, 381);

                            if (color121.getRed() > 182 & color121.getRed() < 190 & color121.getGreen() < 191 & color121.getGreen() > 183
                                    & color121.getBlue() > 153 & color121.getBlue() < 161 & color122.getRed() > 209 & color122.getRed() < 217 & color122.getGreen() < 215 & color122.getGreen() > 207
                                    & color122.getBlue() > 169 & color122.getBlue() < 177) {
                                LOGGER.info("ten23step7死亡复活提示出现释放WADQE");
                                robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_E);
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_Q);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_D);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_A);
                                robot.delay(50);
                                robot.mouseMove(842 + (int) v1, 479 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                robot.delay(20);
                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                robot.delay(50);
                                LOGGER.info("点击死亡确认并开始进入ten_step =1");
                                LOGGER.info("开始进入ten23step1循环");
                                localTenStep.set(1);
                                break;
                            }
                            boolean condition3 = ColorChecker.checkColorAndExecuteCommand(robot, 625, 705, 23, 30, 41,
                                    () -> {
                                    });

                            boolean condition4 = ColorChecker.checkColorAndExecuteCommand(robot, 813, 705, 23, 30, 41,
                                    () -> {
                                    });
                            boolean condition102 = ColorChecker.checkColorAndExecuteCommand(robot, 631, 695, 12, 16, 19,
                                    () -> {
                                    });
                            Color color123 = robot1.getPixelColor(625, 705);

                            Color color124 = robot1.getPixelColor(813, 705);

                            Color color125 = robot1.getPixelColor(631, 695);


                            if (condition3 && condition4 & condition102) {
                                LOGGER.info("ten23step7点9回城条出现");

                                for (; ; ) {
                                    LOGGER.info("ten23step7点9回城条出现进入for循环");
                                    Color color29 = robot1.getPixelColor(237, 758);//确定位置在贝鲁点2
                                    Color color31 = robot1.getPixelColor(238, 761);
                                    Color color16 = robot1.getPixelColor(274, 801);
                                    Color color32 = robot1.getPixelColor(278, 801);// 确定位置在贝鲁点1
                                    if (color29.getRed() > 159 & color16.getRed() > 153 & color32.getRed() > 112 & color31.getRed() > 156) {
                                        LOGGER.info("ten23step7点9确定在莫尔回城处准备进入ten_step =8");
                                        robot.keyRelease(KeyEvent.VK_W);
                                        localTenStep.set(8);
                                        break;
                                    } else {
                                        robot.keyRelease(KeyEvent.VK_W);
                                        robot.delay(50);
                                        LOGGER.info("ten23step7点9确定不在莫尔回城处准备开始点8和9");
                                        int delayBetweenKeyPresses = 100 + random.nextInt(301);
                                        int delayBetweenKeyPresses1 = 500 + random.nextInt(500);
                                        int delayBetweenKeyPresses2 = 500 + random.nextInt(100);
                                        robot.keyPress(KeyEvent.VK_8);
                                        robot.delay(delayBetweenKeyPresses); // 延迟，以确保按键被识别
                                        robot.keyRelease(KeyEvent.VK_8);

                                        // 生成 100-400 毫秒的随机延迟

                                        robot.delay(delayBetweenKeyPresses1);

                                        // 模拟按下键 9
                                        robot.keyPress(KeyEvent.VK_9);
                                        robot.delay(delayBetweenKeyPresses);// 延迟，以确保按键被识别
                                        robot.keyRelease(KeyEvent.VK_9);
                                        robot.delay(delayBetweenKeyPresses2);
                                    }
                                }
                            }
                        }
                    }
                    if (localTenStep.get() == 8) {

                        LOGGER.info("进入ten23step8准备释放weqda");
                        robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                        robot.delay(50);
                        robot.keyRelease(KeyEvent.VK_E);
                        robot.delay(50);
                        robot.keyRelease(KeyEvent.VK_Q);
                        robot.delay(50);//按住延迟
                        robot.keyRelease(KeyEvent.VK_D);
                        robot.delay(50);//按住延迟
                        robot.keyRelease(KeyEvent.VK_A);
                        for (; ; ) {
                            Color color121 = robot1.getPixelColor(553, 380);
                            Color color122 = robot1.getPixelColor(562, 381);
                            if (color121.getRed() > 182 & color121.getRed() < 190 & color121.getGreen() < 191 & color121.getGreen() > 183
                                    & color121.getBlue() > 153 & color121.getBlue() < 161 & color122.getRed() > 209 & color122.getRed() < 217 & color122.getGreen() < 215 & color122.getGreen() > 207
                                    & color122.getBlue() > 169 & color122.getBlue() < 177) {
                                LOGGER.info("ten23step8死亡复活提示出现");
                                robot.mouseMove(842 + (int) v1, 479 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                robot.delay(20);
                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                robot.delay(50);

                                LOGGER.info("开始进入ten23step1循环");
                                localTenStep.set(1);
                                break;
                            }
                            Color color29 = robot1.getPixelColor(237, 758);//确定位置在贝鲁点2
                            Color color31 = robot1.getPixelColor(238, 761);
                            Color color16 = robot1.getPixelColor(274, 801);
                            Color color32 = robot1.getPixelColor(278, 801);// 确定位置在贝鲁点1
                            if (color29.getRed() > 159 & color16.getRed() > 144 & color32.getRed() > 112 & color31.getRed() > 156) {
                                LOGGER.info("开始进入ten23step1循环");
                                localTenStep.set(1);
                                break;
                            }


                        }
                    }

                    LOGGER.info("在循环重新开始之前，localTenStep的值为：" + localTenStep.get());


                }
            }//在贝鲁斯兰开始采集，200~300升级，200级后进入5循环
            if (ten_1 == 25) {
                final Counter[] ten_3 = {new Counter(0)};
                LOGGER.info("25循环初始化3");
                counter = 0;
                LOGGER.info("25循环初始化counter");

                AtomicInteger localTenStep = new AtomicInteger(1);

                outerLoop2:

                for (;;) {

                    LOGGER.info("进入25循环");
                    Color color2333 = robot1.getPixelColor(964, 849);
                    Color color199 = robot1.getPixelColor(1178, 831);

                    Color color208 = robot1.getPixelColor(143, 754);
                    Color color209 = robot1.getPixelColor(616, 661);
                    Color color210 = robot1.getPixelColor(1159, 825);

                    if (color2333.getRed() > 200 & color199.getGreen() < 60) {
                        LOGGER.info("ten25判断可以吃药");
                        robot1.keyPress(KeyEvent.VK_EQUALS);//按住enter
                        robot1.delay(c);//按住一秒1秒后
                        robot1.keyRelease(KeyEvent.VK_EQUALS);


                    }
                    Color color211 = robot1.getPixelColor(885, 848);

                    if (color211.getRed() > 80 ) {
                        LOGGER.info("ten25判断可以恢复飞行技能");

                        robot1.keyPress(KeyEvent.VK_0);
                        robot1.delay(c);//按住一秒1秒后
                        robot1.keyRelease(KeyEvent.VK_0);

                    }
                    boolean condition2 = ColorChecker.checkColorAndExecuteCommand(robot, 1158, 825, 190, 25, 0,
                            () -> {
                            });


                    if (condition2 ) {
                        LOGGER.info("ten25判断飞行时间不够");
                        robot1.keyRelease(KeyEvent.VK_W);
                        Thread.sleep(c);
                        robot1.keyRelease(KeyEvent.VK_D);
                        LOGGER.info("ten25关掉W和D并开始下降10秒");
                        robot.keyPress(KeyEvent.VK_F);//按下键盘按键 上升
                        robot.delay(15000);//按住延迟
                        robot.keyRelease(KeyEvent.VK_F); //释放键盘按键
                        Thread.sleep(200); //延迟
                        LOGGER.info("ten25等待飞行时间恢复");
                        for (; ; ) {
                            Color color121 = robot1.getPixelColor(553, 380);
                            Color color122 = robot1.getPixelColor(562, 381);
                            if (color121.getRed() > 182 & color121.getRed() < 190 & color121.getGreen() < 191 & color121.getGreen() > 183
                                    & color121.getBlue() > 153 & color121.getBlue() < 161 & color122.getRed() > 209 & color122.getRed() < 217 & color122.getGreen() < 215 & color122.getGreen() > 207
                                    & color122.getBlue() > 169 & color122.getBlue() < 177) {
                                LOGGER.info("ten25step8死亡复活提示出现");
                                robot.mouseMove(842 + (int) v1, 479 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                robot.delay(20);
                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                robot.delay(50);

                                LOGGER.info("开始进入ten25step8循环");
                                localTenStep.set(8);
                                break ;
                            }
                            boolean condition1 = ColorChecker.checkColorAndExecuteCommand(robot, 1162, 825, 41, 117, 5,
                                    () -> {
                                    });
                            if (condition1) {
                                LOGGER.info("ten25-1飞行时间已恢复满");
                                Color color111 = robot1.getPixelColor(1160, 845);

                                if (color111.getRed() > 184) {
                                    LOGGER.info("ten25检测是可飞行地区");
                                    boolean condition22 = ColorChecker.checkColorAndExecuteCommand(robot, 1388, 190, 214, 212, 174,
                                            () -> {});//难民村的村1

                                    boolean condition23 = ColorChecker.checkColorAndExecuteCommand(robot, 1382, 190, 215, 213, 175,
                                            () -> {});//难民村的村2

                                    if (condition22 && condition23) {
                                        LOGGER.info("ten25检测已回城从ten25step1重新开始");
                                        localTenStep.set(1);
                                        break;
                                    }       //如果是超时需要这一步，其他地方采记得改这里

                                    LOGGER.info("ten25开始起飞");
                                    KeyUtil.pressKey(robot, KeyEvent.VK_R, -1);
                                    KeyUtil.pressKey(robot, KeyEvent.VK_F, -1);
                                    LOGGER.info("ten25停止前进并点击起飞按键");
                                    MouseUtil.moveWithCurve(robot, 1160 + (int) v1, 850 + (int) v1);
                                    Thread.sleep(1000); //延迟
                                    robot.delay(4500);//按住延迟
                                    LOGGER.info("开始上升");
                                    robot.keyPress(KeyEvent.VK_R);//按下键盘按键 上升
                                    robot.delay(2000);//按住延迟
                                    robot.keyRelease(KeyEvent.VK_R); //释放键盘按键
                                    Thread.sleep(200); //延迟

                                    if (color121.getRed() > 182 & color121.getRed() < 190 & color121.getGreen() < 191 & color121.getGreen() > 183
                                            & color121.getBlue() > 153 & color121.getBlue() < 161 & color122.getRed() > 209 & color122.getRed() < 217 & color122.getGreen() < 215 & color122.getGreen() > 207
                                            & color122.getBlue() > 169 & color122.getBlue() < 177) {
                                        LOGGER.info("ten25step8死亡复活提示出现");
                                        robot.mouseMove(842 + (int) v1, 479 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                        robot.delay(20);
                                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                        robot.delay(50);

                                        LOGGER.info("开始进入ten25step8循环");
                                        localTenStep.set(8);
                                        break outerLoop2;
                                    }
                                    LOGGER.info("ten25开始进入step3");
                                    localTenStep.set(3);
                                    break;
                                } else {
                                    for (; ; ) {
                                        LOGGER.info("ten25检测是禁飞行地区");
                                        robot1.keyPress(KeyEvent.VK_SPACE);
                                        robot1.delay(300);
                                        robot1.keyRelease(KeyEvent.VK_SPACE);
                                        robot.delay(100);
                                        robot.mouseMove(1160 + (int) v1, 850 + (int) v1); //
                                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                        robot.delay(20);
                                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                        LOGGER.info("跳跃起飞");
                                        robot.delay(2000);
                                        if (color121.getRed() > 182 & color121.getRed() < 190 & color121.getGreen() < 191 & color121.getGreen() > 183
                                                & color121.getBlue() > 153 & color121.getBlue() < 161 & color122.getRed() > 209 & color122.getRed() < 217 & color122.getGreen() < 215 & color122.getGreen() > 207
                                                & color122.getBlue() > 169 & color122.getBlue() < 177) {
                                            LOGGER.info("ten25step8死亡复活提示出现");
                                            robot.mouseMove(842 + (int) v1, 479 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                                            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                            robot.delay(20);
                                            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                            robot.delay(50);

                                            LOGGER.info("开始进入ten25step8循环");
                                            localTenStep.set(8);
                                            break outerLoop2;
                                        }
                                        Color color22 = robot1.getPixelColor(1162, 836);

                                        if (color22.getRed() > 184) {
                                            LOGGER.info("检测已经不在禁飞行地区");
                                            LOGGER.info("开始点R上升");
                                            robot.keyPress(KeyEvent.VK_R);//按下键盘按键 上升
                                            robot.delay(2000);//按住延迟
                                            LOGGER.info("上升2秒");
                                            robot.keyPress(KeyEvent.VK_W);//按下键盘按键 上升
                                            robot.keyPress(KeyEvent.VK_D);//按下键盘按键 上升
                                            robot.delay((int) v4);//按住延迟
                                            LOGGER.info("上升2秒");
                                            robot.keyRelease(KeyEvent.VK_D);
                                            robot.delay(2000);
                                            robot.keyRelease(KeyEvent.VK_W);
                                            robot.keyRelease(KeyEvent.VK_R);
                                            if (color121.getRed() > 182 & color121.getRed() < 190 & color121.getGreen() < 191 & color121.getGreen() > 183
                                                    & color121.getBlue() > 153 & color121.getBlue() < 161 & color122.getRed() > 209 & color122.getRed() < 217 & color122.getGreen() < 215 & color122.getGreen() > 207
                                                    & color122.getBlue() > 169 & color122.getBlue() < 177) {
                                                LOGGER.info("ten25step8死亡复活提示出现");
                                                robot.mouseMove(842 + (int) v1, 479 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                                robot.delay(20);
                                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                                robot.delay(50);

                                                LOGGER.info("开始进入ten25step8循环");
                                                localTenStep.set(8);
                                                break outerLoop2;
                                            }
                                            LOGGER.info("ten25开始进入ten_step =3");

                                            localTenStep.set(3);
                                            break outerLoop2;
                                        }
                                        LOGGER.info("等待12秒");
                                        Thread.sleep(12000);

                                    }


                                }
                            }
                            Thread.sleep(1000);

                        }
                    }
                    boolean condition5 = ColorChecker.checkColorAndExecuteCommand(robot, 1196, 111, 249, 244, 202,
                            () -> {
                            });
                    boolean condition6 = ColorChecker.checkColorAndExecuteCommand(robot, 1193, 114, 21, 34, 42,
                            () -> {
                            });


                    if (condition5 & condition6) {

                        LOGGER.info("ten25判断虚弱");
                        robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                        robot.delay(50);
                        robot.keyRelease(KeyEvent.VK_E);
                        robot.delay(50);
                        robot.keyRelease(KeyEvent.VK_Q);
                        robot.delay(50);//按住延迟
                        robot.keyRelease(KeyEvent.VK_D);
                        robot.delay(50);//按住延迟
                        robot.keyRelease(KeyEvent.VK_A);
                        LOGGER.info("开始进入ten25step1循环");
                        robot.delay(8000);
                        localTenStep.set(1);
                        break;
                    }
                    /*Color color22 = robot1.getPixelColor(1397, 327);// 100级是绿色


                    Color color19 = robot1.getPixelColor(1125, 303);//高级的高2
                    Color color18 = robot1.getPixelColor(1118, 309);// 高级的高1
                    if ( color19.getRed() > 176 & color18.getRed() > 185&color22.getGreen() > 148) {
                        LOGGER.info("判断ten25升级到400级开始进入ten20");


                        ten_1 = 20;
                        continue outerLoop5;

                    }*/
                    Color color1211 = robot1.getPixelColor(553, 380);
                    Color color1221 = robot1.getPixelColor(562, 381);
                    if (color1211.getRed() > 182 & color1211.getRed() < 190 & color1211.getGreen() < 191 & color1211.getGreen() > 183
                            & color1211.getBlue() > 153 & color1211.getBlue() < 161 & color1221.getRed() > 209 & color1221.getRed() < 217 & color1221.getGreen() < 215 & color1221.getGreen() > 207
                            & color1221.getBlue() > 169 & color1221.getBlue() < 177) {
                        LOGGER.info("ten25step8死亡复活提示出现");
                        robot.mouseMove(842 + (int) v1, 479 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                        robot.delay(20);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                        robot.delay(50);

                        LOGGER.info("开始进入ten25step8循环");
                        localTenStep.set(8);
                        break ;
                    }
                    boolean condition30 = ColorChecker.checkColorAndExecuteCommand(robot, 433, 40, 41, 44, 52,
                            () -> {
                            });
                    boolean condition31 = ColorChecker.checkColorAndExecuteCommand(robot, 525, 40, 41, 45, 54,
                            () -> {
                            });


                    if (condition30 & condition31) {
                        LOGGER.info("血条出现，开始点击并按esc1");
                        robot.mouseMove(375 + (int) v1, 47 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                        robot.delay(20);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                        robot.delay(50);
                        robot1.keyPress(KeyEvent.VK_ESCAPE);
                        robot1.delay(c);
                        robot1.keyRelease(KeyEvent.VK_ESCAPE);
                        robot1.delay(c);
                        LOGGER.info("ten25怪物血条出现");
                        robot1.keyPress(KeyEvent.VK_W);
                        LOGGER.info("ten25按下W");
                        robot1.keyPress(KeyEvent.VK_D);
                        LOGGER.info("ten25按下D");
                        robot1.delay(600);
                        robot1.keyRelease(KeyEvent.VK_D);
                        LOGGER.info("ten25释放D");
                        robot1.delay((int) v7);
                        robot1.keyPress(KeyEvent.VK_W);
                        LOGGER.info("ten25怪物血条出现按键操作完成准备进入3循环");

                        localTenStep.set(3);
                        continue ;
                    }

                    boolean[] executeStep3 = new boolean[20];



                    if (localTenStep.get() == 1) {
                        LOGGER.info("进入25-step1循环");
                        Color color206 = robot1.getPixelColor(148, 758);
                        //去的路径

                        if (color206.getRed() > 177) {
                            LOGGER.info("25-step1找到起始方向");

                            boolean condition7 = ColorChecker.checkColorAndExecuteCommand(robot, 1196, 111, 249, 244, 202,
                                    () -> {
                                    });
                            boolean condition8 = ColorChecker.checkColorAndExecuteCommand(robot, 1193, 114, 21, 34, 42,
                                    () -> {
                                    });


                            if (condition7 & condition8) {
                                Thread.sleep(24000);
                                LOGGER.info("判断虚弱");
                            }
                            LOGGER.info("25-step1往前走");
                            Thread.sleep(500); //延迟
                            robot1.keyPress(KeyEvent.VK_W);//往前走
                            localTenStep.set(20);



                                outerLoop4:
                                for (; ; ) {

                                    boolean condition3 = ColorChecker.checkColorAndExecuteCommand(robot, 625, 705, 23, 30, 41,
                                            () -> {
                                            });

                                    boolean condition4 = ColorChecker.checkColorAndExecuteCommand(robot, 813, 705, 23, 30, 41,
                                            () -> {
                                            });
                                    boolean condition102 = ColorChecker.checkColorAndExecuteCommand(robot, 631, 695, 12, 16, 19,
                                            () -> {
                                            });
                                    Color color123 = robot1.getPixelColor(625, 705);

                                    Color color124 = robot1.getPixelColor(813, 705);

                                    Color color125 = robot1.getPixelColor(631, 695);


                                    if (condition3 && condition4 & condition102) {
                                        LOGGER.info("ten25step1点9回城条出现准备进入step8");
                                        localTenStep.set(8);
                                        break outerLoop4;
                                    }



                                    if (condition30 & condition31) {
                                        LOGGER.info("血条出现，开始点击并按esc2");
                                        robot.mouseMove(375 + (int) v1, 47 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                        robot.delay(20);
                                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                        robot.delay(50);
                                        robot1.keyPress(KeyEvent.VK_ESCAPE);
                                        robot1.delay(c);
                                        robot1.keyRelease(KeyEvent.VK_ESCAPE);
                                        robot1.delay(c);
                                        LOGGER.info("ten25怪物血条出现");
                                        robot1.keyPress(KeyEvent.VK_W);
                                        LOGGER.info("ten25按下W");
                                        robot1.keyPress(KeyEvent.VK_D);
                                        LOGGER.info("ten25按下D");
                                        robot1.delay(600);
                                        robot1.keyRelease(KeyEvent.VK_D);
                                        LOGGER.info("ten25释放D");
                                        robot1.delay((int) v7);
                                        robot1.keyPress(KeyEvent.VK_W);
                                        LOGGER.info("ten25怪物血条出现按键操作完成准备进入3循环");


                                        localTenStep.set(3);
                                        break outerLoop4;
                                    }
                                    Color color121 = robot1.getPixelColor(553, 380);
                                    Color color122 = robot1.getPixelColor(562, 381);
                                    if (color121.getRed() > 182 & color121.getRed() < 190 & color121.getGreen() < 191 & color121.getGreen() > 183
                                            & color121.getBlue() > 153 & color121.getBlue() < 161 & color122.getRed() > 209 & color122.getRed() < 217 & color122.getGreen() < 215 & color122.getGreen() > 207
                                            & color122.getBlue() > 169 & color122.getBlue() < 177) {
                                        LOGGER.info("ten25step8死亡复活提示出现");
                                        robot.mouseMove(842 + (int) v1, 479 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                        robot.delay(20);
                                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                        robot.delay(50);

                                        LOGGER.info("开始进入ten25step8循环");
                                        localTenStep.set(8);
                                        break outerLoop4;
                                    }
                                    if (localTenStep.get() == 20) {
                                        Color color32 = robot1.getPixelColor(206, 804);
                                        LOGGER.info("进入ten25step20循环");

                                        System.out.println("Color at (206, 804): " + color32);
                                        if (color32.getRed() > 159) {
                                            localTenStep.set(9);

                                        }

                                    }

                                    if (localTenStep.get() == 9) {
                                        AngleCalculatorTask task = new AngleCalculatorTask(robot, 153, 756);
                                        Thread.sleep(100);
                                        LOGGER.info("25-STEP9-1");
                                        task.run();

                                        Color color31 = robot1.getPixelColor(123, 761);
                                        System.out.println("Color at (136, 813): " + color31);
                                        if (color31.getRed() > 126) {
                                            LOGGER.info("判断出25-STEP9-2按e");
                                            KeyUtil.pressKey(robot, KeyEvent.VK_E, -1);
                                            KeyUtil.pressKey(robot, KeyEvent.VK_E, -1);
                                        }

                                        Color color32 = robot1.getPixelColor(136, 813);
                                        System.out.println("Color at (136, 813): " + color32);
                                        if (color32.getRed() > 124) {
                                            LOGGER.info("判断出25-STEP9-3按e");
                                            KeyUtil.pressKey(robot, KeyEvent.VK_E, -1);

                                        }

                                        int[][] colors = {
                                                {200, 793, 163} // x1, y1, red1
                                        };

                                        ColorChecker4.Callback callback = new ColorChecker4.Callback() {
                                            @Override
                                            public void onTaskCompleted() {
                                                System.out.println("Callback: onTaskCompleted() called.");
                                                executeStep3[0] = true;
                                            }
                                        };
                                        Color color277 = robot1.getPixelColor(200, 793);
                                        System.out.println("Color at (200, 793): " + color277);

                                        CustomState customState = new CustomState();
                                        ColorChecker4.checkColorAndExecuteCommandWithTimeout(customState, colors, 35, 900, 1200,
                                                () -> {

                                                    LOGGER.info("25-STEP9-2");


                                                    localTenStep.set(11);
                                                    executeStep3[0] = true;
                                                    return;


                                                },
                                                Optional.empty(),
                                                callback);
                                        if (executeStep3[0]) {
                                            localTenStep.set(11);

                                        }

                                        LOGGER.info("ten25step9运行完毕");

                                    }
                                    if (localTenStep.get() == 11) {
                                        AngleCalculatorTask task = new AngleCalculatorTask(robot, 153, 756);
                                        Thread.sleep(100);
                                        LOGGER.info("25-STEP11-1");
                                        task.run();
                                        /*boolean condition1 = ColorChecker.checkColorAndExecuteCommand(robot, 70, 808, 142, 133, 82,
                                                () -> {
                                                });
                                        if (condition1) {
                                            LOGGER.info("判断出25-STEP11-2按q");
                                            KeyUtil.pressKey(robot, KeyEvent.VK_Q, -1);
                                        }*/

                                        int[][] colors = {
                                                {165, 736, 157} // x1, y1, red1
                                        };

                                        ColorChecker4.Callback callback = new ColorChecker4.Callback() {
                                            @Override
                                            public void onTaskCompleted() {
                                                System.out.println("Callback: onTaskCompleted() called.");
                                                executeStep3[1] = true;
                                            }
                                        };
                                        Color color277 = robot1.getPixelColor(165, 736);
                                        System.out.println("Color at (165, 736): " + color277);

                                        CustomState customState = new CustomState();
                                        ColorChecker4.checkColorAndExecuteCommandWithTimeout(customState, colors, 30, 900, 1200,
                                                () -> {
                                                    LOGGER.info("ten25step11准备");


                                                    localTenStep.set(12);
                                                    executeStep3[1] = true;
                                                    return;

                                                },
                                                Optional.empty(),
                                                callback);
                                        if (executeStep3[1]) {
                                            localTenStep.set(12);

                                        }

                                        LOGGER.info("ten25step11运行完毕");

                                    }
                                    if (localTenStep.get() == 12) {
                                        AngleCalculatorTask task = new AngleCalculatorTask(robot, 153, 746);
                                        Thread.sleep(100);
                                        LOGGER.info("25-STEP12-1");
                                        task.run();
                                        /*Color color32 = robot1.getPixelColor(129, 761);

                                        System.out.println("Color at (129, 761): " + color32);
                                        if (color32.getRed() > 102) {
                                            LOGGER.info("判断出25-STEP11-2按e");
                                            KeyUtil.pressKey(robot, KeyEvent.VK_E, -1);
                                        }*/

                                        int[][] colors = {
                                                {66, 787, 102} // x1, y1, red1
                                        };

                                        ColorChecker4.Callback callback = new ColorChecker4.Callback() {
                                            @Override
                                            public void onTaskCompleted() {
                                                System.out.println("Callback: onTaskCompleted() called.");
                                                executeStep3[2] = true;
                                            }
                                        };

                                        CustomState customState = new CustomState();
                                        ColorChecker4.checkColorAndExecuteCommandWithTimeout(customState, colors, 30, 900, 1200,
                                                () -> {

                                                    localTenStep.set(13);
                                                    executeStep3[2] = true;
                                                    return;

                                                },
                                                Optional.empty(),
                                                callback);
                                        if (executeStep3[2]) {
                                            localTenStep.set(13);

                                        }
                                        LOGGER.info("ten25step12运行完毕");

                                    }

                                    if (localTenStep.get() == 19) {
                                        AngleCalculatorTask task = new AngleCalculatorTask(robot, 155, 751);
                                        Thread.sleep(100);
                                        LOGGER.info("25-STEP19-1");
                                        task.run();
                                        /*Color color32 = robot1.getPixelColor(136, 813);

                                        System.out.println("Color at (136, 813): " + color32);
                                        if (color32.getRed() > 124) {
                                            LOGGER.info("判断出25-STEP11-2按e");
                                            KeyUtil.pressKey(robot, KeyEvent.VK_E, -1);
                                        }*/

                                        int[][] colors = {
                                                {130, 758, 118} // x1, y1, red1
                                        };

                                        ColorChecker4.Callback callback = new ColorChecker4.Callback() {
                                            @Override
                                            public void onTaskCompleted() {
                                                System.out.println("Callback: onTaskCompleted() called.");
                                                executeStep3[9] = true;
                                            }
                                        };

                                        CustomState customState = new CustomState();
                                        ColorChecker4.checkColorAndExecuteCommandWithTimeout(customState, colors, 30, 900, 1200,
                                                () -> {

                                                    localTenStep.set(13);
                                                    executeStep3[9] = true;
                                                    return;

                                                },
                                                Optional.empty(),
                                                callback);
                                        if (executeStep3[9]) {
                                            localTenStep.set(13);

                                        }
                                        LOGGER.info("ten25step12运行完毕");

                                    }
                                    if (localTenStep.get() == 13) {
                                        AngleCalculatorTask task = new AngleCalculatorTask(robot, 154, 746);
                                        Thread.sleep(100);
                                        LOGGER.info("25-STEP13-1");
                                        task.run();
                                        Color color32 = robot1.getPixelColor(137, 753);

                                        System.out.println("Color at (137, 753): " + color32);
                                        if (color32.getRed() > 159) {
                                            LOGGER.info("25-STEP13-2检测出按Q");
                                            robot.keyPress(KeyEvent.VK_Q);//按下键盘按键 上升
                                            robot.delay(700);//按住延迟

                                            robot.keyRelease(KeyEvent.VK_Q); //释放键盘按键
                                        }

                                        int[][] colors = {
                                                {169, 674, 145} // x1, y1, red1
                                        };

                                        ColorChecker4.Callback callback = new ColorChecker4.Callback() {
                                            @Override
                                            public void onTaskCompleted() {
                                                System.out.println("Callback: onTaskCompleted() called.");
                                                executeStep3[3] = true;
                                            }
                                        };

                                        CustomState customState = new CustomState();
                                        ColorChecker4.checkColorAndExecuteCommandWithTimeout(customState, colors, 30, 900, 1200,
                                                () -> {

                                                    localTenStep.set(30);
                                                    executeStep3[3] = true;
                                                    return;

                                                },
                                                Optional.empty(),
                                                callback);
                                        if (executeStep3[3]) {
                                            localTenStep.set(30);

                                        }


                                    }
                                    if (localTenStep.get() == 30) {
                                        AngleCalculatorTask task = new AngleCalculatorTask(robot, 154, 746);
                                        Thread.sleep(100);
                                        LOGGER.info("25-STEP30-1");
                                        task.run();


                                        int[][] colors = {
                                                {141, 688, 103} // x1, y1, red1
                                        };

                                        ColorChecker4.Callback callback = new ColorChecker4.Callback() {
                                            @Override
                                            public void onTaskCompleted() {
                                                System.out.println("Callback: onTaskCompleted() called.");
                                                executeStep3[17] = true;
                                            }
                                        };

                                        CustomState customState = new CustomState();
                                        ColorChecker4.checkColorAndExecuteCommandWithTimeout(customState, colors, 30, 900, 1200,
                                                () -> {

                                                    localTenStep.set(14);
                                                    executeStep3[17] = true;
                                                    return;

                                                },
                                                Optional.empty(),
                                                callback);
                                        if (executeStep3[17]) {
                                            localTenStep.set(14);

                                        }


                                    }
                                    if (localTenStep.get() == 14) {
                                        AngleCalculatorTask task = new AngleCalculatorTask(robot, 152, 745);
                                        Thread.sleep(100);
                                        LOGGER.info("25-STEP14-1");
                                        task.run();
                                        /*Color color32 = robot1.getPixelColor(83, 792);

                                        System.out.println("Color at (83, 792): " + color32);
                                        if (color32.getRed() > 117) {
                                            LOGGER.info("判断出25-STEP11-2按e");
                                            KeyUtil.pressKey(robot, KeyEvent.VK_E, -1);
                                        }*/
                                        Color color32 = robot1.getPixelColor(67, 780);

                                        System.out.println("Color at (67, 780): " + color32);

                                        int[][] colors = {
                                                {67, 780, 157} // x1, y1, red1
                                        };

                                        ColorChecker4.Callback callback = new ColorChecker4.Callback() {
                                            @Override
                                            public void onTaskCompleted() {
                                                System.out.println("Callback: onTaskCompleted() called.");
                                                executeStep3[10] = true;
                                            }
                                        };

                                        CustomState customState = new CustomState();
                                        ColorChecker4.checkColorAndExecuteCommandWithTimeout(customState, colors, 30, 900, 1200,
                                                () -> {

                                                    localTenStep.set(21);
                                                    executeStep3[10] = true;
                                                    return;

                                                },
                                                Optional.empty(),
                                                callback);
                                        if (executeStep3[10]) {
                                            localTenStep.set(21);

                                        }
                                        LOGGER.info("ten25step14运行完毕");

                                    }
                                    if (localTenStep.get() == 21) {
                                        AngleCalculatorTask task = new AngleCalculatorTask(robot, 147, 744);
                                        Thread.sleep(100);
                                        LOGGER.info("25-STEP21-1");
                                        task.run();
                                        /*Color color32 = robot1.getPixelColor(83, 792);

                                        System.out.println("Color at (83, 792): " + color32);
                                        if (color32.getRed() > 117) {
                                            LOGGER.info("判断出25-STEP11-2按e");
                                            KeyUtil.pressKey(robot, KeyEvent.VK_E, -1);
                                        }*/

                                        int[][] colors = {
                                                {99, 787, 134} // x1, y1, red1
                                        };

                                        ColorChecker4.Callback callback = new ColorChecker4.Callback() {
                                            @Override
                                            public void onTaskCompleted() {
                                                System.out.println("Callback: onTaskCompleted() called.");
                                                executeStep3[4] = true;
                                            }
                                        };

                                        CustomState customState = new CustomState();
                                        ColorChecker4.checkColorAndExecuteCommandWithTimeout(customState, colors, 30, 900, 1200,
                                                () -> {

                                                    localTenStep.set(15);
                                                    executeStep3[4] = true;
                                                    return;

                                                },
                                                Optional.empty(),
                                                callback);
                                        if (executeStep3[4]) {
                                            localTenStep.set(15);

                                        }
                                        LOGGER.info("ten25step21运行完毕");

                                    }
                                    if (localTenStep.get() == 15) {
                                        AngleCalculatorTask task = new AngleCalculatorTask(robot, 149, 743);
                                        Thread.sleep(100);
                                        LOGGER.info("25-STEP15-1");
                                        task.run();
                                        /*boolean condition1 = ColorChecker.checkColorAndExecuteCommand(robot, 105, 821, 153, 144, 91,
                                                () -> {
                                                });
                                        if (condition1) {
                                            LOGGER.info("判断出25-STEP11-2按e");
                                            KeyUtil.pressKey(robot, KeyEvent.VK_E, -1);
                                        }*/
                                        robot.delay(500);
                                        localTenStep.set(27);


                                    }
                                    if (localTenStep.get() == 27) {
                                        AngleCalculatorTask task = new AngleCalculatorTask(robot, 154, 745);
                                        Thread.sleep(100);
                                        LOGGER.info("25-STEP27-1");
                                        task.run();
                                        /*boolean condition1 = ColorChecker.checkColorAndExecuteCommand(robot, 105, 821, 153, 144, 91,
                                                () -> {
                                                });
                                        if (condition1) {
                                            LOGGER.info("判断出25-STEP11-2按e");
                                            KeyUtil.pressKey(robot, KeyEvent.VK_E, -1);
                                        }*/

                                        int[][] colors = {
                                                {61, 795, 128} // x1, y1, red1
                                        };

                                        ColorChecker4.Callback callback = new ColorChecker4.Callback() {
                                            @Override
                                            public void onTaskCompleted() {
                                                System.out.println("Callback: onTaskCompleted() called.");
                                                executeStep3[5] = true;
                                            }
                                        };

                                        CustomState customState = new CustomState();
                                        ColorChecker4.checkColorAndExecuteCommandWithTimeout(customState, colors, 30, 900, 1200,
                                                () -> {

                                                    localTenStep.set(16);
                                                    executeStep3[5] = true;
                                                    return;

                                                },
                                                Optional.empty(),
                                                callback);
                                        if (executeStep3[5]) {
                                            localTenStep.set(16);

                                        }


                                    }
                                    if (localTenStep.get() == 16) {
                                        AngleCalculatorTask task = new AngleCalculatorTask(robot, 153, 746);
                                        Thread.sleep(100);
                                        LOGGER.info("25-STEP16-1");
                                        task.run();
                                        /*boolean condition1 = ColorChecker.checkColorAndExecuteCommand(robot, 105, 821, 153, 144, 91,
                                                () -> {
                                                });
                                        if (condition1) {
                                            LOGGER.info("判断出25-STEP11-2按e");
                                            KeyUtil.pressKey(robot, KeyEvent.VK_E, -1);
                                        }*/

                                        int[][] colors = {
                                                {59, 798, 161} // x1, y1, red1
                                        };

                                        ColorChecker4.Callback callback = new ColorChecker4.Callback() {
                                            @Override
                                            public void onTaskCompleted() {
                                                System.out.println("Callback: onTaskCompleted() called.");
                                                executeStep3[6] = true;
                                            }
                                        };

                                        CustomState customState = new CustomState();
                                        ColorChecker4.checkColorAndExecuteCommandWithTimeout(customState, colors, 30, 900, 1200,
                                                () -> {

                                                    localTenStep.set(17);
                                                    executeStep3[6] = true;
                                                    return;

                                                },
                                                Optional.empty(),
                                                callback);
                                        if (executeStep3[6]) {
                                            localTenStep.set(17);

                                        }
                                        LOGGER.info("ten25step16运行完毕");

                                    }
                                    if (localTenStep.get() == 17) {
                                        AngleCalculatorTask task = new AngleCalculatorTask(robot, 154, 754);
                                        Thread.sleep(100);
                                        LOGGER.info("25-STEP17-1");
                                        task.run();
                                        /*boolean condition1 = ColorChecker.checkColorAndExecuteCommand(robot, 105, 821, 153, 144, 91,
                                                () -> {
                                                });
                                        if (condition1) {
                                            LOGGER.info("判断出25-STEP11-2按e");
                                            KeyUtil.pressKey(robot, KeyEvent.VK_E, -1);
                                        }*/

                                        robot.delay(1300);
                                            localTenStep.set(18);



                                    }
                                    if (localTenStep.get() == 18) {
                                        AngleCalculatorTask task = new AngleCalculatorTask(robot, 153, 746);
                                        Thread.sleep(100);
                                        LOGGER.info("25-STEP18-1");
                                        task.run();
                                        /*boolean condition1 = ColorChecker.checkColorAndExecuteCommand(robot, 105, 821, 153, 144, 91,
                                                () -> {
                                                });
                                        if (condition1) {
                                            LOGGER.info("判断出25-STEP11-2按e");
                                            KeyUtil.pressKey(robot, KeyEvent.VK_E, -1);
                                        }*/

                                        int[][] colors = {
                                                {35, 809, 130} // x1, y1, red1
                                        };

                                        ColorChecker4.Callback callback = new ColorChecker4.Callback() {
                                            @Override
                                            public void onTaskCompleted() {
                                                System.out.println("Callback: onTaskCompleted() called.");
                                                executeStep3[14] = true;
                                            }
                                        };

                                        CustomState customState = new CustomState();
                                        ColorChecker4.checkColorAndExecuteCommandWithTimeout(customState, colors, 30, 900, 1200,
                                                () -> {



                                                    localTenStep.set(28);
                                                    executeStep3[14] = true;
                                                    return;

                                                },
                                                Optional.empty(),
                                                callback);
                                        if (executeStep3[14]) {
                                            localTenStep.set(28);

                                        }
                                        LOGGER.info("ten25step18运行完毕");

                                    }
                                    if (localTenStep.get() == 28) {
                                        AngleCalculatorTask task = new AngleCalculatorTask(robot, 154, 754);
                                        Thread.sleep(100);
                                        LOGGER.info("25-STEP28-1");
                                        task.run();
                                        /*boolean condition1 = ColorChecker.checkColorAndExecuteCommand(robot, 105, 821, 153, 144, 91,
                                                () -> {
                                                });
                                        if (condition1) {
                                            LOGGER.info("判断出25-STEP11-2按e");
                                            KeyUtil.pressKey(robot, KeyEvent.VK_E, -1);
                                        }*/

                                        int[][] colors = {
                                                {47, 805, 161} // x1, y1, red1
                                        };

                                        ColorChecker4.Callback callback = new ColorChecker4.Callback() {
                                            @Override
                                            public void onTaskCompleted() {
                                                System.out.println("Callback: onTaskCompleted() called.");
                                                executeStep3[15] = true;
                                            }
                                        };

                                        CustomState customState = new CustomState();
                                        ColorChecker4.checkColorAndExecuteCommandWithTimeout(customState, colors, 30, 900, 1200,
                                                () -> {



                                                    localTenStep.set(29);
                                                    executeStep3[15] = true;
                                                    return;

                                                },
                                                Optional.empty(),
                                                callback);
                                        if (executeStep3[15]) {
                                            localTenStep.set(29);

                                        }


                                    }
                                    if (localTenStep.get() == 29) {
                                        AngleCalculatorTask task = new AngleCalculatorTask(robot, 149, 759);
                                        Thread.sleep(100);
                                        LOGGER.info("25-STEP29-1");
                                        task.run();
                                        /*boolean condition1 = ColorChecker.checkColorAndExecuteCommand(robot, 105, 821, 153, 144, 91,
                                                () -> {
                                                });
                                        if (condition1) {
                                            LOGGER.info("判断出25-STEP11-2按e");
                                            KeyUtil.pressKey(robot, KeyEvent.VK_E, -1);
                                        }*/

                                        int[][] colors = {
                                                {45, 791, 147} // x1, y1, red1
                                        };

                                        ColorChecker4.Callback callback = new ColorChecker4.Callback() {
                                            @Override
                                            public void onTaskCompleted() {
                                                System.out.println("Callback: onTaskCompleted() called.");
                                                executeStep3[16] = true;
                                            }
                                        };

                                        CustomState customState = new CustomState();
                                        ColorChecker4.checkColorAndExecuteCommandWithTimeout(customState, colors, 30, 900, 1200,
                                                () -> {
                                                    robot.keyRelease(KeyEvent.VK_W);


                                                    localTenStep.set(25);
                                                    executeStep3[16] = true;
                                                    return;

                                                },
                                                Optional.empty(),
                                                callback);
                                        if (executeStep3[16]) {
                                            localTenStep.set(25);

                                        }


                                    }
                                    if (localTenStep.get() == 25) {
                                        robot1.delay(500);
                                        robot1.keyPress(KeyEvent.VK_R);                //如果没采集
                                        robot1.delay(c);
                                        robot1.keyRelease(KeyEvent.VK_R);
                                        robot1.delay(c);
                                        robot1.keyPress(KeyEvent.VK_F);                //如果没采集
                                        robot1.delay(c);
                                        robot1.keyRelease(KeyEvent.VK_F);
                                        robot1.delay(c);
                                        robot1.keyPress(KeyEvent.VK_6);                //如果没采集
                                        robot1.delay(c);
                                        robot1.keyRelease(KeyEvent.VK_6);
                                        robot1.delay(15000);
                                            localTenStep.set(22);



                                    }

                                    if (localTenStep.get() == 22) {
                                        AngleCalculatorTask task = new AngleCalculatorTask(robot, 145, 757);
                                        Thread.sleep(100);
                                        LOGGER.info("25-STEP22-1");
                                        task.run();
                                        /*boolean condition1 = ColorChecker.checkColorAndExecuteCommand(robot, 105, 821, 153, 144, 91,
                                                () -> {
                                                });
                                        if (condition1) {
                                            LOGGER.info("判断出25-STEP11-2按e");
                                            KeyUtil.pressKey(robot, KeyEvent.VK_E, -1);
                                        }*/

                                        int[][] colors = {
                                                {146, 758, 123} // x1, y1, red1
                                        };

                                        ColorChecker4.Callback callback = new ColorChecker4.Callback() {
                                            @Override
                                            public void onTaskCompleted() {
                                                System.out.println("Callback: onTaskCompleted() called.");
                                                executeStep3[11] = true;
                                            }
                                        };

                                        CustomState customState = new CustomState();
                                        ColorChecker4.checkColorAndExecuteCommandWithTimeout(customState, colors, 30, 900, 1200,
                                                () -> {
                                                    robot1.keyPress(KeyEvent.VK_W);


                                                    localTenStep.set(23);
                                                    executeStep3[11] = true;
                                                    return;

                                                },
                                                Optional.empty(),
                                                callback);
                                        if (executeStep3[11]) {
                                            localTenStep.set(23);

                                        }
                                        LOGGER.info("ten25step22运行完毕");

                                    }
                                    if (localTenStep.get() == 23) {
                                        AngleCalculatorTask task = new AngleCalculatorTask(robot, 145, 757);
                                        Thread.sleep(100);
                                        LOGGER.info("25-STEP23-1");
                                        task.run();
                                        /*boolean condition1 = ColorChecker.checkColorAndExecuteCommand(robot, 105, 821, 153, 144, 91,
                                                () -> {
                                                });
                                        if (condition1) {
                                            LOGGER.info("判断出25-STEP11-2按e");
                                            KeyUtil.pressKey(robot, KeyEvent.VK_E, -1);
                                        }*/
                                        robot.delay(1000);
                                        LOGGER.info("ten25step23准备往前走");
                                        robot.keyPress(KeyEvent.VK_W);//按下键盘按键 上升
                                        robot.delay(1500);
                                        robot.keyRelease(KeyEvent.VK_W);
                                        LOGGER.info("ten25step23往前走完成准备进入step25");

                                        localTenStep.set(25);


                                    }
                                    if (localTenStep.get() == 25) {
                                        double v9 = 0.03 + random.nextDouble() * (0.03 - 0.01);//定义随机延迟在0.05-0.01秒之间 鼠标的延迟 robot.delay((int) v);

                                        v9 = v9 * 1000;
                                        LOGGER.info("进入ten25step25停止前进并点击起飞按键");

                                        robot.mouseMove(1160 + (int) v1, 850 + (int) v1); // 鼠标移动到xx坐标轴 点击阻止
                                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                        robot.delay((int) v9);
                                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                        robot.delay(200);


                                        LOGGER.info("开始点R上升");
                                        robot.keyPress(KeyEvent.VK_R);//按下键盘按键 上升
                                        robot.delay(2000);//按住延迟
                                        LOGGER.info("上升2秒停止");
                                        robot.keyRelease(KeyEvent.VK_R); //释放键盘按键
                                            localTenStep.set(24);


                                    }
                                    if (localTenStep.get() == 24) {
                                        AngleCalculatorTask task = new AngleCalculatorTask(robot, 154, 751);
                                        Thread.sleep(100);
                                        LOGGER.info("25-STEP24-1");
                                        task.run();
                                        /*boolean condition1 = ColorChecker.checkColorAndExecuteCommand(robot, 105, 821, 153, 144, 91,
                                                () -> {
                                                });
                                        if (condition1) {
                                            LOGGER.info("判断出25-STEP11-2按e");
                                            KeyUtil.pressKey(robot, KeyEvent.VK_E, -1);
                                        }*/



                                        Thread.sleep(1000);
                                                    localTenStep.set(26);




                                    }
                                    if (localTenStep.get() == 26) {
                                        robot.keyPress(KeyEvent.VK_W);//按下键盘按键 上升
                                        robot.delay(13000);//按住延迟
                                        LOGGER.info("上升4.5秒停止");
                                        robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                                            localTenStep.set(3);
                                            break outerLoop4;



                                    }

                                }


                        } else {
                            LOGGER.info("角度不对开始转向2");
                            robot1.keyPress(KeyEvent.VK_A);
                            robot1.delay(10);
                            robot1.keyRelease(KeyEvent.VK_A);
                            Thread.sleep(200);
                            LOGGER.info("开始回到25-step = 1");
                            localTenStep.set(1);
                        }
                    }



                    if (localTenStep.get() == 2) {

                        LOGGER.info("进入ten25step2");
                        robot1.keyRelease(KeyEvent.VK_W);
                        Thread.sleep(c);
                        robot1.keyRelease(KeyEvent.VK_D);
                        LOGGER.info("关掉W和D并开始下降10秒");
                        robot.keyPress(KeyEvent.VK_F);//按下键盘按键 上升
                        robot.delay(15000);//按住延迟
                        robot.keyRelease(KeyEvent.VK_F); //释放键盘按键
                        Thread.sleep(200); //延迟
                        LOGGER.info("等待飞行时间恢复");
                        for (; ; ) {

                            if (color1211.getRed() > 182 & color1211.getRed() < 190 & color1211.getGreen() < 191 & color1211.getGreen() > 183
                                    & color1211.getBlue() > 153 & color1211.getBlue() < 161 & color1221.getRed() > 209 & color1221.getRed() < 217 & color1221.getGreen() < 215 & color1221.getGreen() > 207
                                    & color1221.getBlue() > 169 & color1221.getBlue() < 177) {
                                LOGGER.info("ten25step8死亡复活提示出现");
                                robot.mouseMove(842 + (int) v1, 479 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                robot.delay(20);
                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                robot.delay(50);

                                LOGGER.info("开始进入ten25step8循环");
                                localTenStep.set(8);
                                break ;
                            }
                            boolean condition1 = ColorChecker.checkColorAndExecuteCommand(robot, 1162, 825, 41, 117, 5,
                                    () -> {
                                    });
                            if (condition1) {

                                LOGGER.info("ten25step2飞行时间已恢复满");
                                Color color111 = robot1.getPixelColor(1160, 845);


                                if (color111.getRed() > 184) {

                                    if (color1211.getRed() > 182 & color1211.getRed() < 190 & color1211.getGreen() < 191 & color1211.getGreen() > 183
                                            & color1211.getBlue() > 153 & color1211.getBlue() < 161 & color1221.getRed() > 209 & color1221.getRed() < 217 & color1221.getGreen() < 215 & color1221.getGreen() > 207
                                            & color1221.getBlue() > 169 & color1221.getBlue() < 177) {
                                        LOGGER.info("ten25step8死亡复活提示出现");
                                        robot.mouseMove(842 + (int) v1, 479 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                        robot.delay(20);
                                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                        robot.delay(50);

                                        LOGGER.info("开始进入ten25step8循环");
                                        localTenStep.set(8);
                                        break ;
                                    }
                                    LOGGER.info("ten25step2检测是可飞行地区");
                                    boolean condition22 = ColorChecker.checkColorAndExecuteCommand(robot, 1388, 190, 214, 212, 174,
                                            () -> {});//难民村的村1

                                    boolean condition23 = ColorChecker.checkColorAndExecuteCommand(robot, 1382, 190, 215, 213, 175,
                                            () -> {});//难民村的村2

                                    if (condition22 && condition23) {
                                        LOGGER.info("检测在难民村回城点从ten25step1重新开始");
                                        localTenStep.set(1);
                                        break;
                                    }       //如果是超时需要这一步，其他地方采记得改这里

                                    LOGGER.info("ten25step2开始起飞");
                                    KeyUtil.pressKey(robot, KeyEvent.VK_R, -1);
                                    KeyUtil.pressKey(robot, KeyEvent.VK_F, -1);
                                    LOGGER.info("停止前进并点击起飞按键");
                                    MouseUtil.moveWithCurve(robot, 1160 + (int) v1, 850 + (int) v1);
                                    Thread.sleep(1000); //延迟
                                    robot.delay(4500);//按住延迟
                                    LOGGER.info("开始上升");
                                    robot.keyPress(KeyEvent.VK_R);//按下键盘按键 上升
                                    robot.delay(2000);//按住延迟
                                    robot.keyRelease(KeyEvent.VK_R); //释放键盘按键
                                    Thread.sleep(200); //延迟
                                    LOGGER.info("ten23step2开始进入step3");
                                    localTenStep.set(3);
                                    break;
                                } else {
                                    for (; ; ) {

                                        if (color1211.getRed() > 182 & color1211.getRed() < 190 & color1211.getGreen() < 191 & color1211.getGreen() > 183
                                                & color1211.getBlue() > 153 & color1211.getBlue() < 161 & color1221.getRed() > 209 & color1221.getRed() < 217 & color1221.getGreen() < 215 & color1221.getGreen() > 207
                                                & color1221.getBlue() > 169 & color1221.getBlue() < 177) {
                                            LOGGER.info("ten25step8死亡复活提示出现");
                                            robot.mouseMove(842 + (int) v1, 479 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                                            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                            robot.delay(20);
                                            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                            robot.delay(50);

                                            LOGGER.info("开始进入ten25step8循环");
                                            localTenStep.set(8);
                                            break ;
                                        }
                                        LOGGER.info("ten25step2检测是禁飞行地区");
                                        robot1.keyPress(KeyEvent.VK_SPACE);
                                        robot1.delay(300);
                                        robot1.keyRelease(KeyEvent.VK_SPACE);
                                        robot.delay(100);
                                        robot.mouseMove(1160 + (int) v1, 850 + (int) v1); //
                                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                        robot.delay(20);
                                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                        LOGGER.info("跳跃起飞");
                                        robot.delay(2000);
                                        Color color202 = robot1.getPixelColor(1162, 836);

                                        if (color202.getRed() > 184) {
                                            LOGGER.info("ten25step2检测已经不在禁飞行地区");
                                            LOGGER.info("开始点R上升");
                                            robot.keyPress(KeyEvent.VK_R);//按下键盘按键 上升
                                            robot.delay(2000);//按住延迟
                                            LOGGER.info("上升2秒");
                                            robot.keyPress(KeyEvent.VK_W);//按下键盘按键 上升
                                            robot.keyPress(KeyEvent.VK_D);//按下键盘按键 上升
                                            robot.delay((int) v4);//按住延迟
                                            LOGGER.info("上升2秒");
                                            robot.keyRelease(KeyEvent.VK_D);
                                            robot.delay(2000);
                                            robot.keyRelease(KeyEvent.VK_W);
                                            robot.keyRelease(KeyEvent.VK_R);
                                            LOGGER.info("ten25step2开始进入ten_step =3");

                                            localTenStep.set(3);
                                            break;
                                        }
                                        LOGGER.info("等待12秒");
                                        Thread.sleep(12000);

                                    }


                                }
                            }
                            Thread.sleep(1000);

                        }

                    }

                    if (localTenStep.get() == 3 ) {
                        LOGGER.info("进入ten25step3");
                        Rectangle screenRange = new Rectangle(1267, 12, 167, 167);
                        String keyword = "小地图奥德图标";
                        String folderPath = "D:/截图/正确截图";
                        int similarity = 95;
                        int n = 1; // 获取第一近的点
                        int keyToPress = KeyEvent.VK_3; // 按下并释放的键 (例如 6)
                        long delayAfterCombinedMethod = CombinedTask.combinedMethod(screenRange, keyword, folderPath, similarity, n, keyToPress);
                        LOGGER.info("ten25step3找最近的点");

                        Thread.sleep(c);
                        LOGGER.info("ten25step3开始进入step7");
                        localTenStep.set(7);
                    }
                    if (localTenStep.get() == 4) {
                        LOGGER.info("进入ten25step4");// 10次没采到
                        Rectangle screenRange = new Rectangle(1267, 12, 167, 167);
                        String keyword = "小地图奥德图标";
                        String folderPath = "D:/截图/正确截图";
                        int similarity = 95;
                        int n = 2; // 获取第二近的点
                        int keyToPress = KeyEvent.VK_3; // 按下并释放的键 (例如 6)
                        long delayAfterCombinedMethod = CombinedTask.combinedMethod(screenRange, keyword, folderPath, similarity, n, keyToPress);
                        LOGGER.info("ten25step4找第二近的点");

                        Thread.sleep(c);
                        localTenStep.set(7);

                    }
                    if (localTenStep.get() == 10) {
                        LOGGER.info("进入ten25step10");// 10次没采到
                        Rectangle screenRange = new Rectangle(1267, 12, 167, 167);
                        String keyword = "小地图奥德图标";
                        String folderPath = "D:/截图/正确截图";
                        int similarity = 95;
                        int n = 3; // 获取第三近的点
                        int keyToPress = KeyEvent.VK_3; // 按下并释放的键 (例如 6)
                        long delayAfterCombinedMethod = CombinedTask.combinedMethod(screenRange, keyword, folderPath, similarity, n, keyToPress);
                        LOGGER.info("ten25step10找第三近的点");

                        Thread.sleep(c);
                        localTenStep.set(7);

                    }
                    if (localTenStep.get() == 5) {

                        LOGGER.info("进入ten25step5");

                        Color color4 = robot1.getPixelColor(616, 661);
                        if (color4.getRed() > 210) {
                            System.out.println("Color at (616, 661): " + color4);
                            ten_3[0].setValue(1);
                            ten_4=0;
                            robot1.delay(500);
                            LOGGER.info("ten25step5成功率出现等待");


                        } else {
                            LOGGER.info("ten25step5成功率未出现按5");
                            robot1.delay(200);

                            robot1.keyPress(KeyEvent.VK_3);                //如果没采集
                            robot1.delay(c);
                            robot1.keyRelease(KeyEvent.VK_3);
                            boolean condition14 = ColorChecker.checkColorAndExecuteCommand(robot, 790, 309, 255, 234, 183,
                                    () -> {
                                    });//等级不够采不到

                            boolean condition15 = ColorChecker.checkColorAndExecuteCommand(robot, 750, 312, 255, 234, 183,
                                    () -> {
                                    });//等级不够采不到


                            Color color1 = robot1.getPixelColor(787, 309);//周围没有奥德
                            Color color2 = robot1.getPixelColor(770, 309);
                            if ((color1.getRed() > 251 & color2.getRed() > 251) || (condition14 && condition15)) {
                                LOGGER.info("ten2=23step5周围没有奥德出现去step3");
                                robot1.delay(c);
                                robot1.keyPress(KeyEvent.VK_A);
                                robot1.delay(c);
                                robot1.delay(1000);
                                robot1.keyRelease(KeyEvent.VK_A);
                                robot1.delay(2500);
                                localTenStep.set(3);
                                LOGGER.info("localTenStep.set(3) was executed");
                                continue;


                            }
                            boolean condition16 = ColorChecker.checkColorAndExecuteCommand(robot, 761, 307, 255, 234, 183,
                                    () -> {
                                    });//有其他人在采

                            boolean condition17 = ColorChecker.checkColorAndExecuteCommand(robot, 722, 312, 255, 234, 183,
                                    () -> {
                                    });//有其他人在采
                            if (condition16 & condition17) {
                                LOGGER.info("ten2=25step5周围有其他人在采去step4");
                                robot1.delay(c);
                                robot1.keyPress(KeyEvent.VK_A);
                                robot1.delay(c);
                                robot1.delay(1000);
                                robot1.keyRelease(KeyEvent.VK_A);
                                robot1.delay(2500);
                                localTenStep.set(4);
                                LOGGER.info("localTenStep.set(4) was executed");
                                continue;
                            }
                            boolean condition7 = ColorChecker.checkColorAndExecuteCommand(robot, 712, 310, 255, 234, 183,
                                    () -> {
                                    });
                            boolean condition8 = ColorChecker.checkColorAndExecuteCommand(robot, 685, 308, 255, 234, 183,
                                    () -> {
                                    });


                            if (condition7 & condition8) {
                                LOGGER.info("ten25step7无法使用的对象");
                                boolean condition9 = ColorChecker.checkColorAndExecuteCommand(robot, 424, 46, 203, 31, 30,
                                        () -> {
                                        });


                                if (condition9) {
                                    LOGGER.info("血条出现，开始点击并按esc3");
                                    robot.mouseMove(375 + (int) v1, 47 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                    robot.delay(20);
                                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                    robot.delay(50);
                                    robot1.keyPress(KeyEvent.VK_ESCAPE);
                                    robot1.delay(c);
                                    robot1.keyRelease(KeyEvent.VK_ESCAPE);
                                    robot1.delay(c);
                                    LOGGER.info("ten25怪物血条出现");
                                    robot1.keyPress(KeyEvent.VK_W);
                                    LOGGER.info("ten25按下W");
                                    robot1.keyPress(KeyEvent.VK_D);
                                    LOGGER.info("ten25按下D");
                                    robot1.delay(600);
                                    robot1.keyRelease(KeyEvent.VK_D);
                                    LOGGER.info("ten25释放D");
                                    robot1.delay((int) v7);
                                    robot1.keyPress(KeyEvent.VK_W);
                                    LOGGER.info("ten25怪物血条出现按键操作完成准备进入3循环");

                                    localTenStep.set(3);
                                    continue;

                                }}
                            robot1.delay(1000);
                            localTenStep.set(5);
                        }

                    }
                    if (localTenStep.get() == 6) {
                        LOGGER.info("血条出现，开始点击并按esc4");
                        robot.mouseMove(375 + (int) v1, 47 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                        robot.delay(20);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                        robot.delay(50);
                        robot1.keyPress(KeyEvent.VK_ESCAPE);
                        robot1.delay(c);
                        robot1.keyRelease(KeyEvent.VK_ESCAPE);
                        robot1.delay(c);
                        LOGGER.info("ten25怪物血条出现");
                        robot1.keyPress(KeyEvent.VK_W);
                        LOGGER.info("ten25按下W");
                        robot1.keyPress(KeyEvent.VK_D);
                        LOGGER.info("ten25按下D");
                        robot1.delay(600);
                        robot1.keyRelease(KeyEvent.VK_D);
                        LOGGER.info("ten25释放D");
                        robot1.delay((int) v7);
                        robot1.keyPress(KeyEvent.VK_W);
                        LOGGER.info("ten25怪物血条出现按键操作完成准备进入3循环");
                        localTenStep.set(3);
                        continue;

                    }
                    if (localTenStep.get() == 7) {
                        LOGGER.info("ten25step7进入循环");
                        robot1.delay(200);

                        robot1.keyPress(KeyEvent.VK_3);                //如果没采集
                        robot1.delay(c);
                        robot1.keyRelease(KeyEvent.VK_3);
                        robot1.delay(500);
                        LOGGER.info("ten25step7进入循环按3");


                        for (; ; ) {

                            if (localTenStep.get() != 7) {
                                break;
                            }


                            boolean condition32 = ColorChecker.checkColorAndExecuteCommand(robot, 433, 40, 41, 44, 52,
                                    () -> {
                                    });
                            boolean condition33 = ColorChecker.checkColorAndExecuteCommand(robot, 525, 40, 41, 45, 54,
                                    () -> {
                                    });
                            Color color4 = robot1.getPixelColor(433, 40);

                            System.out.println("Color at (433, 40): " + color4);
                            Color color101 = robot1.getPixelColor(525, 40);

                            System.out.println("Color at (525, 40): " + color101);
                            if (condition32 & condition33) {


                                localTenStep.set(6);
                                break ;
                            }
                            if (color1211.getRed() > 182 & color1211.getRed() < 190 & color1211.getGreen() < 191 & color1211.getGreen() > 183
                                    & color1211.getBlue() > 153 & color1211.getBlue() < 161 & color1221.getRed() > 209 & color1221.getRed() < 217 & color1221.getGreen() < 215 & color1221.getGreen() > 207
                                    & color1221.getBlue() > 169 & color1221.getBlue() < 177) {
                                LOGGER.info("ten25step7-1死亡复活提示出现");
                                robot.mouseMove(842 + (int) v1, 479 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                robot.delay(20);
                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                robot.delay(50);

                                LOGGER.info("开始进入ten25step8循环");
                                localTenStep.set(8);
                                break;
                            }


                            int[][] colors = {
                                    {787, 309, 255, 234, 183},//找不到奥德目标
                                    {770, 309, 255, 234, 183},
                                    {791, 309, 255, 234, 183},//等级不够采不到
                                    {706, 309, 255, 234, 183},
                                    {761, 307, 255, 234, 183},//其他人在采集
                                    {722, 312, 255, 234, 183},
                                    {712, 310, 255, 234, 183},
                                    {685, 308, 255, 234, 183},//无法使用的对象
                            };
                            int timeoutSeconds = 15;
                            int keyDelayMin = 2300;
                            int keyDelayMax = 3000;
                            AtomicBoolean stopChecking = new AtomicBoolean(false);
                            int color5X = 616;
                            int color5Y = 661;

                            CustomState customState = new CustomState();
                            double finalV = v2;
                            double finalV1 = v3;
                            double finalV2 = v7;
                            double finalV3 = v5;
                            double finalV4 = v10;
                            double finalV5 = v7;
                            Runnable commandA = () -> {
                                LOGGER.info("ten25step7周围没有可采奥德重复一次");
                                ten_3[0].increment();
                                ten_4=ten_4+1;
                                System.out.println("ten_4 has been reset to: " + ten_4);
                                System.out.println("ten_3 has been reset to: " + ten_3[0].getValue());
                                robot1.delay(c);
                                if (ten_4 == 1){
                                    LOGGER.info("ten25step7ten4=1准备进入ten25steap4");

                                    localTenStep.set(4);
                                    return;
                                }
                                if (ten_4 == 2){
                                    LOGGER.info("ten25step7ten4=2准备进入ten25steap10");

                                    localTenStep.set(10);
                                    return;
                                }
                                if (ten_4 == 3){
                                    LOGGER.info("ten25step7ten4=2准备进入ten25steap3");

                                    localTenStep.set(3);
                                    return;
                                }


                                Color color2 = robot1.getPixelColor(433, 40);

                                System.out.println("Color at (433, 40): " + color2);
                                Color color3 = robot1.getPixelColor(525, 40);

                                System.out.println("Color at (525, 40): " + color3);
                                if (condition30 & condition31) {
                                    LOGGER.info("血条出现，开始点击并按esc5");
                                    robot.mouseMove(375 + (int) v1, 47 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                    robot.delay(20);
                                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                    robot.delay(50);
                                    robot1.keyPress(KeyEvent.VK_ESCAPE);
                                    robot1.delay(c);
                                    robot1.keyRelease(KeyEvent.VK_ESCAPE);
                                    robot1.delay(c);
                                    LOGGER.info("ten25怪物血条出现");
                                    robot1.keyPress(KeyEvent.VK_W);
                                    LOGGER.info("ten25按下W");
                                    robot1.keyPress(KeyEvent.VK_D);
                                    LOGGER.info("ten25按下D");
                                    robot1.delay(600);
                                    robot1.keyRelease(KeyEvent.VK_D);
                                    LOGGER.info("ten25释放D");
                                    robot1.delay((int) finalV3);
                                    robot1.keyPress(KeyEvent.VK_W);
                                    LOGGER.info("ten25怪物血条出现按键操作完成准备进入3循环");

                                    localTenStep.set(3);
                                    return;
                                }
                                boolean condition7 = ColorChecker.checkColorAndExecuteCommand(robot, 712, 310, 255, 234, 183,
                                        () -> {
                                        });
                                boolean condition8 = ColorChecker.checkColorAndExecuteCommand(robot, 685, 308, 255, 234, 183,
                                        () -> {
                                        });


                                if (condition7 & condition8) {
                                    LOGGER.info("ten25step7无法使用的对象");
                                    boolean condition9 = ColorChecker.checkColorAndExecuteCommand(robot, 424, 46, 203, 31, 30,
                                            () -> {
                                            });


                                    if (condition9) {
                                        LOGGER.info("血条出现，开始点击并按esc6");
                                    robot.mouseMove(375 + (int) v1, 47 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                    robot.delay(20);
                                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                    robot.delay(50);
                                    robot1.keyPress(KeyEvent.VK_ESCAPE);
                                    robot1.delay(c);
                                    robot1.keyRelease(KeyEvent.VK_ESCAPE);
                                        robot1.delay(c);
                                        localTenStep.set(3);
                                        return;

                                }}

                                if (color1211.getRed() > 182 & color1211.getRed() < 190 & color1211.getGreen() < 191 & color1211.getGreen() > 183
                                        & color1211.getBlue() > 153 & color1211.getBlue() < 161 & color1221.getRed() > 209 & color1221.getRed() < 217 & color1221.getGreen() < 215 & color1221.getGreen() > 207
                                        & color1221.getBlue() > 169 & color1221.getBlue() < 177) {
                                    LOGGER.info("ten25step7-1死亡复活提示出现");
                                    robot.mouseMove(842 + (int) v1, 479 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                    robot.delay(20);
                                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                    robot.delay(50);

                                    LOGGER.info("开始进入ten25step8循环");
                                    localTenStep.set(8);
                                    return;
                                }


                                if (ten_3[0].getValue() % 3 == 0) {
                                    Runnable bCommand = () -> {
                                        while (!Thread.currentThread().isInterrupted()) {

                                            Color color23331 = robot1.getPixelColor(964, 849);
                                            Color color1991 = robot1.getPixelColor(1178, 831);

                                            if (color23331.getRed() > 200 & color1991.getGreen() < 60) {
                                                LOGGER.info("ten25判断可以吃药和恢复飞行技能");
                                                robot1.delay(c);//按住一秒1秒后
                                                robot1.keyPress(KeyEvent.VK_EQUALS);//按住enter
                                                robot1.delay(c);//按住一秒1秒后
                                                robot1.keyRelease(KeyEvent.VK_EQUALS);

                                                LOGGER.info("点击=和0吃药和恢复飞行技能");

                                            }
                                            Color color212 = robot1.getPixelColor(885, 848);

                                            if (color212.getRed() > 80 ) {
                                                LOGGER.info("ten25判断可以恢复飞行技能");

                                                robot1.keyPress(KeyEvent.VK_0);
                                                robot1.delay(c);//按住一秒1秒后
                                                robot1.keyRelease(KeyEvent.VK_0);

                                            }
                                            Color color2101 = robot1.getPixelColor(1155, 826);
                                            if (color2101.getGreen() < 30) {
                                                LOGGER.info("判断1ten25step7没有飞行时间准备进入ten_step = 2");
                                                localTenStep.set(2);
                                                break;
                                            }
                                            boolean condition22 = ColorChecker.checkColorAndExecuteCommand(robot, 1388, 190, 214, 212, 174,
                                                    () -> {});//难民村的村1

                                            boolean condition23 = ColorChecker.checkColorAndExecuteCommand(robot, 1382, 190, 215, 213, 175,
                                                    () -> {});//难民村的村2

                                            if (condition22 && condition23) {
                                                LOGGER.info("ten25step7ten_3[0].getValue() == 3确定位置在难民村准备进入step1");
                                                localTenStep.set(8);
                                                break;
                                            }
                                            if (color1211.getRed() > 182 & color1211.getRed() < 190 & color1211.getGreen() < 191 & color1211.getGreen() > 183
                                                    & color1211.getBlue() > 153 & color1211.getBlue() < 161 & color1221.getRed() > 209 & color1221.getRed() < 217 & color1221.getGreen() < 215 & color1221.getGreen() > 207
                                                    & color1221.getBlue() > 169 & color1221.getBlue() < 177) {
                                                LOGGER.info("ten25step7-2死亡复活提示出现");
                                                robot.mouseMove(842 + (int) v1, 479 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                                robot.delay(20);
                                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                                robot.delay(50);

                                                LOGGER.info("开始进入ten25step8循环");
                                                localTenStep.set(8);
                                                break;
                                            }

                                            try {
                                                Thread.sleep(1000);
                                            } catch (InterruptedException e) {
                                                Thread.currentThread().interrupt();
                                            }
                                        }
                                    };

// 创建并启动B命令线
                                    Thread bCommandThread = new Thread(bCommand);
                                    bCommandThread.start();

                                    if (ten_3[0].getValue() < 21) {

                                        System.out.println("2执行 D命令，ten_3 = " + ten_3[0].getValue());
// 执行A命令的代码
                                        robot1.keyPress(KeyEvent.VK_W);
                                        LOGGER.info("ten25step7ten_3[0].getValue() <= 15按下W");
                                        robot1.keyPress(KeyEvent.VK_D);
                                        LOGGER.info("ten25step7ten_3[0].getValue() <= 15按下D");
                                        robot1.delay(500);
                                        robot1.keyRelease(KeyEvent.VK_D);
                                        LOGGER.info("ten25step7ten_3[0].getValue() <= 15释放D");
                                        robot1.delay((int) finalV3);
                                        robot1.keyPress(KeyEvent.VK_W);
                                        LOGGER.info("ten25step7ten_3[0].getValue() <= 15释放W");
                                        robot1.delay(100);


                                        bCommandThread.interrupt();
                                        System.out.println("Before setting ten_step to 3");
                                        localTenStep.set(3);
                                        return;
// A命令执行完毕后，终止B命令线程

                                    }
                                    // 在外部定义一个计数器
                                    // 在外部定义一个 AtomicBoolean


// 当 ten_3[0].getValue() == 9 时
                                    if (ten_3[0].getValue() == 21) {
                                        counter++;

                                        // 根据 alternate 的值判断执行第一种操作或第二种操作
                                        if (counter % 2 != 0) {
                                            // 第一次和第三次执行的操作
                                            robot1.keyPress(KeyEvent.VK_R);
                                            LOGGER.info("Executing operation 1 (first and third time)");
                                            robot1.delay((int) finalV3);
                                            robot1.keyRelease(KeyEvent.VK_R);
                                            LOGGER.info("Operation 1 complete");
                                            localTenStep.set(3);
                                        } else {
                                            // 第二次执行的操作
                                            robot1.keyPress(KeyEvent.VK_F);
                                            LOGGER.info("Executing operation 2 (second time)");
                                            robot1.delay((int) finalV3);
                                            robot1.keyRelease(KeyEvent.VK_F);
                                            LOGGER.info("Operation 2 complete");
                                            localTenStep.set(3);
                                        }

                                        return;
                                    }
                                    if (ten_3[0].getValue() >= 24 && ten_3[0].getValue() <= 33) {

                                        System.out.println("2执行 D命令，ten_3 = " + ten_3[0].getValue());
// 执行A命令的代码
                                        robot1.keyPress(KeyEvent.VK_W);
                                        LOGGER.info("ten25step7ten_3[0].getValue() <= 15按下W");
                                        robot1.keyPress(KeyEvent.VK_D);
                                        LOGGER.info("ten25step7ten_3[0].getValue() <= 15按下D");
                                        robot1.delay(500);
                                        robot1.keyRelease(KeyEvent.VK_D);
                                        LOGGER.info("ten25step7ten_3[0].getValue() <= 15释放D");
                                        robot1.delay((int) finalV3);
                                        robot1.keyPress(KeyEvent.VK_W);
                                        LOGGER.info("ten25step7ten_3[0].getValue() <= 15释放W");
                                        robot1.delay(100);


                                        bCommandThread.interrupt();
                                        System.out.println("Before setting ten_step to 3");
                                        localTenStep.set(3);
                                        return;
// A命令执行完毕后，终止B命令线程

                                    }
                                    if (ten_3[0].getValue() >= 36) {
                                        counter++;

                                        // 根据 alternate 的值判断执行第一种操作或第二种操作
                                        if (counter % 2 != 0) {
                                            // 第一次和第三次执行的操作
                                            robot1.keyPress(KeyEvent.VK_R);
                                            LOGGER.info("Executing operation 1 (first and third time)");
                                            robot1.delay((int) finalV3);
                                            robot1.keyRelease(KeyEvent.VK_R);
                                            LOGGER.info("Operation 1 complete");
                                            localTenStep.set(3);
                                        } else {
                                            // 第二次执行的操作
                                            robot1.keyPress(KeyEvent.VK_F);
                                            LOGGER.info("Executing operation 2 (second time)");
                                            robot1.delay((int) finalV3);
                                            robot1.keyRelease(KeyEvent.VK_F);
                                            LOGGER.info("Operation 2 complete");
                                            localTenStep.set(3);
                                        }

                                        return;

                                    }
                                    if (ten_3[0].getValue() >= 39 && ten_3[0].getValue() <= 54) {


                                        System.out.println("ten252执行 A 命令，ten_3 = " + ten_3[0].getValue());
                                        robot1.keyPress(KeyEvent.VK_W);
                                        LOGGER.info("ten25step7ten_3[0].getValue() >= 15 && ten_3[0].getValue() <= 30按下W");
                                        robot1.keyPress(KeyEvent.VK_A);
                                        LOGGER.info("ten25step7ten_3[0].getValue() >= 15 && ten_3[0].getValue() <= 30按下A");
                                        robot1.delay(500);
                                        robot1.keyRelease(KeyEvent.VK_A);
                                        LOGGER.info("ten25step7ten_3[0].getValue() >= 15 && ten_3[0].getValue() <= 30释放A");
                                        robot1.delay((int) finalV2);
                                        robot1.keyPress(KeyEvent.VK_W);
                                        LOGGER.info("ten25step7ten_3[0].getValue() >= 15 && ten_3[0].getValue() <= 30释放W");
                                        robot1.delay(100);
                                        LOGGER.info("2开始进入ten25step3");
                                        localTenStep.set(3);
                                        return;

                                    }

                                    if (ten_3[0].getValue() >= 57) {                         // 33次没采到
                                        System.out.println("ten25step7周围没有奥德准备摔死，ten_3 = " + ten_3[0].getValue());
                                        robot1.keyPress(KeyEvent.VK_R);                //如果没采集
                                        robot1.delay(10000);
                                        robot1.keyRelease(KeyEvent.VK_R);
                                        robot1.delay(100);
                                        robot.mouseMove(1160 + (int) v1, 850 + (int) v1); //
                                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                        robot.delay(50);
                                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键

                                        ten_3[0].setValue(1);
                                        robot1.delay(20000);


                                        boolean condition3;
                                        boolean condition4;
                                        boolean condition9;
                                        boolean condition10;

                                        while (true) {
                                            // 获取颜色值
                                            Color color29 = robot1.getPixelColor(625, 705);
                                            Color color31 = robot1.getPixelColor(813, 705);
                                            Color color28 = robot1.getPixelColor(1196, 111);
                                            Color color30 = robot1.getPixelColor(1193, 114);

                                            System.out.println("3Color at (625, 705): " + color29);
                                            System.out.println("3Color at (813, 705): " + color31);
                                            System.out.println("3Color at (1196, 111): " + color28);
                                            System.out.println("3Color at (1193, 114): " + color30);


                                            // 检查条件
                                            condition3 = (color29.getRed() >= 23 - 4 && color29.getRed() <= 23 + 4) &&
                                                    (color29.getGreen() >= 30 - 4 && color29.getGreen() <= 30 + 4) &&
                                                    (color29.getBlue() >= 41 - 4 && color29.getBlue() <= 41 + 4);

                                            condition4 = (color31.getRed() >= 23 - 4 && color31.getRed() <= 23 + 4) &&
                                                    (color31.getGreen() >= 30 - 4 && color31.getGreen() <= 30 + 4) &&
                                                    (color31.getBlue() >= 41 - 4 && color31.getBlue() <= 41 + 4);

                                            condition9 = (color28.getRed() >= 249 - 4 && color28.getRed() <= 249 + 4) &&
                                                    (color28.getGreen() >= 244 - 4 && color28.getGreen() <= 244 + 4) &&
                                                    (color28.getBlue() >= 202 - 4 && color28.getBlue() <= 202 + 4);

                                            condition10 = (color30.getRed() >= 21 - 4 && color30.getRed() <= 21 + 4) &&
                                                    (color30.getGreen() >= 34 - 4 && color30.getGreen() <= 34 + 4) &&
                                                    (color30.getBlue() >= 42 - 4 && color30.getBlue() <= 42 + 4);

                                            // 如果满足条件，则跳出循环
                                            if ((condition3 && condition4) || (condition9 && condition10)) {
                                                break;
                                            }
                                            LOGGER.info("ten25stepten3=33条件不满足点89");

                                            // 如果条件不满足，继续执行循环中的其他操作
                                            int delayBetweenKeyPresses = 100 + random.nextInt(301);
                                            int delayBetweenKeyPresses1 = 500 + random.nextInt(500);
                                            int delayBetweenKeyPresses2 = 500 + random.nextInt(100);
                                            robot.keyPress(KeyEvent.VK_8);
                                            robot.delay(delayBetweenKeyPresses); // 延迟，以确保按键被识别
                                            robot.keyRelease(KeyEvent.VK_8);

                                            // 生成 100-400 毫秒的随机延迟

                                            robot.delay(delayBetweenKeyPresses1);

                                            // 模拟按下键 9
                                            robot.keyPress(KeyEvent.VK_9);
                                            robot.delay(delayBetweenKeyPresses);// 延迟，以确保按键被识别
                                            robot.keyRelease(KeyEvent.VK_9);
                                            robot.delay(delayBetweenKeyPresses2);

                                            // 休眠 300 毫秒
                                            try {
                                                Thread.sleep(300);
                                            } catch (InterruptedException e) {
                                                Thread.currentThread().interrupt();
                                            }
                                        }
                                        robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                                        robot.delay(50);
                                        robot.keyRelease(KeyEvent.VK_E);
                                        robot.delay(50);
                                        robot.keyRelease(KeyEvent.VK_Q);
                                        robot.delay(50);//按住延迟
                                        robot.keyRelease(KeyEvent.VK_D);
                                        robot.delay(50);//按住延迟
                                        robot.keyRelease(KeyEvent.VK_A);//释放键盘按键
                                        LOGGER.info("ten25step7ten_3[0].getValue() == 9点9回城条出现释放WADQE等待25秒");
                                        robot.delay(25000);
                                        LOGGER.info("ten25step7ten_3[0].getValue() == 9点9回城条出现释放WADQE等待25秒完毕");


                                    }


                                }
                                robot1.delay(c);
                                LOGGER.info("ten25step7ten4>2准备进入ten25steap4");

                                localTenStep.set(4);
                                return;


                            };
                            Optional<Runnable> commandB = Optional.empty();

                            Supplier<Boolean> stopCondition = () -> {
                                try {
                                    Robot robot2 = new Robot();
                                    Color color5 = robot2.getPixelColor(color5X, color5Y);

                                    Color color121 = robot1.getPixelColor(553, 380);

                                    Color color122 = robot1.getPixelColor(562, 381);

                                    Color color8 = robot2.getPixelColor(1196, 111);

                                    Color color9 = robot2.getPixelColor(1193, 114);

                                    Color color10 = robot2.getPixelColor(625, 705);

                                    Color color11 = robot2.getPixelColor(813, 705);


                                    boolean condition1 = color5.getRed() > 210;//成功率出现

                                    boolean condition8 = color8.getRed() > 245 & color8.getRed() < 253 & color8.getGreen() < 248 & color8.getGreen() > 240
                                            & color8.getBlue() > 198 & color8.getBlue() < 206;

                                    boolean condition9 = color9.getRed() > 17 & color9.getRed() < 25 & color9.getGreen() < 38 & color9.getGreen() > 30
                                            & color9.getBlue() > 38 & color9.getBlue() < 46;//摔死虚弱出现
                                    boolean condition3 = color121.getRed() > 182 & color121.getRed() < 190 & color121.getGreen() < 191 & color121.getGreen() > 183
                                            & color121.getBlue() > 153 & color121.getBlue() < 161;
                                    boolean condition4 = color122.getRed() > 209 & color122.getRed() < 217 & color122.getGreen() < 215 & color122.getGreen() > 207
                                            & color122.getBlue() > 169 & color122.getBlue() < 177;//死亡复活提示出现
                                    boolean condition10 = color10.getRed() > 19 & color10.getRed() < 27 & color10.getGreen() < 34 & color10.getGreen() > 26
                                            & color10.getBlue() > 37 & color10.getBlue() < 45;
                                    boolean condition11 = color11.getRed() > 19 & color11.getRed() < 27 & color11.getGreen() < 34 & color11.getGreen() > 26
                                            & color11.getBlue() > 37 & color11.getBlue() < 45;//紧急返回提示出现

                                    return condition1 || condition8 & condition9 || condition3 & condition4 || condition10 & condition11;
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                    return true;
                                }
                            };
                            ColorChecker3.checkColorAndExecuteCommandWithTimeout(customState, colors, timeoutSeconds, keyDelayMin, keyDelayMax,
                                    commandA, commandB, stopChecking, stopCondition, KeyEvent.VK_3);

                            boolean condition18 = ColorChecker.checkColorAndExecuteCommand(robot, 620, 662, 214, 212, 173,
                                    () -> {
                                    });//有其他人在采

                            boolean condition19 = ColorChecker.checkColorAndExecuteCommand(robot, 630, 674, 215, 213, 174,
                                    () -> {
                                    });//有其他人在采

                            Color color5 = robot1.getPixelColor(616, 661);
                            Color color6 = robot1.getPixelColor(620, 662);
                            Color color7 = robot1.getPixelColor(630, 674);


                            if (color5.getRed() > 210 & condition18 && condition19) {

                                LOGGER.info("ten25step7成功率出现进入step5");
                                ten_3[0].setValue(1);
                                System.out.println("ten_3 has been reset to: " + ten_3[0].getValue());
                                stopChecking.set(true);
                                localTenStep.set(5);
                                break;

                            }
                            Color color2101 = robot1.getPixelColor(1159, 825);
                            if (color2101.getGreen() < 30) {
                                LOGGER.info("判断2ten25step7没有飞行时间准备进入ten_step = 2");

                                localTenStep.set(2);
                                break;
                            }

                            boolean condition8 = ColorChecker.checkColorAndExecuteCommand(robot, 1196, 111, 249, 244, 202,
                                    () -> {
                                    });
                            boolean condition9 = ColorChecker.checkColorAndExecuteCommand(robot, 1193, 114, 21, 34, 42,
                                    () -> {
                                    });
                            Color color8 = robot.getPixelColor(1196, 111);

                            Color color9 = robot.getPixelColor(1193, 114);


                            if (condition8 & condition9) {
                                LOGGER.info("判断ten25step7虚弱出现疑似摔死");
                                robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_E);
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_Q);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_D);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_A);//释放键盘按键

                                LOGGER.info("开始进入ten25step1循环");
                                localTenStep.set(1);
                                break;
                            }



                            if (condition30 & condition31) {
                                LOGGER.info("血条出现，开始点击并按esc7");
                                robot.mouseMove(375 + (int) v1, 47 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                robot.delay(20);
                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                robot.delay(50);
                                robot1.keyPress(KeyEvent.VK_ESCAPE);
                                robot1.delay(c);
                                robot1.keyRelease(KeyEvent.VK_ESCAPE);
                                robot1.delay(c);
                                LOGGER.info("ten25怪物血条出现");
                                robot1.keyPress(KeyEvent.VK_W);
                                LOGGER.info("ten25按下W");
                                robot1.keyPress(KeyEvent.VK_D);
                                LOGGER.info("ten25按下D");
                                robot1.delay(600);
                                robot1.keyRelease(KeyEvent.VK_D);
                                LOGGER.info("ten25释放D");
                                robot1.delay((int) v7);
                                robot1.keyPress(KeyEvent.VK_W);
                                LOGGER.info("ten25怪物血条出现按键操作完成准备进入3循环");

                                localTenStep.set(3);
                                break ;
                            }

                            Color color121 = robot1.getPixelColor(553, 380);

                            Color color122 = robot1.getPixelColor(562, 381);

                            if (color121.getRed() > 182 & color121.getRed() < 190 & color121.getGreen() < 191 & color121.getGreen() > 183
                                    & color121.getBlue() > 153 & color121.getBlue() < 161 & color122.getRed() > 209 & color122.getRed() < 217 & color122.getGreen() < 215 & color122.getGreen() > 207
                                    & color122.getBlue() > 169 & color122.getBlue() < 177) {
                                LOGGER.info("ten25step7死亡复活提示出现释放WADQE");
                                robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_E);
                                robot.delay(50);
                                robot.keyRelease(KeyEvent.VK_Q);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_D);
                                robot.delay(50);//按住延迟
                                robot.keyRelease(KeyEvent.VK_A);
                                robot.delay(50);
                                robot.mouseMove(842 + (int) v1, 479 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                robot.delay(20);
                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                robot.delay(50);
                                LOGGER.info("点击死亡确认并开始进入ten_step =1");
                                LOGGER.info("开始进入ten25step1循环");
                                localTenStep.set(1);
                                break;
                            }
                            boolean condition3 = ColorChecker.checkColorAndExecuteCommand(robot, 625, 705, 23, 30, 41,
                                    () -> {
                                    });

                            boolean condition4 = ColorChecker.checkColorAndExecuteCommand(robot, 813, 705, 23, 30, 41,
                                    () -> {
                                    });
                            boolean condition102 = ColorChecker.checkColorAndExecuteCommand(robot, 631, 695, 12, 16, 19,
                                    () -> {
                                    });
                            Color color123 = robot1.getPixelColor(625, 705);

                            Color color124 = robot1.getPixelColor(813, 705);

                            Color color125 = robot1.getPixelColor(631, 695);


                            if (condition3 && condition4 & condition102) {
                                LOGGER.info("ten25step7点9回城条出现");

                                for (; ; ) {
                                    LOGGER.info("ten25step7点9回城条出现进入for循环");
                                    boolean condition22 = ColorChecker.checkColorAndExecuteCommand(robot, 1388, 190, 214, 212, 174,
                                            () -> {});//难民村的村1

                                    boolean condition23 = ColorChecker.checkColorAndExecuteCommand(robot, 1382, 190, 215, 213, 175,
                                            () -> {});//难民村的村2

                                    if (condition22 && condition23) {
                                        LOGGER.info("ten25step7点9确定在难民村回城处准备进入ten_step =8");
                                        robot.keyRelease(KeyEvent.VK_W);
                                        localTenStep.set(8);
                                        break;
                                    } else {
                                        robot.keyRelease(KeyEvent.VK_W);
                                        robot.delay(50);
                                        LOGGER.info("ten25step7点9确定不在难民村回城处准备开始点8和9");
                                        int delayBetweenKeyPresses = 100 + random.nextInt(301);
                                        int delayBetweenKeyPresses1 = 500 + random.nextInt(500);
                                        int delayBetweenKeyPresses2 = 500 + random.nextInt(100);
                                        robot.keyPress(KeyEvent.VK_8);
                                        robot.delay(delayBetweenKeyPresses); // 延迟，以确保按键被识别
                                        robot.keyRelease(KeyEvent.VK_8);

                                        // 生成 100-400 毫秒的随机延迟

                                        robot.delay(delayBetweenKeyPresses1);

                                        // 模拟按下键 9
                                        robot.keyPress(KeyEvent.VK_9);
                                        robot.delay(delayBetweenKeyPresses);// 延迟，以确保按键被识别
                                        robot.keyRelease(KeyEvent.VK_9);
                                        robot.delay(delayBetweenKeyPresses2);
                                    }
                                }
                            }
                        }
                    }
                    if (localTenStep.get() == 8) {

                        LOGGER.info("进入ten25step8准备释放weqda");
                        robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                        robot.delay(50);
                        robot.keyRelease(KeyEvent.VK_E);
                        robot.delay(50);
                        robot.keyRelease(KeyEvent.VK_Q);
                        robot.delay(50);//按住延迟
                        robot.keyRelease(KeyEvent.VK_D);
                        robot.delay(50);//按住延迟
                        robot.keyRelease(KeyEvent.VK_A);
                        for (; ; ) {
                            LOGGER.info("进入ten25step8for循环");
                            Color color121 = robot1.getPixelColor(553, 380);
                            Color color122 = robot1.getPixelColor(562, 381);
                            if (color121.getRed() > 182 & color121.getRed() < 190 & color121.getGreen() < 191 & color121.getGreen() > 183
                                    & color121.getBlue() > 153 & color121.getBlue() < 161 & color122.getRed() > 209 & color122.getRed() < 217 & color122.getGreen() < 215 & color122.getGreen() > 207
                                    & color122.getBlue() > 169 & color122.getBlue() < 177) {
                                LOGGER.info("ten25step8死亡复活提示出现");
                                robot.mouseMove(842 + (int) v1, 479 + (int) v1); // 鼠标移动到xx坐标轴  点击环境设置
                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                robot.delay(20);
                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                robot.delay(50);

                                LOGGER.info("开始进入ten25step1循环");
                                localTenStep.set(1);
                                break;
                            }
                            boolean condition9 = ColorChecker.checkColorAndExecuteCommand(robot, 1388, 190, 214, 212, 174,
                                    () -> {});//难民村的村1

                            boolean condition10 = ColorChecker.checkColorAndExecuteCommand(robot, 1382, 190, 215, 213, 175,
                                    () -> {});//难民村的村2

                            if (condition9 && condition10)  {
                                LOGGER.info("开始进入ten25step1循环");
                                localTenStep.set(1);
                                break;
                            }


                        }
                    }

                    LOGGER.info("在循环重新开始之前，localTenStep的值为：" + localTenStep.get());


                }
            }//在贝鲁斯兰难民村开始采集，300~400升级，400级之后进入5循环


            if (ten_1 == 20) {
                LOGGER.info("进入20循环");
                Color color2 = robot1.getPixelColor(1163, 843);
                if (color2.getRed() > 239){
                    LOGGER.info("检测在飞行中");

                robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                robot.delay(50);
                robot.keyRelease(KeyEvent.VK_E);
                robot.delay(50);
                robot.keyRelease(KeyEvent.VK_Q);
                robot.delay(50);//按住延迟
                robot.keyRelease(KeyEvent.VK_D);
                robot.delay(50);//按住延迟
                robot.keyRelease(KeyEvent.VK_A);
                LOGGER.info("释放WEQDA并开始下降15秒");
                robot.keyPress(KeyEvent.VK_F);//按下键盘按键 下降
                robot.delay(18000);//按住延迟
                robot.keyRelease(KeyEvent.VK_F); //释放键盘按键
                Thread.sleep(200); //延迟
                LOGGER.info("开始关翅膀");
                    robot.mouseMove(1160 + (int) v1, 850 + (int) v1);
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                    robot.delay((int) v);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键

                }

                robot.delay(1000);
                LOGGER.info("鼠标点A+=吃卷轴回城");
                robot.mouseMove(967 + (int) v1, 816 + (int) v1);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                robot.delay((int) v);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                //释放键盘按键
                Thread.sleep(15000);
                for(;;){
                    LOGGER.info("进入ten20for循环");
                    Color color1 = robot1.getPixelColor(516, 836);
                    Color color19 = robot1.getPixelColor(575, 838);       //判断游戏画面点1出现(游戏是否在线)
                    if (color1.getRed() > 58&color1.getRed() < 75&color1.getGreen() > 69&color1.getGreen() <85&color1.getBlue() > 98
                            &color1.getBlue() < 111&color19.getRed() > 53&color19.getRed() < 63&color19.getGreen() > 61&color19.getGreen() <72
                            &color19.getBlue() > 91 &color19.getBlue() < 99) {
                        LOGGER.info("ten20检测游戏画面出现准备进入ten7step1");
                        ten_step=1;

                        if (ten_step == 1){
                            LOGGER.info("进入ten20step1");
                            Color color11 = robot1.getPixelColor(368, 434);  //判断v挡板位置正确

                            Color color10 = robot1.getPixelColor(11, 615); //

                            if (color11.getRed() == 255 & color10.getRed() > 137){
                                LOGGER.info("ten20step1判断V挡板小地图正确");
                                Color color21 = robot1.getPixelColor(1255, 214);
                                if ( color21.getRed() == 185){
                                    LOGGER.info("ten20step1检测K出现准备进入5循环");
                                    ten_1=5;
                                    continue outerLoop5;



                                }else{
                                    LOGGER.info("ten20step1检测K没出现点K");
                                    KeyUtil.pressKey(robot, KeyEvent.VK_K, -1);

                                }

                            }else {
                                LOGGER.info("ten20step1检测VN没出现调整画面");
                                Thread.sleep(200);

                                KeyUtil.pressKey(robot, KeyEvent.VK_V, -1);
                                KeyUtil.pressKey(robot, KeyEvent.VK_N, -1);
                                KeyUtil.pressKey(robot, KeyEvent.VK_N, -1);
                                KeyUtil.pressKey(robot, KeyEvent.VK_N, -1);
                                LOGGER.info("ten20step1调整好画面设置");
                                Thread.sleep(1000);
                            }


                        }}

            }}//接奥德满足升级后下降关翅膀点去伏魔殿并检查游戏画面是否正常进入5循环
            if (ten_1 == 5) {

                LOGGER.info("进入5循环");

                        for(;;){
                            boolean condition5 = ColorChecker.checkColorAndExecuteCommand(robot, 1196, 111, 249, 244, 202,
                                    () -> {});
                            boolean condition6 = ColorChecker.checkColorAndExecuteCommand(robot, 1193, 114, 21, 34, 42,
                                    () -> {});


                            if (condition5&condition6) {
                                LOGGER.info("判断虚弱");
                                Thread.sleep(24000); //延迟
                                }

                        robot1.keyPress(KeyEvent.VK_W);//往前走
                        LOGGER.info("往前走");
                        Thread.sleep(100);
                        Color color32 = robot1.getPixelColor(180, 731); // 转向
                            System.out.println("Color at (180, 731): " + color32);
                            if (color32.getRed() > 135) {
                                LOGGER.info("开始进入5-step1");
                                ten_step = 1;
                                break;

                            }}
                outerLoop:
                        for(;;){
                            if (ten_step == 1){
                                LOGGER.info("进入5-step1");


                            // Set the Y1 coordinate


                            AngleCalculatorTask task = new AngleCalculatorTask(robot, 148, 745);
                            Thread.sleep(100);

                            LOGGER.info("5-1");

                            task.run();


                                Color color29 = robot1.getPixelColor(111, 832); // 转向
                            if (color29.getRed() > 138) {
                                LOGGER.info("判断出5-1-29按Q");
                                KeyUtil.pressKey(robot, KeyEvent.VK_Q, -1);
                                Thread.sleep(100);

                            }
                            Color color28 = robot1.getPixelColor(185, 828); // 转向
                            if (color28.getRed() > 131) {
                                LOGGER.info("判断出5-1-28按E");
                                KeyUtil.pressKey(robot, KeyEvent.VK_E, -1);
                                Thread.sleep(100);

                            }


                            Color color333 = robot1.getPixelColor(252, 709); // 转向
                            System.out.println("Color at (252,709): " + color333);
                            if (color333.getRed() > 143) {


                                LOGGER.info("判断转向点5-2");

                            ten_step = 2;


                            }}
                            if (ten_step == 2){
                                LOGGER.info("进入5-step2");

                                //Timer timer1 = new Timer();


                                AngleCalculatorTask task1 = new AngleCalculatorTask(robot, 148, 745);
                                task1.run();

                                LOGGER.info("5-2");

                                // Schedule the task to n every 3 seconds
                                // timer1.schedule(task1, 100, 4 * 1000);
                                Color color27 = robot1.getPixelColor(105, 784); // 转向
                                if (color27.getRed() > 129&color27.getRed() < 137&color27.getGreen() > 83&color27.getGreen() < 90
                                &color27.getBlue() > 103&color27.getBlue() < 111) {
                                    LOGGER.info("判断出5-2-29按e");
                                    KeyUtil.pressKey(robot, KeyEvent.VK_Q, -1);
                                    Thread.sleep(100);

                                }
                                Color color26 = robot1.getPixelColor(184, 774); // 转向
                                if (color26.getRed() > 132&color26.getRed() < 140&color26.getGreen() > 86&color26.getGreen() < 94
                                        &color26.getBlue() > 106&color26.getBlue() < 114) {
                                    LOGGER.info("判断出5-2-28按q");
                                    KeyUtil.pressKey(robot, KeyEvent.VK_E, -1);
                                    Thread.sleep(100);

                                }
                                Thread.sleep(100);

                                ColorChecker.checkColorAndExecuteCommandWithTimeout(252, 786, 147, 116, 79, 30,
                                        500, KeyEvent.VK_E, KeyEvent.VK_SPACE);
                                Color color33 = robot1.getPixelColor(252, 786); // 转向
                                if (color33.getGreen() > 111&color33.getGreen() < 119
                                        &color33.getBlue() > 75&color33.getBlue() < 83) {
                                    System.out.println("Color at (210,655): " + color33);

                                    LOGGER.info("判断转向点5-3");
                                    KeyUtil.pressKey(robot, KeyEvent.VK_E, -1);
                                    KeyUtil.pressKey(robot, KeyEvent.VK_E, -1);
                                    KeyUtil.pressKey(robot, KeyEvent.VK_E, -1);


                                    ten_step = 3;







                                }}
                            if (ten_step == 3){
                                LOGGER.info("进入5-step3");

                                //Timer timer1 = new Timer();


                                AngleCalculatorTask task1 = new AngleCalculatorTask(robot, 148, 744);
                                task1.run();

                                LOGGER.info("5-3");

                                // Schedule the task to n every 3 seconds
                               // timer1.schedule(task1, 100, 4 * 1000);
                                Color color27 = robot1.getPixelColor(215, 758); // 转向
                                if (color27.getRed() > 143&color27.getRed() < 151&color27.getGreen() > 112&color27.getGreen() < 120
                                        &color27.getBlue() > 75&color27.getBlue() < 83) {
                                    LOGGER.info("判断出5-3-27按e");
                                    KeyUtil.pressKey(robot, KeyEvent.VK_E, -1);
                                    Thread.sleep(100);

                                }
                                Color color26 = robot1.getPixelColor(166, 756); // 转向
                                if (color26.getRed() > 142&color26.getRed() < 150&color26.getGreen() > 111&color26.getGreen() < 119
                                        &color26.getBlue() > 74&color26.getBlue() < 82) {
                                    LOGGER.info("判断出5-3-26按q");
                                    KeyUtil.pressKey(robot, KeyEvent.VK_Q, -1);
                                    Thread.sleep(100);

                                }
                                Thread.sleep(100);
                                Color color31 = robot1.getPixelColor(119, 674); // 转向
                                if (color31.getGreen() > 109&color31.getGreen() < 117
                                        &color31.getBlue() > 77&color31.getBlue() < 85) {
                                    System.out.println("Color at (119,674): " + color31);

                                    LOGGER.info("判断转向点5-4");

                                    ten_step = 4;
                                    //timer1.cancel();}
                                Thread.sleep(50);


                            }}
                            if (ten_step == 4){
                                LOGGER.info("进入5-step4");

                                //Timer timer1 = new Timer();


                                AngleCalculatorTask task1 = new AngleCalculatorTask(robot, 154, 749);
                                task1.run();

                                LOGGER.info("5-4");
                                boolean condition3 = ColorChecker.checkColorAndExecuteCommand(robot, 176, 688, 97, 132, 71,
                                        () -> {});
                                if (condition3 ) {
                                    LOGGER.info("判断出5-4-3按q");
                                    robot1.keyPress(KeyEvent.VK_Q);
                                    robot1.delay(500);
                                    robot1.keyRelease(KeyEvent.VK_Q);

                                }

                                // Schedule the task to n every 3 seconds
                                // timer1.schedule(task1, 100, 4 * 1000);
                                boolean condition2 = ColorChecker.checkColorAndExecuteCommand(robot, 223, 875, 151, 120, 76,
                                        () -> {});
                                if (condition2 ) {
                                    LOGGER.info("判断出5-4-2按e");
                                    KeyUtil.pressKey(robot, KeyEvent.VK_E, -1);
                                }
                                boolean condition1 = ColorChecker.checkColorAndExecuteCommand(robot, 248, 688, 96, 133, 72,
                                        () -> {});
                                if (condition1 ) {
                                    LOGGER.info("判断出5-4-1按q");
                                    KeyUtil.pressKey(robot, KeyEvent.VK_Q, -1);
                                }
                                Color color26 = robot1.getPixelColor(226, 674); // 转向
                                if (color26.getRed() < 100&color26.getBlue() < 80&color26.getGreen() > 130) {
                                    LOGGER.info("判断出5-4-28按q");
                                    KeyUtil.pressKey(robot, KeyEvent.VK_Q, -1);


                                }
                                Thread.sleep(100);
                                ColorChecker.checkColorAndExecuteCommandWithTimeout(29, 695, 142, 113, 77, 30,
                                        500, KeyEvent.VK_Q);
                                Color color31 = robot1.getPixelColor(110, 726); // 转向
                                if (color31.getRed() < 101&color31.getBlue() < 80&color31.getGreen() > 128) {
                                    LOGGER.info("判断转向点5-4");

                                    ten_step = 5;
                                    //timer1.cancel();

                                }
                                }
                            if (ten_step == 5){
                                LOGGER.info("进入step5");
                                AngleCalculatorTask task2 = new AngleCalculatorTask(robot, 152, 758);
                                task2.run();

                                Color color33 = robot1.getPixelColor(35, 666); // 转向
                                if (color33.getRed() > 140&color33.getRed() < 148&color33.getGreen() > 131&color33.getGreen() < 139
                                        &color33.getBlue() > 109&color33.getBlue() < 117) {
                                    robot1.keyRelease(KeyEvent.VK_W);
                                    LOGGER.info("停止行进");
                                    Thread.sleep(1000); //延迟
                                    BufferedImage targetImage10 = ImageIO.read(new File("D:/截图/正确截图/采集制作.png"));
                                    Rectangle searchArea10 = new Rectangle(959, 23, 327, 480);
                                    double similarityThreshold10 = 0.9;
                                    Point targetPoint10 = ImageFinder.findImage(targetImage10, searchArea10,
                                            similarityThreshold10);
                                    if (targetPoint10 != null) {
                                        LOGGER.info("找到采集制作图标1");
                                        robot.mouseMove(targetPoint10.x + targetImage10.getWidth() / 2+ (int) v1, targetPoint10.y + targetImage10.getHeight() / 2+ (int) v1);
                                        robot.delay((int) v);
                                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                        robot.delay((int) v);
                                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                        Thread.sleep((int) v3); //延迟
                                        LOGGER.info("点击采集制作图标1");
                                        LOGGER.info("奥德采集图标出现");

                                        Color color22 = robot1.getPixelColor(1339, 326);// 80%左右的位置是灰色
                                        Color color23 = robot1.getPixelColor(1222, 304);//达人2错误未改
                                        Color color24 = robot1.getPixelColor(1333, 308);// 达人1
                                        if (color22.getRed() == 16 & color23.getRed() > 170 & color24.getRed() > 185) {
                                            Thread.sleep(1000); //延迟
                                            LOGGER.info("判断奥德采集已经达人");
                                            ten_step = 7;//未写，是买采集器的内容
                                            LOGGER.info("进入5-step7");//不对需要改
                                        }else {
                                            LOGGER.info("判断未到达人需要升级开始进入5-step6");
                                            ten_step = 6;
                                        }



                                    } else {
                                        KeyUtil.pressKey(robot, KeyEvent.VK_K, -1);

                                        LOGGER.info("没找到采集制作图标按K2");
                                        BufferedImage targetImage11 = ImageIO.read(new File("D:/截图/正确截图/采集制作.png"));
                                        Rectangle searchArea11 = new Rectangle(959, 23, 327, 480);
                                        double similarityThreshold11 = 0.9;
                                        Point targetPoint11 = ImageFinder.findImage(targetImage11, searchArea11,
                                                similarityThreshold11);
                                        if (targetPoint11 != null) {
                                            LOGGER.info("找到采集制作图标2");
                                            robot.mouseMove(targetPoint11.x + targetImage11.getWidth() / 2+ (int) v1, targetPoint11.y + targetImage11.getHeight() / 2+ (int) v1);
                                            robot.delay((int) v);
                                            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                            robot.delay((int) v);
                                            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                            Thread.sleep((int) v3); //延迟
                                            LOGGER.info("点击采集制作图标2");
                                        }

                                    }

                                    }//timer1.cancel();

                                Color color27 = robot1.getPixelColor(70, 880); // 转向
                                if (color27.getRed() > 134&color27.getRed() < 142&color27.getGreen() > 128&color27.getGreen() < 135
                                        &color27.getBlue() > 109&color27.getBlue() < 117) {
                                    LOGGER.info("判断出5-4-29按e");
                                    robot.keyPress(KeyEvent.VK_Q);//按下键盘按键 上升
                                    robot.delay((int)v6);//按住延迟
                                    robot.keyRelease(KeyEvent.VK_Q);



                                }

                                Color color26 = robot1.getPixelColor(46, 882); // 转向
                                if (color26.getRed() > 142&color26.getRed() < 150&color26.getGreen() > 138&color26.getGreen() < 144
                                        &color26.getBlue() > 118&color26.getBlue() < 126) {
                                    LOGGER.info("判断出5-4-28按e");
                                    KeyUtil.pressKey(robot, KeyEvent.VK_E, -1);
                                    Thread.sleep(100);

                                }





                                    Thread.sleep(2000); //延迟


                            }
                            if (ten_step == 6){
                                LOGGER.info("进入step6");



                                boolean condition1 = ColorChecker.checkColorAndExecuteCommand(robot, 464, 26, 75, 243, 163,
                                        () -> {});

                                boolean condition2 = ColorChecker.checkColorAndExecuteCommand(robot, 477, 29, 76, 246, 165,
                                        () -> {});

                                if (condition1 && condition2) {
                                    LOGGER.info("选到正确的NPC乌斯");
                                    KeyUtil.pressKey(robot, KeyEvent.VK_C, -1);
                                    Thread.sleep(8000);
                                    MouseUtil.moveWithCurve(robot, 203, 320);
                                    Thread.sleep(2000);
                                    MouseUtil.moveWithCurve(robot, 787, 504);
                                    Thread.sleep(2000);
                                    boolean condition3 = ColorChecker.checkColorAndExecuteCommand(robot, 563, 387, 195, 195, 163,
                                            () -> {});//问题的问点1

                                    boolean condition4 = ColorChecker.checkColorAndExecuteCommand(robot, 562, 416, 211, 209, 172,
                                            () -> {});//问题的要点1

                                    if (condition4 && condition3) {
                                        LOGGER.info("ten5钱不够升级等待");
                                        Thread.sleep(20000);

                                    }else{
                                        LOGGER.info("ten5step6升级成功开始选择去哪里");
                                        boolean condition5 = ColorChecker.checkColorAndExecuteCommand(robot, 1122, 303, 214, 213, 174,
                                                () -> {});

                                        boolean condition6 = ColorChecker.checkColorAndExecuteCommand(robot, 1122, 309, 198, 197, 163,
                                                () -> {});


                                        if (condition5 && condition6) {
                                            LOGGER.info("ten5step6判断中级未到199准备进入ten7");
                                            KeyUtil.pressKey(robot, KeyEvent.VK_ALT, KeyEvent.VK_9);
                                            Thread.sleep(15000);

                                            ten_1 =7 ;
                                            continue outerLoop5;

                                        }
                                        boolean condition7 = ColorChecker.checkColorAndExecuteCommand(robot, 1124, 311, 189, 188, 156,
                                                () -> {});//上级的上

                                        boolean condition8 = ColorChecker.checkColorAndExecuteCommand(robot, 1119, 311, 189, 188, 156,
                                                () -> {});//上级的上

                                    if (condition7 && condition8) {
                                        LOGGER.info("判断奥德采集技能200进入10循环");

                                        ten_1=10;
                                        continue outerLoop5;


                                    }

                                    Color color19 = robot1.getPixelColor(1125, 303);//高级的高2
                                    Color color18 = robot1.getPixelColor(1118, 309);// 高级的高1
                                    if ( color19.getRed() > 176 & color18.getRed() > 185) {
                                        LOGGER.info("判断奥德采集技能300准备去难民村并定奇斯克进入18循环");

                                        Thread.sleep(500); //延迟
                                        ten_1 = 18;
                                        continue outerLoop5;


                                    }}


                                }else{
                                    LOGGER.info("按F8选择NPC");
                                    Thread.sleep(200);
                                    KeyUtil.pressKey(robot, KeyEvent.VK_F8, -1);
                                    Thread.sleep(1300);
                                    KeyUtil.pressKey(robot, KeyEvent.VK_A, -1);
                                    Thread.sleep(500);
                                }} //找NPC升级后并定好奇斯克后进入ten=10
                            if (ten_step == 7){

                                boolean condition1 = ColorChecker.checkColorAndExecuteCommand(robot, 464, 26, 75, 243, 163,
                                        () -> {});

                                boolean condition2 = ColorChecker.checkColorAndExecuteCommand(robot, 477, 29, 76, 246, 165,
                                        () -> {});

                                if (condition1 && condition2) {
                                    LOGGER.info("选到正确的NPC乌金");
                                    KeyUtil.pressKey(robot, KeyEvent.VK_C, -1);
                                    Thread.sleep(8000);
                                    MouseUtil.moveWithCurve(robot, 203, 320);

                                    LOGGER.info("开始进入ten10");
                                    ten_1 = 10;
                                    continue outerLoop;


                                }else{
                                    LOGGER.info("按F8选择NPC");
                                    KeyUtil.pressKey(robot, KeyEvent.VK_F8, -1);
                                    Thread.sleep(1300);
                                    KeyUtil.pressKey(robot, KeyEvent.VK_A, -1);
                                    Thread.sleep(500);
                                }}//买采集器

            }}//到伏魔殿匠人会堂未完成需要写判断奥德等级部分初级中级高级达人
            if (ten_1 == 3) {
                for (;;) {

                    LOGGER.info("进入ten_1=3循环");
                    Color color2333 = robot1.getPixelColor(964, 849);
                    Color color199 = robot1.getPixelColor(1178, 831);
                    Color color209 = robot1.getPixelColor(616, 661);
                    Color color210 = robot1.getPixelColor(1155, 826);

                    if (color2333.getRed() > 200 & color199.getGreen() < 60) {
                        LOGGER.info("判断可以吃药");
                        robot1.keyPress(KeyEvent.VK_EQUALS);//按住enter
                        robot1.delay(c);//按住一秒1秒后
                        robot1.keyRelease(KeyEvent.VK_EQUALS); //释放enter
                        LOGGER.info("点击=吃药");
                    }
                    boolean condition2 = ColorChecker.checkColorAndExecuteCommand(robot, 1158, 825, 190, 25, 0,
                            () -> {
                            });


                    if (condition2 ) {
                        LOGGER.info("判断飞行时间不够");
                        robot1.keyRelease(KeyEvent.VK_W);
                        Thread.sleep(c);
                        robot1.keyRelease(KeyEvent.VK_D);
                        LOGGER.info("关掉W和D并开始下降10秒");
                        robot.keyPress(KeyEvent.VK_F);//按下键盘按键 上升
                        robot.delay(10000);//按住延迟
                        robot.keyRelease(KeyEvent.VK_F); //释放键盘按键
                        Thread.sleep(200); //延迟
                        LOGGER.info("开始关翅膀");

                        robot.keyPress(KeyEvent.VK_PAGE_DOWN);//按下键盘按键 上升
                        robot.delay(50);//按住延迟
                        robot.keyRelease(KeyEvent.VK_PAGE_DOWN); //释放键盘按键
                        LOGGER.info("开始休息250秒");
                        Thread.sleep(250000);
                        LOGGER.info("开始起飞");
                        robot.keyPress(KeyEvent.VK_PAGE_UP);//按下键盘按键 上升
                        robot.delay(50);//按住延迟
                        robot.keyRelease(KeyEvent.VK_PAGE_UP); //释放键盘按键
                        robot.delay(4500);//按住延迟
                        LOGGER.info("开始上升");
                        robot.keyPress(KeyEvent.VK_R);//按下键盘按键 上升
                        robot.delay(2000);//按住延迟
                        robot.keyRelease(KeyEvent.VK_R); //释放键盘按键
                        Thread.sleep(200); //延迟
                        LOGGER.info("开始进入step2");
                        ten_step = 2;
                    }
                    boolean condition5 = ColorChecker.checkColorAndExecuteCommand(robot, 1196, 111, 249, 244, 202,
                            () -> {});
                    boolean condition6 = ColorChecker.checkColorAndExecuteCommand(robot, 1193, 114, 21, 34, 42,
                            () -> {});


                    if (condition5&condition6) {
                        LOGGER.info("判断死亡");
                        robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                        robot.delay(500);//按住延迟
                        robot.keyRelease(KeyEvent.VK_D); //释放键盘按键
                        LOGGER.info("释放WD,休息240秒");
                        Thread.sleep(240000);
                        LOGGER.info("开始进入17-step1循环");
                        ten_step=1;
                    }
                    Color color22 = robot1.getPixelColor(1149, 328);
                    if (color22.getGreen() > 20){
                        System.out.println("Color at (1149, 328): " + color22);
                        LOGGER.info("判断奥德等级到299开始去5循环");
                        ten_1 = 5;//加下降
                        break;
                    }


                    if (ten_step == 1) {
                        LOGGER.info("进入3-step1循环");
                        Color color208 = robot1.getPixelColor(150, 757);
                        //去的路径


                        if (color208.getRed() > 208  ) {
                            LOGGER.info("找到起始方向");

                            boolean condition7 = ColorChecker.checkColorAndExecuteCommand(robot, 1196, 111, 249, 244, 202,
                                    () -> {});
                            boolean condition8 = ColorChecker.checkColorAndExecuteCommand(robot, 1193, 114, 21, 34, 42,
                                    () -> {});


                            if (condition7&condition8) {
                                Thread.sleep(240000);
                                LOGGER.info("判断虚弱");
                            }
                            LOGGER.info("往前走");
                            Thread.sleep(500); //延迟
                            robot1.keyPress(KeyEvent.VK_W);//往前走
                            int[][] colors = {
                                    {207, 798, 146} // x1, y1, red1
                            };
                            CustomState customState = new CustomState();
                            ColorChecker2.checkColorAndExecuteCommandWithTimeout(customState, colors, 30, 600, 900,
                                    () -> {
                                        LOGGER.info("判断走到第一个转弯点");
                                        ten_step = 3;
                                        LOGGER.info("进入3-step3");

                                    },
                                    Optional.empty());

                                for (; ; ) {
                                    if (ten_step == 3) {
                                        AngleCalculatorTask task = new AngleCalculatorTask(robot, 153, 757);
                                        Thread.sleep(100);
                                        LOGGER.info("3-STEP3-1");
                                        task.run();

                                        int[][] colors1 = {
                                                {207, 798, 146} // x1, y1, red1‘、方法
                                        };
                                        CustomState customState1 = new CustomState();
                                        ColorChecker2.checkColorAndExecuteCommandWithTimeout(customState1, colors1, 30, 600, 900,
                                                () -> {
                                                    LOGGER.info("判断走到第一个转弯点");
                                                   robot.delay(50000);
                                                    ten_step = 4;
                                                    LOGGER.info("进入3-step4");

                                                },
                                                Optional.empty());

                                    }
                                    if (ten_step == 4) {
                                        AngleCalculatorTask task = new AngleCalculatorTask(robot, 153, 757);
                                        Thread.sleep(100);
                                        LOGGER.info("3-STEP3-1");
                                        task.run();

                                        int[][] colors1 = {
                                                {207, 798, 146} // x1, y1, red1
                                        };
                                        CustomState customState1 = new CustomState();
                                        ColorChecker2.checkColorAndExecuteCommandWithTimeout(customState1, colors1, 30, 600, 900,
                                                () -> {
                                                    LOGGER.info("判断走到第一个转弯点");
                                                    ten_step = 4;
                                                    LOGGER.info("进入3-step4");

                                                },
                                                Optional.empty());

                                    }
                                    if (ten_step == 5) {
                                        LOGGER.info("进入4-STEP4");
                                        Thread.sleep(200); //延迟
                                        robot.keyRelease(KeyEvent.VK_W); //释放键盘按键
                                        Thread.sleep(2000); //延迟
                                        LOGGER.info("停止前进并点击起飞按键");
                                        robot.keyPress(KeyEvent.VK_PAGE_UP);//按下键盘按键 上升
                                        robot.delay(50);//按住延迟
                                        MouseUtil.moveWithCurve(robot, 1160, 847);
                                        robot.mouseMove(1268 + (int) v1, 586 + (int) v1);
                                        Thread.sleep(1000); //延迟
                                        LOGGER.info("开始点R上升");
                                        robot.keyPress(KeyEvent.VK_R);//按下键盘按键 上升
                                        robot.delay(4500);//按住延迟
                                        LOGGER.info("上升4.5秒停止");
                                        robot.keyRelease(KeyEvent.VK_R); //释放键盘按键
                                        Thread.sleep(200); //延迟
                                        LOGGER.info("开始进入17-step = 2");
                                        ten_step = 2;

                                        break;
                                    }
                                }


                        } else {
                            LOGGER.info("角度不对开始转向2");
                            robot1.keyPress(KeyEvent.VK_A);
                            robot1.delay(10);
                            robot1.keyRelease(KeyEvent.VK_A);
                            Thread.sleep(200);
                            LOGGER.info("开始回到17-step = 1");
                            ten_step = 1;
                        }
                    }

                    if (ten_step == 2) {

                        LOGGER.info("进入17-step = 2");
                        if (color209.getRed() == 45) {
                            LOGGER.info("判断没有出现成功率开始点4");
                            robot1.keyPress(KeyEvent.VK_4);                //如果没采集
                            robot1.delay(c);
                            robot1.keyRelease(KeyEvent.VK_4);

                            Thread.sleep(500);
                            LOGGER.info("延迟500毫秒");

                            ten_2 = ten_2 + 1;
                            ten_3 = ten_3 + 1;

                            LOGGER.info("未采到ten_2计次数");
                        }
                        if (color209.getRed() > 45) {                  //如果采集到了
                            LOGGER.info("如果成功率出现");
                            ten_3 = 1;
                            ten_2 = 1;
                            Thread.sleep(500);
                            LOGGER.info("采到ten_2计数清零");
                        }

                        if (ten_2 == 14) {
                            LOGGER.info("判断10次未采到");// 10次没采到
                            robot1.keyPress(KeyEvent.VK_W);
                            robot1.keyPress(KeyEvent.VK_D);
                            robot1.delay(1000);
                            robot1.keyRelease(KeyEvent.VK_D);
                            robot1.delay(1000);
                            robot1.keyPress(KeyEvent.VK_W);
                            Thread.sleep(c);
                        }
                        if (ten_2 == 26) {                         // 14次没采到
                            LOGGER.info("判断26次未采到");
                            robot1.keyPress(KeyEvent.VK_W);
                            robot1.delay(1000);
                            robot1.keyRelease(KeyEvent.VK_W);
                            Thread.sleep(c);
                        }

                        if (ten_2 == 38) {                         // 18次没采到
                            LOGGER.info("判断18次未采到");
                            robot1.keyPress(KeyEvent.VK_W);
                            robot1.keyPress(KeyEvent.VK_D);
                            robot1.delay(1000);
                            robot1.keyRelease(KeyEvent.VK_D);
                            robot1.delay(1000);
                            robot1.keyPress(KeyEvent.VK_W);
                            Thread.sleep(c);

                        }
                        if (ten_2 == 50) {                       // 25次没采到

                            LOGGER.info("判断25次未采到");
                            robot1.keyPress(KeyEvent.VK_W);
                            robot1.delay(1000);
                            robot1.keyRelease(KeyEvent.VK_W);
                            Thread.sleep(c);

                            ten_2 = 1;
                            LOGGER.info("ten_2清零");

                        }
                        if (ten_3 == 300 ) {
                            LOGGER.info("判断超过50次未采集");
                            robot1.keyPress(KeyEvent.VK_R);
                            robot1.delay(10000);
                            robot1.keyRelease(KeyEvent.VK_R);
                            Thread.sleep(c);
                            LOGGER.info("上升");
                            MouseUtil.moveWithCurve(robot, 1161, 853);
                            LOGGER.info("关翅膀");

                            Thread.sleep(12000);
                            LOGGER.info("等12秒");

                            robot1.keyPress(KeyEvent.VK_D);
                            robot1.delay(500);
                            robot1.keyRelease(KeyEvent.VK_D);

                            ten_3 = 1;
                            ten_2 = 1;
                            ten_1 = 1;
                            ten_5 = 1;
                            ten_6 = 1;
                            ten_7 = 1;
                            ten_1 = 17;
                            LOGGER.info("回到ten1=4");
                            // 25次没采到
                        }

                    }
                }

            }//去阿鲁齐纳并进行采集到399去5循环
            if (ten_1 == 18) { //接ten1=5-step6
                LOGGER.info("进入ten=18");
                KeyUtil.pressKey(robot, KeyEvent.VK_ALT, KeyEvent.VK_0);
                KeyUtil.pressKey(robot, KeyEvent.VK_ALT, KeyEvent.VK_0);
                LOGGER.info("按A+0回城卷轴等待15秒");
                Thread.sleep(15000);
                Color color1 = robot1.getPixelColor(516, 836);
                Color color19 = robot1.getPixelColor(575, 838);       //判断游戏画面点1出现(游戏是否在线)
                if (color1.getRed() > 58&color1.getRed() < 75&color1.getGreen() > 69&color1.getGreen() <85&color1.getBlue() > 98
                        &color1.getBlue() < 111&color19.getRed() > 53&color19.getRed() < 63&color19.getGreen() > 61&color19.getGreen() <72
                        &color19.getBlue() > 91 &color19.getBlue() < 99) {
                    LOGGER.info("ten7step2检测游戏画面出现准备进入ten7step1");
                    Color color11 = robot1.getPixelColor(368, 434);  //判断v挡板位置正确

                    Color color10 = robot1.getPixelColor(11, 615); //

                    if (color11.getRed() == 255 & color10.getRed() > 137){
                        LOGGER.info("ten7step1判断V挡板小地图正确");
                        Color color21 = robot1.getPixelColor(1255, 214);
                        if ( color21.getRed() == 185){
                            LOGGER.info("ten7step1检测K出现");
                            ten_step=1;

                        }else{
                            LOGGER.info("ten7step1检测K没出现点K");
                            KeyUtil.pressKey(robot, KeyEvent.VK_K, -1);

                        }

                    }else {
                        LOGGER.info("ten7step1检测VN没出现调整画面");
                        Thread.sleep(200);

                        KeyUtil.pressKey(robot, KeyEvent.VK_V, -1);
                        KeyUtil.pressKey(robot, KeyEvent.VK_N, -1);
                        KeyUtil.pressKey(robot, KeyEvent.VK_N, -1);
                        KeyUtil.pressKey(robot, KeyEvent.VK_N, -1);
                        LOGGER.info("ten7step2调整好画面设置");
                        Thread.sleep(1000);
                    }
                    Thread.sleep(1000);
                    KeyUtil.pressKey(robot, KeyEvent.VK_U, -1);
                    LOGGER.info("打开U");
                    LOGGER.info("开始删除宏图标3小块奥德");
                    BufferedImage targetImage1 = ImageIO.read(new File("D:/截图/正确截图/宏图标3.png"));
                    Rectangle searchArea1 = new Rectangle(1059, 153, 224, 404);
                    double similarityThreshold1 = 0.9;
                    Point targetPoint1 = ImageFinder.findImage(targetImage1, searchArea1,
                            similarityThreshold1);
                    if (targetPoint1 != null) {
                        LOGGER.info("找到宏图标3");
                        robot.mouseMove(targetPoint1.x + targetImage1.getWidth() / 2, targetPoint1.y + targetImage1.getHeight() / 2);
                        robot.delay((int) v);
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                        robot.delay((int) v);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                        Thread.sleep((int) v3); //延迟
                        robot.mouseMove(1084 + (int) v1, 574 + (int) v1); // 鼠标移动到xx坐标轴
                        robot.delay((int) v);
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                        robot.delay((int) v);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键


                        LOGGER.info("删除宏图标3");

                    }
                    Thread.sleep((int) v3); //延迟
                    BufferedImage targetImage7 = ImageIO.read(new File("D:/截图/正确截图/宏图标4.png"));
                    Rectangle searchArea7 = new Rectangle(1059, 153, 224, 404);
                    double similarityThreshold7 = 0.9;
                    Point targetPoint7 = ImageFinder.findImage(targetImage7, searchArea7,
                            similarityThreshold7);
                    if (targetPoint7 != null) {
                        LOGGER.info("找到宏图标4");
                        robot.mouseMove(targetPoint7.x + targetImage7.getWidth() / 2, targetPoint7.y + targetImage7.getHeight() / 2);
                        robot.delay((int) v);
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                        robot.delay((int) v);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                        Thread.sleep((int) v3); //延迟
                        robot.mouseMove(1084 + (int) v1, 574 + (int) v1); // 鼠标移动到xx坐标轴
                        robot.delay((int) v);
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                        robot.delay((int) v);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键


                        LOGGER.info("完成删除宏图标4");

                    }
                    Thread.sleep((int) v3);


                    BufferedImage targetImage3 = ImageIO.read(new File("D:/截图/正确截图/新建宏.png"));
                    Rectangle searchArea3 = new Rectangle(979, 253, 269, 440);
                    double similarityThreshold3 = 0.9;
                    Point targetPoint3 = ImageFinder.findImage(targetImage3, searchArea3,
                            similarityThreshold3);
                    if (targetPoint3 != null) {
                        LOGGER.info("找到新建宏");
                        MouseUtil.moveWithCurve(robot, targetPoint3.x + targetImage3.getWidth() / 2, targetPoint3.y + targetImage3.getHeight() / 2);
                        LOGGER.info("点击新建宏");
                        Thread.sleep((int) v3); //延迟
                        LOGGER.info("开始阿鲁齐纳的宫殿入口宏文档黏贴");
                        CopyAndPaste.copyAndPaste("D:\\截图\\文档\\宏设置.txt", 13, 14, 836, 446);

                        Thread.sleep((int) v3); //
                        LOGGER.info("开始设置宏名称为33");
                        MouseUtil.move(robot, 836, 165);
                        KeyUtil.pressKey(robot, KeyEvent.VK_3, -1);
                        KeyUtil.pressKey(robot, KeyEvent.VK_3, -1);
                        LOGGER.info("开始选择宏图标");
                        MouseUtil.moveWithCurve(robot, 843, 292);
                        LOGGER.info("开始点击储存");
                        MouseUtil.moveWithCurve(robot, 953, 577);
                        LOGGER.info("开始点击下方空白处");
                        MouseUtil.moveWithCurve(robot, 1121, 532);

                        BufferedImage targetImage6 = ImageIO.read(new File("D:/截图/正确截图/宏图标3.png"));
                        Rectangle searchArea6 = new Rectangle(1059, 182, 130, 372);
                        double similarityThreshold6 = 0.9;
                        Point targetPoint6 = ImageFinder.findImage(targetImage6, searchArea6,
                                similarityThreshold6);
                        if (targetPoint6 != null) {
                            LOGGER.info("找到宏图标3");
                            robot.mouseMove(targetPoint6.x + targetImage6.getWidth() / 2, targetPoint6.y + targetImage6.getHeight() / 2);
                            robot.delay((int) v);
                            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                            robot.delay((int) v);
                            robot.mouseMove(722 + (int) v1, 860 + (int) v1); // 鼠标移动到xx坐标轴
                            robot.delay((int) v);
                            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                            Thread.sleep((int) v3); //延迟
                            LOGGER.info("完成宏图标3拖拽");

                        }
                    }
                    Thread.sleep(1000);
                    KeyUtil.pressKey(robot, KeyEvent.VK_U, -1);
                robot.mouseMove(1160 + (int) v1, 847 + (int) v1);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                robot.delay((int) v);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                robot.delay((int) v);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                Thread.sleep(500);
                ten_step = 1;
                Thread.sleep(500);
                for(;;){
                    if (ten_step == 1){

                        LOGGER.info("进入18-step1");
                        Color color208 = robot1.getPixelColor(153, 755);
                        System.out.println("Color at (152, 757): " + color208);

                        if (color208.getRed() > 226) {
                            LOGGER.info("进入18-step1-1");
                            boolean condition5 = ColorChecker.checkColorAndExecuteCommand(robot, 1196, 111, 249, 244, 202,
                                    () -> {});
                            boolean condition6 = ColorChecker.checkColorAndExecuteCommand(robot, 1193, 114, 21, 34, 42,
                                    () -> {});


                            if (condition5&condition6) {
                                LOGGER.info("判断虚弱");
                                Thread.sleep(24000); //延迟
                            }


                            robot.keyPress(KeyEvent.VK_W);

                            LOGGER.info("往前走");

                            Color color32 = robot1.getPixelColor(166, 798);//没有写超时查不到色素就执行命令

                            if (color32.getRed() > 118) {
                                LOGGER.info("判断走到第一个转弯点");
                                robot.keyRelease(KeyEvent.VK_W); //释放键盘按键


                                robot.delay((int)v3);//按住延迟
                                AngleCalculatorTask task2 = new AngleCalculatorTask(robot, 141, 752);
                                task2.run();
                                LOGGER.info("开始进入18-step2");
                                ten_step = 2;


                            }
                        } else {

                            LOGGER.info("进入5-step6-step10角度不对开始转向3");
                            robot1.keyPress(KeyEvent.VK_A);
                            robot1.delay(10);
                            robot1.keyRelease(KeyEvent.VK_A);
                            Thread.sleep(200);



                        }}

                        if (ten_step == 2) {
                            LOGGER.info("进入5-step6-step8");
                            boolean condition5 = ColorChecker.checkColorAndExecuteCommand(robot, 463, 23, 76, 245, 165,
                                    () -> {});

                            boolean condition6 = ColorChecker.checkColorAndExecuteCommand(robot, 469, 23, 76, 245, 165,
                                    () -> {});

                            if (condition5 && condition6) {
                                LOGGER.info("选到正确的NPC1");

                                KeyUtil.pressKey(robot, KeyEvent.VK_C, -1);
                                LOGGER.info("点C");
                                Thread.sleep(2000);
                                robot.mouseMove(1160 + (int) v1, 847 + (int) v1);
                                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 按左键
                                robot.delay((int) v);
                                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 松开左键
                                Thread.sleep(1000);
                                KeyUtil.pressKey(robot, KeyEvent.VK_C, -1);
                                KeyUtil.pressKey(robot, KeyEvent.VK_C, -1);
                                KeyUtil.pressKey(robot, KeyEvent.VK_C, -1);
                                MouseUtil.moveWithCurve(robot, 210, 288);
                                Thread.sleep(2000);
                                MouseUtil.moveWithCurve(robot, 246, 255);
                                Thread.sleep(2000);
                                MouseUtil.moveWithCurve(robot, 786, 503);
                                Thread.sleep(1000);

                                LOGGER.info("开始进入5-STEP3");
                                ten_step = 3;
                            }else {
                                KeyUtil.pressKey(robot, KeyEvent.VK_F8, -1);
                                Thread.sleep(1500);
                                KeyUtil.pressKey(robot, KeyEvent.VK_A, -1);
                                Thread.sleep(500);

                            }
                        }
                        if (ten_step == 3) {
                            LOGGER.info("进入18-STEP3");
                            Thread.sleep(60000);
                            LOGGER.info("等60秒");
                            Thread.sleep(200); //延迟
                            LOGGER.info("进入18-step1");
                            ten_step = 4;
                            for(;;){
                            if (ten_step == 4) {
                            Color color208 = robot1.getPixelColor(154, 747);
                            System.out.println("Color at (154, 747): " + color208);
                            if (color208.getRed() > 124) {
                                LOGGER.info("进入18-step4-1");
                                boolean condition5 = ColorChecker.checkColorAndExecuteCommand(robot, 1196, 111, 249, 244, 202,
                                        () -> {});
                                boolean condition6 = ColorChecker.checkColorAndExecuteCommand(robot, 1193, 114, 21, 34, 42,
                                        () -> {});


                                if (condition5&condition6) {
                                    Thread.sleep(240000);
                                    LOGGER.info("判断虚弱");
                                }


                                robot.keyPress(KeyEvent.VK_W);
                                LOGGER.info("往前走");
                                boolean condition9 = ColorChecker.checkColorAndExecuteCommand(robot, 141, 811, 101, 100, 76,
                                        () -> {});


                                if (condition9) {

                                    robot.keyRelease(KeyEvent.VK_W);
                                    robot.delay((int)v3);//按住延迟
                                    MouseUtil.moveWithCurve(robot, 966, 771);
                                    LOGGER.info("按c+=定奇斯克2");
                                    robot.delay(2000);//按住延迟
                                    MouseUtil.moveWithCurve(robot, 788, 512);





                                    ten_1 = 24;}


                                }
                             else {

                                LOGGER.info("进入5-step6-step10角度不对开始转向3");
                                robot1.keyPress(KeyEvent.VK_A);
                                robot1.delay(10);
                                robot1.keyRelease(KeyEvent.VK_A);
                                Thread.sleep(200);




                            }}



                        }}



                }


            }}//接ten1=5-step6到达贝鲁斯兰去难民村定点
            if (ten_1 == 2) {

                Thread.sleep(1000); //延迟
                boolean condition5 = ColorChecker.checkColorAndExecuteCommand(robot, 1333, 191, 192, 192, 161,
                        () -> {});

                boolean condition6 = ColorChecker.checkColorAndExecuteCommand(robot, 1323, 188, 165, 167, 144,
                        () -> {});

                if (condition5 && condition6) {
                    LOGGER.info("确定位置在难民村");
                    ten_1 = 3;
                    LOGGER.info("进入3循环");
                } else { //人没有回阿尔空采初始点点卷轴位置 暂时点卷轴，后面改回城
                    LOGGER.info("ten_1=2确定位置不在难民村回城处开始点8回城");
                    KeyUtil.pressKey(robot, KeyEvent.VK_8, -1);
                    Thread.sleep(1000);

                    boolean condition1 = ColorChecker.checkColorAndExecuteCommand(robot, 625, 705, 23, 30, 41,
                            () -> {});

                    boolean condition2 = ColorChecker.checkColorAndExecuteCommand(robot, 813, 705, 23, 30, 41,
                            () -> {});

                    if (condition1 && condition2) {
                        LOGGER.info("8回城条出现等待20秒");
                        Thread.sleep(20000);
                    }else{
                        LOGGER.info("8回城条未出现等待20秒");
                        Thread.sleep(20000);
                        KeyUtil.pressKey(robot, KeyEvent.VK_9, -1);
                        LOGGER.info("点9紧急回城");
                        boolean condition3 = ColorChecker.checkColorAndExecuteCommand(robot, 625, 705, 23, 30, 41,
                                () -> {});

                        boolean condition4 = ColorChecker.checkColorAndExecuteCommand(robot, 813, 705, 23, 30, 41,
                                () -> {});

                        if (condition3 && condition4) {
                            LOGGER.info("点9紧急回城条出现等待20秒");
                            Thread.sleep(20000);

                        }

                    }


                    LOGGER.info("等待20秒");


                }


            }//确定位置在难民村


        }
        //while (true2

    }//pub2
}//pub1