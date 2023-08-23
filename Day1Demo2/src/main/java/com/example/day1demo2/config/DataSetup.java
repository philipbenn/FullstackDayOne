package com.example.day1demo2.config;

import com.example.day1demo2.entity.Player;
import com.example.day1demo2.repository.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DataSetup implements ApplicationRunner {

    PlayerRepo playerRepository;

    public DataSetup(PlayerRepo playerRepository) {
        this.playerRepository = playerRepository;
    }

        @Override
        public void run(ApplicationArguments args) throws Exception {
            List<Player> players = new ArrayList<>();
            players.add(new Player("Lionel Messi", "Argentina", "Forward"));
            players.add(new Player("Cristiano Ronaldo", "Portugal", "Forward"));
            players.add(new Player("Neymar Jr.", "Brazil", "Forward"));
            players.add(new Player("Kylian Mbappé", "France", "Forward"));
            players.add(new Player("Luka Modrić", "Croatia", "Midfielder"));
            players.add(new Player("Harry Kane", "England", "Forward"));
            players.add(new Player("Antoine Griezmann", "France", "Forward"));
            players.add(new Player("Eden Hazard", "Belgium", "Forward"));
            players.add(new Player("Philippe Coutinho", "Brazil", "Midfielder"));
            players.add(new Player("Kevin De Bruyne", "Belgium", "Midfielder"));
            players.add(new Player("Raphaël Varane", "France", "Defender"));
            players.add(new Player("Toni Kroos", "Germany", "Midfielder"));
            players.add(new Player("Sergio Ramos", "Spain", "Defender"));
            players.add(new Player("Luis Suárez", "Uruguay", "Forward"));
            players.add(new Player("Edinson Cavani", "Uruguay", "Forward"));
            players.add(new Player("Thiago Silva", "Brazil", "Defender"));
            players.add(new Player("N'Golo Kanté", "France", "Midfielder"));
            players.add(new Player("Cristian Pavón", "Argentina", "Forward"));
            players.add(new Player("Marcelo", "Brazil", "Defender"));
            players.add(new Player("Paul Pogba", "France", "Midfielder"));
            players.add(new Player("Isco", "Spain", "Midfielder"));
            players.add(new Player("Romelu Lukaku", "Belgium", "Forward"));
            players.add(new Player("Mohamed Salah", "Egypt", "Forward"));
            players.add(new Player("Dele Alli", "England", "Midfielder"));
            players.add(new Player("Ivan Perišić", "Croatia", "Midfielder"));
            playerRepository.saveAll(players);
        }
    }
