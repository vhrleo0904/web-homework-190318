package kr.hs.dgsw.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @Autowired
    CalculatorService cs;

    @GetMapping("/calculator")
    public String solve(@RequestParam String num) {
        return cs.solve(num);
    }

    @GetMapping("/calculator/{num}")
    public String solve2(@PathVariable String num) {
        return cs.solve(num);
    }

}
