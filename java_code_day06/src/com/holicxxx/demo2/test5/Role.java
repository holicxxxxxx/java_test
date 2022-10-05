package com.holicxxx.demo2.test5;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Role {
    private String name;
    private int blood;
    private String face;
    private String gender;
    //男生长相数组
    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    //女生长相数组
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};
    //attack 攻击描述：
    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"};
    //injured 受伤描述：
    String[] injureds_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"};
    public Role() {
    }

    public Role(String name, int blood,String gender) {
        this.name = name;
        this.blood = blood;
        this.gender =gender;
        setFace();
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    public String getFace() {
        return face;
    }

    public void setFace() {
        Random r=new Random();
        if(this.gender=="男"){
            int num=r.nextInt(boyfaces.length);
            this.face=boyfaces[num];
        }else if (this.gender=="女"){
            int num =r.nextInt(girlfaces.length);
            this.face=girlfaces[num];
        }else{
            this.face="面目狰狞";
        }

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(Role role){
        Random r=new Random();
        int index =r.nextInt(attacks_desc.length);
        String KungFu =attacks_desc[index];
        int num=r.nextInt(20)+1;
        int temp=role.getBlood()-num;
        temp=temp<0?0:temp;
        role.setBlood(temp);
//        library_System.out.printf("%s举起拳头打了%s一下," +
//                "造成了%d点伤害,%s还剩下%d点血",name,role.name,num,role.name,temp);
        //此处不需要通过getName访问,而只是用role.name,应该是在类里面所以没问题的原因?
        System.out.printf("%s"+
                KungFu,getFace(),this.name,role.getName());
        System.out.println();
        if (temp > 90) {
            System.out.printf(injureds_desc[0], role.getName());
        }else if(temp > 80 && temp <= 90){
            System.out.printf(injureds_desc[1], role.getName());
        }else if(temp > 70 && temp <= 80){
            System.out.printf(injureds_desc[2], role.getName());
        }else if(temp > 60 && temp <= 70){
            System.out.printf(injureds_desc[3], role.getName());
        }else if(temp > 40 && temp <= 60){
            System.out.printf(injureds_desc[4], role.getName());
        }else if(temp > 20 && temp <= 40){
            System.out.printf(injureds_desc[5], role.getName());
        }else if(temp > 10 && temp <= 20){
            System.out.printf(injureds_desc[6], role.getName());
        }else{
            System.out.printf(injureds_desc[7], role.getName());
        }
        System.out.println();

    }
}
