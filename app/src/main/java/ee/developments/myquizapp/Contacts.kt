package ee.developments.myquizapp

object Contacts {
    const val USER_NAME : String = "user name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    var QuizLevel: Int? = 1

    var wrongAnswersBEGINNER: Int? = 0

    fun getQuestions(): ArrayList<Questions>{
       val questionsList = ArrayList<Questions>()

        val que1 = Questions(
            1,"What country deas this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina","Austrilia",
            "Armenia","Israel"
            ,1,  "Argentina"

        )

        questionsList.add(que1)

        val que2 = Questions(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Angola", "Austria",
            "Australia", "Armenia", 3,"Austria"
        )

        questionsList.add(que2)

        // 3
        val que3 = Questions(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Belarus", "Belize",
            "Brunei", "Brazil", 4,"Brazil"
        )

        questionsList.add(que3)

        // 4
        val que4 = Questions(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas", "Belgium",
            "Barbados", "Belize", 2, "Belgium"
        )

        questionsList.add(que4)

        // 5
        val que5 = Questions(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Gabon", "France",
            "Fiji", "Finland", 3,"Fiji"
        )

        questionsList.add(que5)

        // 6
        val que6 = Questions(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany", "Georgia",
            "Greece", "none of these", 1,"Germany"
        )

        questionsList.add(que6)

        // 7
        val que7 = Questions(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Dominica", "Egypt",
            "Denmark", "Ethiopia", 3,"Denmark"
        )

        questionsList.add(que7)

        // 8
        val que8 = Questions(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Ireland", "Iran",
            "Hungary", "India", 4, "India"
        )

        questionsList.add(que8)

        // 9
        val que9 = Questions(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "New Zealand",
            "Tuvalu", "United States of America", 2, "New Zealand"
        )

        questionsList.add(que9)

        // 10
        val que10 = Questions(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1,"Kuwait"
        )

        questionsList.add(que10)


        return questionsList
    }


