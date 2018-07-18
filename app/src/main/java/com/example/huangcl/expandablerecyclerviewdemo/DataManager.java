package com.example.huangcl.expandablerecyclerviewdemo;

import java.util.Arrays;
import java.util.List;

public class DataManager {

    public static List<GroupModel> makeEcdGroups() {
        return Arrays.asList(makeEcdGroup1(),makeEcdGroup2());
    }

    public static List<GroupModel> makeRecruitGroups() {
        return Arrays.asList(makeRecruitGroup1(),
                makeRecruitGroup2(),
                makeRecruitGroup3(),
                makeRecruitGroup4());
    }

    public static List<GroupModel> makeCardGroups() {
        return Arrays.asList(makeCardGroup1(),
                makeCardGroup2(),
                makeCardGroup3(),
                makeCardGroup4());
    }

    public static List<GroupModel> makeTransGroups() {
        return Arrays.asList(makeTransGroup1());
    }

    public static GroupModel makeEcdGroup1() {
        return new GroupModel("What is Ecdlifes?", makeEcdGroup1Child());
    }

    public static List<ChildModel> makeEcdGroup1Child() {
        ChildModel child = new ChildModel("fnogangrrognr giro angoroein aegirneagrgno ngreng rengkregnerlngf nogangrrognr giro angoroein aegirneagrgno ngreng rengkregnerlng");
        return Arrays.asList(child);
    }

    public static GroupModel makeEcdGroup2() {
        return new GroupModel("How much to charge on using Ecdlifes service?", makeEcdGroup2Child());
    }

    public static List<ChildModel> makeEcdGroup2Child() {
        ChildModel child = new ChildModel("fnogangrrognr giro angoroein aegirneagrgno ngreng rengkregnerlngf nogangrrognr giro angoroein aegirneagrgno ngreng rengkregnerlng");
        return Arrays.asList(child);
    }

    public static GroupModel makeRecruitGroup1() {
        return new GroupModel("What is Easy Recruit Service?", makeEcdGroup1Child());
    }

    public static List<ChildModel> makeRecruitGroup1Child() {
        ChildModel child = new ChildModel("fnogangrrognr giro angoroein aegirneagrgno ngreng rengkregnerlngf nogangrrognr giro angoroein aegirneagrgno ngreng rengkregnerlng");
        return Arrays.asList(child);
    }

    public static GroupModel makeRecruitGroup2() {
        return new GroupModel("How can I post a job or how can I update my CV?", makeEcdGroup2Child());
    }

    public static List<ChildModel> makeRecruitGroup2Child() {
        ChildModel child = new ChildModel("fnogangrrognr giro angoroein aegirneagrgno ngreng rengkregnerlngf nogangrrognr giro angoroein aegirneagrgno ngreng rengkregnerlng");
        return Arrays.asList(child);
    }

    public static GroupModel makeRecruitGroup3() {
        return new GroupModel("How can I connect employers or helpers?", makeEcdGroup1Child());
    }

    public static List<ChildModel> makeRecruitGroup3Child() {
        ChildModel child = new ChildModel("fnogangrrognr giro angoroein aegirneagrgno ngreng rengkregnerlngf nogangrrognr giro angoroein aegirneagrgno ngreng rengkregnerlng");
        return Arrays.asList(child);
    }

    public static GroupModel makeRecruitGroup4() {
        return new GroupModel("How can I hire the helper?", makeEcdGroup2Child());
    }

    public static List<ChildModel> makeRecruitGroup4Child() {
        ChildModel child = new ChildModel("fnogangrrognr giro angoroein aegirneagrgno ngreng rengkregnerlngf nogangrrognr giro angoroein aegirneagrgno ngreng rengkregnerlng");
        return Arrays.asList(child);
    }

    public static GroupModel makeCardGroup1() {
        return new GroupModel("What is Easy Card?", makeEcdGroup1Child());
    }

    public static List<ChildModel> makeCardGroup1Child() {
        ChildModel child = new ChildModel("fnogangrrognr giro angoroein aegirneagrgno ngreng rengkregnerlngf nogangrrognr giro angoroein aegirneagrgno ngreng rengkregnerlng");
        return Arrays.asList(child);
    }

    public static GroupModel makeCardGroup2() {
        return new GroupModel("What can I do in Ecdlifes?", makeEcdGroup2Child());
    }

    public static List<ChildModel> makeCardGroup2Child() {
        ChildModel child = new ChildModel("fnogangrrognr giro angoroein aegirneagrgno ngreng rengkregnerlngf nogangrrognr giro angoroein aegirneagrgno ngreng rengkregnerlng");
        return Arrays.asList(child);
    }

    public static GroupModel makeCardGroup3() {
        return new GroupModel("How can I top up Easy Card?", makeEcdGroup1Child());
    }

    public static List<ChildModel> makeCardGroup3Child() {
        ChildModel child = new ChildModel("fnogangrrognr giro angoroein aegirneagrgno ngreng rengkregnerlngf nogangrrognr giro angoroein aegirneagrgno ngreng rengkregnerlng");
        return Arrays.asList(child);
    }

    public static GroupModel makeCardGroup4() {
        return new GroupModel("If I lost my card with some reason,what can I do?", makeEcdGroup2Child());
    }

    public static List<ChildModel> makeCardGroup4Child() {
        ChildModel child = new ChildModel("fnogangrrognr giro angoroein aegirneagrgno ngreng rengkregnerlngf nogangrrognr giro angoroein aegirneagrgno ngreng rengkregnerlng");
        return Arrays.asList(child);
    }

    public static GroupModel makeTransGroup1() {
        return new GroupModel("What is translator?", makeEcdGroup1Child());
    }

    public static List<ChildModel> makeTransGroup1Child() {
        ChildModel child = new ChildModel("fnogangrrognr giro angoroein aegirneagrgno ngreng rengkregnerlngf nogangrrognr giro angoroein aegirneagrgno ngreng rengkregnerlng");
        return Arrays.asList(child);
    }
}