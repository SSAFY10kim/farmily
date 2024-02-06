package com.ssafy.farmily.dto;

import org.springframework.web.multipart.MultipartFile;

import com.ssafy.farmily.entity.Image;
import com.ssafy.farmily.entity.Member;
import com.ssafy.farmily.entity.Sprint;
import com.ssafy.farmily.type.FileCategory;
import com.ssafy.farmily.validation.annotation.AllowedFileCategories;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class InsertCommunityPostRequestDto {
	@NotNull
	String title;

	@NotNull
	String content;

	@NotNull
	@AllowedFileCategories(categories = FileCategory.IMAGE)
	MultipartFile treeSnapshot;
}
