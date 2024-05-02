package com.turing.api.player.service;


import com.turing.api.player.model.PlayerDto;
import com.turing.api.player.repository.PlayerRepository;
import com.turing.api.team.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {

    private final PlayerRepository playerRepository;
    private final TeamRepository teamRepository;



}
