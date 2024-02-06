package com.ssafy.farmily.type;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Item {
	TREE_1(ItemType.TREE_SKIN),
	TREE_2(ItemType.TREE_SKIN),
	TREE_3(ItemType.TREE_SKIN),
	TREE_4(ItemType.TREE_SKIN),
	TREE_5(ItemType.TREE_SKIN),
	TREE_6(ItemType.TREE_SKIN),
	TREE_7(ItemType.TREE_SKIN),
	TREE_8(ItemType.TREE_SKIN),
	TREE_9(ItemType.TREE_SKIN),
	TREE_10(ItemType.TREE_SKIN),


	ALPHABET_A(ItemType.ACCESSORY),
	ALPHABET_B(ItemType.ACCESSORY),
	ALPHABET_C(ItemType.ACCESSORY),
	ALPHABET_D(ItemType.ACCESSORY),
	ALPHABET_E(ItemType.ACCESSORY),
	ALPHABET_F(ItemType.ACCESSORY),
	ALPHABET_G(ItemType.ACCESSORY),
	ALPHABET_H(ItemType.ACCESSORY),
	ALPHABET_I(ItemType.ACCESSORY),
	ALPHABET_J(ItemType.ACCESSORY),
	ALPHABET_K(ItemType.ACCESSORY),
	ALPHABET_L(ItemType.ACCESSORY),
	ALPHABET_M(ItemType.ACCESSORY),
	ALPHABET_N(ItemType.ACCESSORY),
	ALPHABET_O(ItemType.ACCESSORY),
	ALPHABET_P(ItemType.ACCESSORY),
	ALPHABET_Q(ItemType.ACCESSORY),
	ALPHABET_R(ItemType.ACCESSORY),
	ALPHABET_S(ItemType.ACCESSORY),
	ALPHABET_T(ItemType.ACCESSORY),
	ALPHABET_U(ItemType.ACCESSORY),
	ALPHABET_V(ItemType.ACCESSORY),
	ALPHABET_W(ItemType.ACCESSORY),
	ALPHABET_X(ItemType.ACCESSORY),
	ALPHABET_Y(ItemType.ACCESSORY),
	ALPHABET_Z(ItemType.ACCESSORY),
	RING(ItemType.ACCESSORY),
	NECKLACE(ItemType.ACCESSORY),
	STAR(ItemType.ACCESSORY);

	@NonNull
	private final ItemType type;
}