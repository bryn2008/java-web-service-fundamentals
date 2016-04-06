package training;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
@Profile("json")
public class ObservationJson extends ObservationBase {
    @Autowired
    public ObservationJson(ResourceLoader loader, @Value("${observations.json.path}") String path) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            List<MinMax> list = mapper.readValue(
                                       loader.getResource(path).getFile(),
                                       new TypeReference<List<MinMax>>(){});
            for (MinMax obs : list) {
                observations.put(obs.getDate(), obs);
            }
        }
        catch (IOException ex) {
            throw new ObservationException(ex, "Cannot read JSON file %s", path);
        }
    }

//    /**
//     * Example JSON mapping with default (Map) bindings
//     * @param loader
//     * @param path
//     */
//    @SuppressWarnings("unchecked")
//    public ObservationJson(ResourceLoader loader, @Value("${observations.json.path}"), String path) {
//        try {
//            ObjectMapper mapper = new ObjectMapper();
//            List<LinkedHashMap> list = mapper.readValue(loader.getResource(path).getFile(), List.class);
//            for (LinkedHashMap obs : list) {
//                LocalDate date = LocalDate.parse(((String)obs.get("Date")).trim());
//                double minT = (Double)obs.get("minT");
//                double maxT = (Double)obs.get("maxT");
//                observations.put(date, new MinMax(date, maxT, minT));
//            }
//        }
//        catch (IOException ex) {
//            throw new ObservationException(ex, "Cannot read JSON file %s", path);
//        }
//    }
}
