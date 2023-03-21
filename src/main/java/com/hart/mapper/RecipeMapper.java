package com.hart.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hart.domain.RecipeContentVO;
import com.hart.domain.RecipeVO;

@Mapper
public interface RecipeMapper {

	public List<RecipeVO> recipelist();

	RecipeVO recipeDetail(String rid);
	
	List<RecipeContentVO> RecipeContent(String rid);

}
