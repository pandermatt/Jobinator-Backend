package ch.wintihack.jobinator.persistence.service;

import ch.wintihack.jobinator.model.Question;
import ch.wintihack.jobinator.persistence.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public Iterable<Question> getAllObjects() {
        return questionRepository.findAll();
    }
}
