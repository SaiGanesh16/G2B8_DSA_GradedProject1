package com.greatlearning.javafsd.groupProject;

public class Main {
    public static void main(String[] args) {
        SuperDepartment superDepartment = new SuperDepartment();
        System.out.println(superDepartment.departmentName());
        System.out.println(superDepartment.getTodaysWork());
        System.out.println(superDepartment.getWorkDeadline());
        System.out.println(superDepartment.isTodayAHoliday());

        AdminDepartment adminDepartment = new AdminDepartment();
        System.out.println(adminDepartment.departmentName());
        System.out.println(adminDepartment.getTodaysWork());
        System.out.println(adminDepartment.getWorkDeadline());
        System.out.println(superDepartment.isTodayAHoliday());

        HrDepartment hrDepartment = new HrDepartment();
        System.out.println(hrDepartment.departmentName());
        System.out.println(hrDepartment.getTodaysWork());
        System.out.println(hrDepartment.getWorkDeadline());
        System.out.println(hrDepartment.doActivity());
        System.out.println(superDepartment.isTodayAHoliday());

        TechDepartment techDepartment = new TechDepartment();
        System.out.println(techDepartment.departmentName());
        System.out.println(techDepartment.getTodaysWork());
        System.out.println(techDepartment.getWorkDeadline());
        System.out.println(techDepartment.getTechStackInformation());
        System.out.println(superDepartment.isTodayAHoliday());
    }
}