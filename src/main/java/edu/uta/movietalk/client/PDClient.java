package edu.uta.movietalk.client;

import edu.uta.movietalk.entity.ParallelDotAbuse;
import feign.Body;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

/**
 * @author hxy
 */
public interface PDClient {


    /**
     * @param apiKey apiKey
     * @param text to be check
     * @return ParallelDotAbuse
     */
    @RequestLine("POST /v4/abuse")
    @Headers("Content-Type: application/x-www-form-urlencoded")
    @Body("api_key={api_key}&text={text}")
    ParallelDotAbuse postEmotion(@Param("api_key") String apiKey, @Param("text") String text);
}
