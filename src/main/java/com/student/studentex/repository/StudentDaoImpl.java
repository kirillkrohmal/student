package com.student.studentex.repository;


import com.student.studentex.models.Interview;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Repository;
import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.ParseInt;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.dozer.CsvDozerBeanReader;
import org.supercsv.io.dozer.ICsvDozerBeanReader;
import org.supercsv.prefs.CsvPreference;
import com.student.studentex.models.Interview;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;



@Repository("studentDao")
public class StudentDaoImpl implements StudentDao{
    private static final String[] FIELD_MAPPING = new String[]{
            "number",
            "question",
            "answers[0]",
            "answers[1]",
            "answers[2]",
            "rightNumber"
    };
    private static final CellProcessor[] processors = new CellProcessor[]{
            new Optional(new ParseInt()),
            new Optional(),
            new Optional(),
            new Optional(),
            new Optional(),
            new ParseInt()
    };

    @Override
    public List<Interview> readQuestionsFromSource() throws Exception {
        List<Interview> questions = new ArrayList<> ();
        //Locale.setDefault(Locale.ENGLISH); //test
        Locale locale = Locale.getDefault();
        ClassLoader classLoader = getClass().getClassLoader();
        File source;
        switch (locale.toString()) {
            case "en":
                source = new File(classLoader.getResource("source_en.csv").getFile());
                break;
            case "ru_RU":
                source = new File(classLoader.getResource("source_ru.csv").getFile());
                break;
            default:
                source = new File(classLoader.getResource("source_en.csv").getFile());
        }
        try (ICsvDozerBeanReader pojoReader = new CsvDozerBeanReader(new FileReader (source),
                CsvPreference.STANDARD_PREFERENCE)) {
            pojoReader.getHeader(true);
            pojoReader.configureBeanMapping(Interview.class, FIELD_MAPPING);
            Interview question;
            while ((question = pojoReader.read(Interview.class, processors)) != null) {
                questions.add(question);
            }
        }
        return questions;
    }
}