    fun getQuestionsAdvanced(): ArrayList<Questions>{
        val questionsListAdvanced = ArrayList<Questions>()

        //1

        val que1 = Questions(
            1,"What country deas this flag belong to?",
            R.drawable.algeria1,
            "Algeria","Australia",
            "Armenia","Israel"
            ,1
        )

        questionsListAdvanced.add(que1)

        //2

        val que2 = Questions(
            2,"What country deas this flag belong to?",
            R.drawable.angola,
            "Algeria","Jordan",
            "Angola","Kuwait"
            ,3
        )

        questionsListAdvanced.add(que2)

        //3

        val que3 = Questions(
            3,"What country deas this flag belong to?",
            R.drawable.bahrain,
            "Bahrain","Israel",
            "Denmark","Kuwait"
            ,1
        )

        questionsListAdvanced.add(que3)

        //4

        val que4 = Questions(
            4,"What country deas this flag belong to?",
            R.drawable.azerbaijan,
            "bahrain","India",
            "Greece","Azerbaijan"
            ,4
        )

        questionsListAdvanced.add(que4)
        //5

        val que5 = Questions(
            5,"What country deas this flag belong to?",
            R.drawable.bahamas,
            "Gabon","India",
            "Jordan","Bahamas"
            ,4
        )

        questionsListAdvanced.add(que5)


        // 6
        val que6 = Questions(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Gabon", "France",
            "Fiji", "Finland", 3
        )

        questionsListAdvanced.add(que6)

        // 7
        val que7 = Questions(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany", "Georgia",
            "Greece", "none of these", 1
        )

        questionsListAdvanced.add(que7)

        // 8
        val que8 = Questions(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "New Zealand",
            "Tuvalu", "United States of America", 2
        )

        questionsListAdvanced.add(que8)

        // 9
        val que9 = Questions(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )

        questionsListAdvanced.add(que9)

        // 10
        val que10 = Questions(
            10, "What country does this flag belong to?",
            R.drawable.chile,
            "Chile", "Brunei",
            "Sudan", "Hungary", 1
        )

        questionsListAdvanced.add(que10)

        // 11
        val que11 = Questions(
            11, "What country does this flag belong to?",
            R.drawable.chaina,
            "Chile", "Brunei",
            "Chaina", "Hungary", 3
        )

        questionsListAdvanced.add(que11)


        // 12
        val que12 = Questions(
            12, "What country does this flag belong to?",
            R.drawable.canada,
            "Denmark", "Israel",
            "Canada", "Hungary", 3
        )

        questionsListAdvanced.add(que12)

        // 13
        val que13 = Questions(
            13, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Belarus", "Belize",
            "Brunei", "Brazil", 4
        )

        questionsListAdvanced.add(que13)

        // 14
        val que14 = Questions(
            14, "What country does this flag belong to?",
            R.drawable.barbados,
            "Belgium", "Belize",
            "Barbados", "None of these", 3
        )

        questionsListAdvanced.add(que14)

        // 15
        val que15 = Questions(
            15, "What country does this flag belong to?",
            R.drawable.bangladesh,
            "Bangladesh", "Belize",
            "Barbados", "None of these", 1
        )

        questionsListAdvanced.add(que15)



        return questionsListAdvanced
    }
    fun getQuestionsProfessional(): ArrayList<Questions> {

        val questionsListProfessioanl = ArrayList<Questions>()

        //1

        val que1 = Questions(
            1,"What country deas this flag belong to?",
            R.drawable.gambia,
            "Gambia","Australia",
            "Sweden","Israel"
            ,1
        )

        questionsListProfessioanl.add(que1)

        //2

        val que2 = Questions(
            2,"What country deas this flag belong to?",
            R.drawable.georgia,
            "Gambia","georgia",
            "Non","Israel"
            ,2
        )

        questionsListProfessioanl.add(que2)

        //3

        val que3 = Questions(
            3,"What country deas this flag belong to?",
            R.drawable.ghana,
            "Gambia","georgia",
            "Ghana","Israel"
            ,3
        )

        questionsListProfessioanl.add(que3)

        // 4
        val que4 = Questions(
            4, "What country does this flag belong to?",
            R.drawable.barbados,
            "Belgium", "Belize",
            "Barbados", "None of these", 3
        )

        questionsListProfessioanl.add(que4)

        // 5
        val que5 = Questions(
            5, "What country does this flag belong to?",
            R.drawable.bangladesh,
            "Bangladesh", "Belize",
            "Barbados", "None of these", 1
        )

        questionsListProfessioanl.add(que5)

        //6
        val que6 = Questions(
            6,"What country deas this flag belong to?",
            R.drawable.bahamas,
            "Gabon","India",
            "Jordan","Bahamas"
            ,4
        )

        questionsListProfessioanl.add(que6)


        // 7
        val que7 = Questions(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Gabon", "France",
            "Fiji", "Finland", 3
        )

        questionsListProfessioanl.add(que7)

        // 8
        val que8 = Questions(
            8, "What country does this flag belong to?",
            R.drawable.grenada,
            "Grenada", "Belize",
            "Fiji", "Finland", 1
        )

        questionsListProfessioanl.add(que8)

        // 9
        val que9 = Questions(
            9, "What country does this flag belong to?",
            R.drawable.guatemala,
            "Argentina", "Guatemala",
            "Belgium", "Finland", 2
        )

        questionsListProfessioanl.add(que9)

        // 10
        val que10 = Questions(
            10, "What country does this flag belong to?",
            R.drawable.guinea,
            "Haiti", "Guatemala",
            "Guinea", "Greece", 3
        )

        questionsListProfessioanl.add(que10)

        // 11
        val que11 = Questions(
            11, "What country does this flag belong to?",
            R.drawable.guineabissau,
            "Guinea-Bissau", "Guatemala",
            "Finland", "Guinea", 1
        )

        questionsListProfessioanl.add(que11)

        // 12
        val que12 = Questions(
            12, "What country does this flag belong to?",
            R.drawable.guyana,
            "Guinea-Bissau", "Guatemala",
            "Guyana", "Guinea", 3
        )

        questionsListProfessioanl.add(que12)

        // 13
        val que13 = Questions(
            13, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Dominica", "Egypt",
            "Denmark", "Ethiopia", 3
        )

        questionsListProfessioanl.add(que13)

        // 14
        val que14 = Questions(
            14, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Ireland", "Iran",
            "Hungary", "India", 4
        )

        questionsListProfessioanl.add(que14)

        // 15
        val que15 = Questions(
            15, "What country does this flag belong to?",
            R.drawable.iraq,
            "Iraq", "Iran",
            "Sudan", "India", 1
        )

        questionsListProfessioanl.add(que15)

        // 16
        val que16 = Questions(
            16, "What country does this flag belong to?",
            R.drawable.kazakhstan,
            "Japan", "kazakhstan",
            "Sudan", "India", 2
        )

        questionsListProfessioanl.add(que16)

        // 17
        val que17 = Questions(
            17, "What country does this flag belong to?",
            R.drawable.kyrgyzstan,
            "Japan", "kazakhstan",
            "Sudan", "Kyrgyzstan", 4
        )

        questionsListProfessioanl.add(que17)

        // 18
        val que18 = Questions(
            18, "What country does this flag belong to?",
            R.drawable.lebanon,
            "Latvia", "Lebanon",
            "Laos", "Kyrgyzstan", 2
        )

        questionsListProfessioanl.add(que18)

        // 19
        val que19 = Questions(
            19, "What country does this flag belong to?",
            R.drawable.liberia,
            "Latvia", "Liberia",
            "Laos", "Kyrgyzstan", 2
        )

        questionsListProfessioanl.add(que19)

        // 20
        val que20 = Questions(
            20, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Gabon", "France",
            "Fiji", "Finland", 3
        )

        questionsListProfessioanl.add(que20)

        return questionsListProfessioanl
    }
}