package com.TrungTinhFullStack.Backend_Java.Dto;

import java.util.List;

public record MoviePageResponse(List<MovieDto> movieDtos,
                                Integer pageNumber,
                                Integer pageSize,
                                Long totalElements,
                                Long totalPages,
                                boolean isLast) {


}
