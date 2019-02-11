package kdg.be.school.services;

import kdg.be.school.model.School;
import kdg.be.school.repo.SchoolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepo repo;

    public School getSchool(int id) {
        return this.repo.getOne(id);
    }

    public School saveSchool(School school) {
        return this.repo.save(school);
    }

    public void deleteSchool(int id) {
        this.repo.deleteById(id);
    }

    public List<School> getAllSchools() {
        return this.repo.findAll();
    }


    public void fillDatabase() {
        School[] schools = new School[]{
                new School("Karel de Grote", "Antwerpen"),
                new School("Artesis Plantijn", "Antwerpen"),
                new School("Tomas More", "Mechelen"),
                new School("Hoge school Gent", "Gent"),
                new School("Hogeschool PXL", "Hasselt")


        };

        for (School school : schools) {
            this.repo.save(school);
        }
    }


}
