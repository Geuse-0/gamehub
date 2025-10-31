package com.insy2s.gamehub.mapper;

import com.insy2s.gamehub.dto.request.GameCreatRequest;
import com.insy2s.gamehub.dto.request.GameUpdateRequest;
import com.insy2s.gamehub.dto.response.GameDetailResponse;
import com.insy2s.gamehub.dto.response.GameSummaryResponse;
import com.insy2s.gamehub.model.Game;
import org.mapstruct.*;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface GameMapper {
    GameDetailResponse toDetailResponse(Game entity);
    GameSummaryResponse toSummaryResponse(Game entity);
    Game toGame(GameCreatRequest gameCreatRequest);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
   void toGame(GameUpdateRequest request, @MappingTarget Game game);
}
