package com.example.lab_week_09.ui.theme

import com.example.lab_week_09.Student
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

object MoshiHelper {
    // 1. Create the Moshi instance
    private val moshi: Moshi = Moshi.Builder()
        .addLast(KotlinJsonAdapterFactory())
        .build()

    // 2. Define the type for a List of Student
    private val listStudentType = Types.newParameterizedType(List::class.java, Student::class.java)

    // 3. Create the JSON adapter for List<Student>
    val listStudentAdapter = moshi.adapter<List<Student>>(listStudentType)
}