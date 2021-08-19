package com.example.demo.security;

public enum ApplicationPermission {
    STUDENT_READ("student:read"),
    STUDENT_WRITE("student:write"),
    COURSE_WRITE("course:read"),
    COURSE_READ("course:write");

    private final String permission;
    ApplicationPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
