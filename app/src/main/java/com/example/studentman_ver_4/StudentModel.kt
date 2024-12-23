package com.example.studentman_ver_4

import android.content.ContentValues

data class StudentModel(val studentName: String, val studentId: String) {
    fun toContentValues(): ContentValues {
        val values = ContentValues()
        values.put("name", studentName)
        values.put("student_id", studentId)
        return values
    }
}