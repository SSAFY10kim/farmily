package com.ssafy.farmily.dto;

import java.time.format.DateTimeFormatter;

import org.springframework.beans.BeanUtils;

import com.ssafy.farmily.entity.CommunityPost;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CommunityPostDetailDto {
	String title;
	String content;
	String author;
	ImageDto treeImage;
	String createdAt;

	public static CommunityPostDetailDto from(CommunityPost communityPost) {
		CommunityPostDetailDto postDetailDto = new CommunityPostDetailDto();
		BeanUtils.copyProperties(communityPost, postDetailDto);
		postDetailDto.setAuthor(communityPost.getAuthor().getNickname());
		ImageDto treeSnapshot = ImageDto.from(communityPost.getTreeImage());
		postDetailDto.setTreeImage(treeSnapshot);
		postDetailDto.setCreatedAt(communityPost.getCreatedAt().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
		return postDetailDto;
	}
}
