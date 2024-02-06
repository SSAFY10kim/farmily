package com.ssafy.farmily.dto;

import java.lang.annotation.Target;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class GetInventoryResponseDto {
	private List<FamilyItemDto> familyItemList;
	private List<FamilyInventoryRecordResponseDtoInterface> recordFruitList;
}
