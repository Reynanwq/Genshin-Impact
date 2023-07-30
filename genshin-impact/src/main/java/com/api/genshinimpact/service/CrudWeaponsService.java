package com.api.genshinimpact.service;

import com.api.genshinimpact.arm.Weapons;
import com.api.genshinimpact.repository.WeaponsRepository;
import org.springframework.stereotype.Service;

@Service
public class CrudWeaponsService {
    private WeaponsRepository weaponsRepository;
    public CrudWeaponsService(WeaponsRepository weaponsRepository){
        this.weaponsRepository = weaponsRepository;
    }
    public void insertData(){
        Weapons agitação_trovejante = new Weapons(1, "Agitação Trovejante", "Arco", "Um arco longo que foi dado a alguém pela Shogun. Ele emite raios que nunca se apagam.", 46, 0, 14, 1, 0, 5);
        Weapons aqua_simulacra = new Weapons(2, "Aqua Simulacra", "Arco", "A cor desse arco longo muda imprevisivelmente. Sob a luz, possui um brilho azulado como água.", 44, 0, 19, 1, 0, 5);
       /* Weapons weapons0 = new Weapons(3, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(4, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(5, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(6, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(7, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(8, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(9, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(10, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(11, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(12, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(13, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(14, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(15, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(16, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(17, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(18, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(19, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(20, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(21, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(22, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(23, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(24, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(25, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(26, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(27, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(28, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(29, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(30, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(31, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(32, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(33, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(34, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(35, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(36, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(37, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(38, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(39, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(40, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(41, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(42, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(43, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(44, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(45, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(46, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(47, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(48, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(49, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(50, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(51, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(52, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(53, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(54, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(55, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(56, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(57, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(58, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(59, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(60, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(61, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(62, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(63, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(64, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(65, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(66, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(67, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(68, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(69, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(70, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(71, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(72, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(73, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(74, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(75, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(76, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(77, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(78, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(79, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(80, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(81, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(82, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(83, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(84, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(85, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(86, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(87, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(88, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(89, "", "", "", 0, 0, 0, 0, 0, 0);
        Weapons weapons0 = new Weapons(90, "", "", "", 0, 0, 0, 0, 0, 0);*/

        this.weaponsRepository.save(agitação_trovejante);
        this.weaponsRepository.save(aqua_simulacra);
        System.out.println("Save weapons in database");
    }

    //----------- SELECIONAR DADOS DA TABELA WEAPONS ------
    public void selectData(){
        Iterable<Weapons> weapons = this.weaponsRepository.findAll();
        for(Weapons weapon : weapons){
            System.out.println(weapon);
        }
    }
}
