package com.boot.example.outputjson;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.boot.example.outputjson.OutputJsonController
 *
 * @author lipeng
 * @date 2019/1/8 上午11:28
 */
@RestController
public class OutputJsonController {

    @RequestMapping("/")
    public Output output() {
        Output output = Output.builder()
                .outputId(10001)
                .outputName("test json convert")
                .build();

        return output;
    }
}
