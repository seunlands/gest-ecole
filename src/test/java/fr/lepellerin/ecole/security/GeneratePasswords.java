/*
   Copyright (C)  Seun Landsberg 2016

   This program is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program; if not, see <http://www.gnu.org/licenses/>.
*/


package fr.lepellerin.ecole.security;

import java.util.Scanner;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class GeneratePasswords {

  /**
   * methode de generation de hash de mot de passe.
   * @param args : arguments
   */
  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);
    System.out.println("Entrez mot de passe : ");
    String password = reader.nextLine();
    reader.close();
    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(11);
    String hashedPassword = passwordEncoder.encode(password);

    System.out.println(password + " -> " + hashedPassword);

  }

}
