package com.holicxxx.demo2.test3;

public class Manager {
    private String name;
    private int id;
    private int salary;
    private int bonus;

    public Manager() {
    }

    public Manager(String name, int id, int salary, int bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
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
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * 获取
     * @return bonus
     */
    public int getBonus() {
        return bonus;
    }

    /**
     * 设置
     * @param bonus
     */
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public void work(){
        System.out.printf("工号为%d基本工资为%d奖金为%d的项目经理%s正在努力的做着管理工作," +
                "分配任务,检查员工提交上来的代码......",id,salary,bonus,name);
    }

}
