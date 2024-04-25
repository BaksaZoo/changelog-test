package hu.test.changelog;

import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/{name}")
    public ResponseEntity<String> hello(@PathVariable String name) {
        name = StringUtils.hasText(name) ? "World" : name;
        return ResponseEntity.ok("Hello " + name);
    }
}
