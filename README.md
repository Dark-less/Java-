# Java-
java课程作业项目仓库

实验目的

用类描述计算机中CPU的速度和硬盘容量。

实验过程

首先进行框架设计，在Test主类下有CPU、HardDisk、PC三个分类，主类从分类调取参数并设计和调用显示函数show（）从而达到显示CPU速度以及硬盘容量的目的
创建项目Experiment，并创建包one，在此包下进行类的创建和编写
创建CPU_1类，创建参数speed，并创建方法getSpeed，用于之后为speed赋值
创建HardDisk_1类，创建参数amonut，并创建方法getAmount，用于之后为amount赋值
创建PC类，创建属性cpu和HD，并创建方法getCPU、getHardDisk，为属性赋值，并创建显示函数show（），在函数中利用打印函数对最终的cpu速度和硬盘容量进行显示
最后创建主类Test，首先将Test类里设置主函数，调用上述三类中的函数，并为其赋值、和显示

核心方法

利用Eclipse进行源代码的编译、调试及运行
用Github网站进行实验报告的撰写

实验结果

CPU_1类
public class CPU{
    int speed;
    public void setSpeed(int m){
        this.speed =m;
    }
    int getspeed(){
        return speed;
    }
}

HardDisk_1类
public class HardDisk {
    int amount;
    public void setAmount(int m){
        this.amount = m;
    }
    public int getAmount(){
         return amount;
 }
}

PC类
public class PC{
  CPU CPU;
  HardDisk HD;
     public void setCPU(CPU c) {
      this.cpu = c;
      }
     public void setHardDisk(HardDisk h){
      this.HD = h;
     }
     public void show(){
      System.out.println("cpu速度: " +CPU.getSpeed());
         System.out.println("硬盘容量: "+HD.getAmount());
     }
}

Test主类
public class Test {
 public static void main(String args[]){
  CPU cpu = new CPU();
  HardDisk disk = new HardDisk();
  cpu.setSpeed(2200);
  disk.setAmount(200);
  pc.setCPU(cpu);
  pc.setHardDisk(disk);
  pc.show();
 }
}

实验感想

在本次编程的过程中，出现了许多问题并解决，在过程中我体会了Java和其他语言不同的语法以及设计结构，尤其是各个包和类之间的参数调用。不管是标点符号还是缩进都要严格的按照规范编写，否则就会报错，在方法和构造方法的区别上我有了一定的了解，在对参数的加密属性上我也有了一定了解。
