package hu.test.changelog;

import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World!");
    }

    @GetMapping("/{name}")
    public ResponseEntity<String> hello(@PathVariable String name) {
        return ResponseEntity.ok("Hello " + name);
    }
}
