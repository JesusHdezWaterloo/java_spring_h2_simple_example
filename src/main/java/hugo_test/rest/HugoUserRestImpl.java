/*
 * Copyright 2022 Root101 (jhernandezb96@gmail.com, +53-5-426-8660).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Or read it directly from LICENCE.txt file at the root of this project.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package hugo_test.rest;

import hugo_test.domain.Domains.*;
import hugo_test.entities.HugoUser;
import hugo_test.use_case.HugoUserUC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
@RestController
@RequestMapping(value = "/user")
public class HugoUserRestImpl implements HugoUserRest {

    @Autowired
    private HugoUserUC userUC;

    @GetMapping("/all")
    @Override
    public Iterable<HugoUser> findAllUsers() {
        return userUC.findAllUsers();
    }

    @PostMapping("/create")
    @Override
    public HugoCreatedUser createUser(@RequestBody HugoNewUser nweUser) {
        return userUC.createUser(nweUser);
    }
}
