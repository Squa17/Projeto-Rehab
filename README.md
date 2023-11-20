<h1 align="center">

 ![RehHab](https://github.com/Squa17/Projeto-Rehab/assets/141971382/98b95bba-48d1-42e6-ba76-76aa16bd8dde)
  <p>Rehab</p>
</h1>

<h1 align="center">
  
 ![Pitch ReHab](https://github.com/Squa17/Projeto-Rehab/assets/141971382/e583ae3e-7c98-4bc2-80c5-0e10a3db940f)
  <p>Nosso SQUAD</p>
</h1>

## 🧾 Sobre o Projeto Rehab

**ReHab** - O projeto ReHab surgiu em uma união entre duas idéias de equipes diferentes, o **SQUAD 11** e o **SQUAD 17**. Voltado para pessoas reabilitadas, nosso intuito é oferecer, não somente cursos de qualificação, 
mas um direcionamento social, para essas pessoas que passaram por um momento muito delicado durante a sua trajetória, auxiliando e oferecer humanidade.

**Link do Pitch** https://www.canva.com/design/DAFz0TBioRg/FBizgTujFNVvgkCmmP1Xfw/edit?utm_content=DAFz0TBioRg&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton

## Modelagem de dados

<h1>Modelo Relacional</h1>

![WhatsApp Image 2023-11-19 at 17 16 04](https://github.com/Squa17/Projeto-Rehab/assets/141971382/d3d761f5-f203-45a4-97c0-120a8523648a)

<h1>Modelo Lógico</h1>

![WhatsApp Image 2023-11-20 at 18 40 04](https://github.com/Squa17/Projeto-Rehab/assets/141971382/75927522-0db3-4458-81e8-f69b9c6a8e11)
## Código SQL
```bash
CREATE DATABASE Rehab;
use rehab;

CREATE TABLE aluno( 
idAluno INT AUTO_INCREMENT PRIMARY KEY,
nomeAluno varchar(100) not null,
cpfAluno varchar(100) not null,
emailAluno varchar(100) not null,
telefoneAluno varchar(100) not null
);

CREATE TABLE matricula (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nomeAluno VARCHAR(255),
    telefoneAluno VARCHAR(255),
    emailAluno VARCHAR(255),
    idAluno INT,
    FOREIGN KEY (idAluno) REFERENCES aluno(idAluno)
);

CREATE TABLE instrutor (
idInstrutor INT PRIMARY KEY AUTO_INCREMENT,
nomeInstrutor VARCHAR(100)
);

CREATE TABLE curso(
idCurso INT PRIMARY KEY AUTO_INCREMENT,
idAluno INT,
FOREIGN KEY (idAluno) REFERENCES aluno(idAluno),
idInstrutor INT,
FOREIGN KEY (idInstrutor) REFERENCES instrutor(idInstrutor)
);

CREATE TABLE empresa(
idEmpresa INT PRIMARY KEY AUTO_INCREMENT,
nomeEmpresa VARCHAR(45),
cnpjEmpresa VARCHAR(14),
enderecoEmpresa VARCHAR(45),
telefoneEmpresa VARCHAR(10)
);
```
**OBSERVAÇÃO: Para esta entrega foram utilizados somente a tabela "Aluno". O Próprio Model gerou as tabelas "Empresa" e "curso"
## 🧾 Sobre a Recode Pro

**Recode Pro** - O projeto de "Programação Fullstack" oferecido pela Recode Pro visa não somente o conhecimento técnico no mundo da programação, mas também, a parceria, o trabalho em grupo e o socioemocional.
Graças a essa oportunidade, nós do SQUAD 17 podemos aplicar todo o conhecimento oferecido durante o curso em prática.

## 🔧 Ferramentas utilizadas

- Spring Tools Suite 4;
- MySQL Workbench;
- Java;
- Canva;
- Brmodelo.
