package com.likelion.likelionSwagger.post.api;

import com.likelion.likelionSwagger.common.template.ApiResTemplate;
import com.likelion.likelionSwagger.post.api.dto.request.PostSaveRequestDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Tag(name = "포스트 API", description = "포스트 관리 API")
@RequestMapping("/post")
public interface PostApi {

    @Operation(summary = "포스트 저장", description = "포스트를 저장합니다.")
    @PostMapping("/save")
    ApiResTemplate<String> postSave(@RequestBody @Valid PostSaveRequestDto postSaveRequestDto,
                                    Principal principal);
}
