package com.turing.api.player;


import com.turing.api.player.model.Player;
import com.turing.api.player.model.PlayerDto;
import com.turing.api.player.service.PlayerService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ApiResponses({
        @ApiResponse(responseCode = "400", description = "BAD REQUEST"),
        @ApiResponse(responseCode = "404", description = "NOT FOUND"),
        @ApiResponse(responseCode = "200", description = "SUCCESS"),
})
@RequiredArgsConstructor
@RequestMapping("/api/soccers")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Slf4j
public class PlayerController {

    private final PlayerService service;

    @GetMapping( "/position-list")
    public ResponseEntity<List<PlayerDto>> soccer2() {
        log.info("입력받은 정보 : {}");
        return ResponseEntity.ok(service.findAllPosition());
    }

    @GetMapping( "/position-list-includeNull")
    public ResponseEntity<List<PlayerDto>> soccer3() {
        log.info("입력받은 정보 : {}");
        return ResponseEntity.ok(service.findAllPositionincludeNull());
    }

    @GetMapping( "/findGK-SuwonTeamId")
    public ResponseEntity<List<PlayerDto>> soccer4() {
        log.info("입력받은 정보 : {}");
        return ResponseEntity.ok(service.findAllByPositionAndTeamID());
    }

    @GetMapping( "/findGK-SuwonTeamName")
    public ResponseEntity<List<PlayerDto>> soccer41() {
        log.info("입력받은 정보 : {}");
        return ResponseEntity.ok(service.findAllByPositionAndTeamName());
    }

    @GetMapping( "/soccer05")
    public ResponseEntity<List<PlayerDto>> soccer5() {
        log.info("입력받은 정보 : {}");
        return ResponseEntity.ok(service.findAllByPlayerNameAndHeight());
    }


}
