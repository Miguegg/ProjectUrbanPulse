package urbanpulse.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UrbanContextService {
    private final UrbanContextRepository urbanContextRepository;
}
