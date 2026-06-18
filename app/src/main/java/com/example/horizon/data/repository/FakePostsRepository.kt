package com.example.horizon.data.repository

import com.example.horizon.data.model.Post
import com.example.horizon.R
import com.example.horizon.data.model.Category

class FakePostsRepository : PostsRepository {
    private val posts = listOf<Post>(
        Post(
            id = "1",
            title = "The Future of Space Telescopes",
            author = "Sophia Bennett",
            content =
                "For centuries, astronomers have searched the night sky with increasingly powerful instruments. Today, space telescopes are transforming that search by observing the universe from above Earth’s atmosphere, where light is clearer and less distorted.\n\n" +
                "Modern telescopes can detect objects billions of light-years away, allowing scientists to study galaxies formed shortly after the Big Bang. They also analyze the atmospheres of distant exoplanets, searching for signs of water, oxygen, or other clues that could point to habitable worlds.\n\n" +
                "One major advantage of space telescopes is their ability to observe wavelengths of light that never reach Earth’s surface. Infrared, ultraviolet, and X-ray observations reveal details that ground-based telescopes often miss, from star formation to the behavior of black holes.\n\n" +
                "Future missions aim to push these capabilities even further. Engineers are designing larger mirrors, more sensitive detectors, and advanced systems that can block starlight to directly image planets around other stars.\n\n" +
                "Beyond scientific discoveries, future space telescopes will improve our ability to map distant galaxies, study planetary systems, and gather data that may guide research for decades to come.\n\n",
            imageRes = R.drawable.science_1,
            category = Category.SCIENCE,
            summary = "New generations of telescopes are helping scientists observe the universe in unprecedented detail.",
            readTimeMinutes = 6,
            publishDate = "July 2026",
        ),

        Post(
            id = "2",
            title = "The House of Wisdom in Baghdad",
            summary = "The famous Abbasid-era institution became a center for learning, translation, and scientific advancement.",
            author = "Sophia Bennett",
            content =
                "During the Abbasid Caliphate, Baghdad became one of the world's leading centers of knowledge and scholarship. At the heart of this intellectual movement was the House of Wisdom, known in Arabic as Bayt al-Hikma.\n\n" +
                "Established during the eighth and ninth centuries, the institution brought together scholars from different cultures and backgrounds. Their work included translating scientific, philosophical, and mathematical texts from Greek, Persian, and Indian sources into Arabic.\n\n" +
                "The House of Wisdom was more than a library. It served as a place where scholars studied astronomy, medicine, mathematics, and engineering. Researchers expanded upon existing knowledge and produced original discoveries that influenced later generations.\n\n" +
                "Many important advances in mathematics and astronomy were made during this period. Scholars developed improved methods for calculation, observation, and scientific inquiry, helping preserve and expand knowledge from earlier civilizations.\n\n" +
                "Although the institution eventually disappeared, its legacy remains significant. The House of Wisdom represents a period when learning, curiosity, and international exchange played a major role in shaping human progress.\n\n",
            imageRes = R.drawable.history_1,
            category = Category.HISTORY,
            readTimeMinutes = 6,
            publishDate = "July 2026"
        ),

        Post(
            id = "3",
            title = "Exploring the Norwegian Fjords",
            summary = "Norway's famous fjords combine dramatic landscapes, quiet villages, and centuries of natural history.",
            author = "Sophia Bennett",
            content =
                "Norway's fjords are among the most recognizable natural landscapes in the world. These deep, narrow waterways were formed over thousands of years as glaciers carved through mountains and valleys.\n\n" +
                "Travelers visiting the fjords are often greeted by steep cliffs, cascading waterfalls, and calm waters that reflect the surrounding scenery. The combination creates views that feel both peaceful and dramatic.\n\n" +
                "Many small towns and villages are located along the fjords. These communities have adapted to the region's geography and often maintain traditions connected to fishing, farming, and maritime travel.\n\n" +
                "Outdoor activities are a major part of the fjord experience. Hiking trails, boat tours, kayaking, and scenic railways allow visitors to explore the landscape from different perspectives.\n\n" +
                "The Norwegian fjords demonstrate how geography can shape both nature and human life. Their beauty continues to attract visitors from around the world while reminding travelers of the power of natural forces.\n\n",
            imageRes = R.drawable.travel_1,
            category = Category.TRAVEL,
            readTimeMinutes = 6,
            publishDate = "July 2026"
        ),

        Post(
            id = "4",
            title = "The Hidden Meanings Behind Famous Symbols",
            summary = "Many well-known symbols around the world carry deep cultural and historical meanings.",
            author = "Sophia Bennett",
            content =
                "Symbols are a powerful way humans communicate ideas without words. Across different cultures, symbols carry meanings shaped by history, religion, and tradition.\n\n" +
                "For example, the olive branch is widely associated with peace, while the lotus flower represents purity and spiritual growth in several Eastern traditions.\n\n" +
                "The crescent moon and star, often seen in flags and architecture, have historical connections that vary across regions and time periods.\n\n" +
                "Even colors can act as symbols. White may represent purity in some cultures, while in others it is associated with mourning or remembrance.\n\n" +
                "Understanding symbols helps us better appreciate how cultures express identity and values in simple but powerful visual forms.\n\n",
            imageRes = R.drawable.culture_1,
            category = Category.CULTURE,
            readTimeMinutes = 5,
            publishDate = "June 2026"
        ),

        Post(
            id = "5",
            title = "How Smartphones Changed Everyday Life",
            summary = "Smartphones have transformed communication, work, entertainment, and daily habits worldwide.",
            author = "Sophia Bennett",
            content =
                "Smartphones have become one of the most influential technologies in modern life. They combine communication, computing, and entertainment into a single portable device.\n\n" +
                "Before smartphones, people relied on separate devices for calls, messages, cameras, and navigation. Today, all of these functions are integrated into one system.\n\n" +
                "Mobile applications have changed how people work, learn, and interact. Tasks such as banking, shopping, and studying can now be done from anywhere.\n\n" +
                "Smartphones have also influenced social behavior, creating new ways of staying connected while also raising concerns about screen time and digital balance.\n\n" +
                "Overall, smartphones have reshaped daily life by making information and communication more accessible than ever before.\n\n",
            imageRes = R.drawable.tech_1,
            category = Category.TECHNOLOGY,
            readTimeMinutes = 5,
            publishDate = "July 2026"
        ),

        Post(
            id = "6",
            title = "How Deep-Sea Exploration Reveals New Species",
            author = "Daniel Brooks",
            content =
                "The deep ocean is one of the least explored regions on Earth. Sunlight disappears within the first few hundred meters, yet life continues far below in darkness, high pressure, and cold temperatures.\n\n" +
                "Scientists now use remotely operated vehicles and autonomous submarines to reach depths that were once impossible to explore. These machines capture high-resolution video, collect samples, and map underwater landscapes with remarkable precision.\n\n" +
                "Discoveries from deep-sea missions often surprise researchers. New species of fish, crustaceans, jellyfish, and microorganisms are regularly identified, many with unusual adaptations such as bioluminescence, transparent bodies, or heat-resistant biology near hydrothermal vents.\n\n" +
                "These organisms help scientists understand how life can survive in extreme environments. Some discoveries may even inspire advances in medicine, materials science, and biotechnology.\n\n" +
                "Deep-sea exploration also reminds us how much of our own planet remains unknown. Despite centuries of scientific progress, the ocean still holds mysteries comparable to those of outer space.\n\n",
            imageRes = R.drawable.science_2,
            category = Category.SCIENCE,
            summary = "Advanced underwater vehicles are helping scientists discover life forms hidden in the deepest parts of the ocean.",
            readTimeMinutes = 5,
            publishDate = "June 2026",
        ),

        Post(
            id = "7",
            title = "The Engineering Behind Historic Islamic Mosques",
            summary = "Historic mosques demonstrate remarkable architectural and engineering achievements that continue to inspire today.",
            author = "Daniel Brooks",
            content =
                "Many historic Islamic mosques are admired not only for their beauty but also for the engineering knowledge required to build them. Architects developed innovative techniques to create large, open spaces without modern construction equipment.\n\n" +
                "Domes became one of the most recognizable features of mosque architecture. Engineers carefully distributed weight through arches, columns, and supporting structures to create stable and visually impressive buildings.\n\n" +
                "Courtyards, minarets, and decorative geometric patterns were designed with both practical and aesthetic purposes in mind. These elements helped improve ventilation, lighting, and the overall experience of visitors.\n\n" +
                "Builders often used local materials such as stone, brick, and wood while adapting designs to different climates and environments. This allowed mosque architecture to develop unique regional styles across the Islamic world.\n\n" +
                "Today, many of these historic structures remain standing centuries after their construction. Their durability demonstrates the advanced engineering principles and craftsmanship of the people who built them.\n\n",
            imageRes = R.drawable.history_2,
            category = Category.HISTORY,
            readTimeMinutes = 5,
            publishDate = "June 2026"
        ),

        Post(
            id = "8",
            title = "Exploring Andalusia: Where Cultures Met",
            summary = "Southern Spain reflects centuries of cultural exchange through its architecture, cities, and traditions.",
            author = "Daniel Brooks",
            content =
                "Andalusia, located in southern Spain, is known for its rich history and distinctive cultural heritage. Over centuries, different civilizations left lasting influences on the region's architecture, language, and traditions.\n\n" +
                "Cities such as Granada, Córdoba, and Seville contain landmarks that showcase remarkable artistic and architectural achievements. Visitors can explore historic streets, courtyards, and monuments that reflect diverse cultural influences.\n\n" +
                "The region's architecture is especially admired for its decorative details, geometric designs, and carefully planned public spaces. Many historic buildings continue to attract scholars, photographers, and travelers.\n\n" +
                "Beyond its landmarks, Andalusia is also known for music, food, and local traditions that remain important parts of daily life. Markets, festivals, and community gatherings provide visitors with opportunities to experience local culture.\n\n" +
                "Today, Andalusia serves as a reminder of how cultural exchange can shape a region over time, creating a unique identity that continues to attract people from around the world.\n\n",
            imageRes = R.drawable.travel_2,
            category = Category.TRAVEL,
            readTimeMinutes = 7,
            publishDate = "June 2026"
        ),

        Post(
            id = "9",
            title = "The Stories Behind Famous Traditional Foods",
            summary = "Traditional dishes often carry centuries of history, culture, and local identity.",
            author = "Daniel Brooks",
            content =
                "Food is one of the most direct expressions of culture. Traditional dishes often tell stories about geography, history, and community life.\n\n" +
                "Many recipes were created based on locally available ingredients, which is why cuisines differ so much from region to region.\n\n" +
                "Some traditional foods were originally prepared for festivals or special occasions, gradually becoming part of everyday life over time.\n\n" +
                "Cooking methods and recipes are often passed down through generations, preserving cultural identity even as societies change.\n\n" +
                "Exploring traditional foods gives us insight into how people live, celebrate, and connect with their heritage.\n\n",
            imageRes = R.drawable.culture_2,
            category = Category.CULTURE,
            readTimeMinutes = 4,
            publishDate = "May 2026"
        ),

        Post(
            id = "10",
            title = "How Recommendation Algorithms Shape What We Watch",
            summary = "Algorithms influence the videos, posts, and content people see every day online.",
            author = "Daniel Brooks",
            content =
                "Recommendation algorithms are systems used by platforms to suggest content based on user behavior. They analyze what people watch, like, and interact with.\n\n" +
                "These systems are designed to improve user experience by showing content that is more likely to be relevant or interesting.\n\n" +
                "However, they also influence what people spend time on, sometimes shaping opinions and preferences without users realizing it.\n\n" +
                "Different platforms use different models, but most rely on machine learning to continuously improve recommendations over time.\n\n" +
                "Understanding how these systems work helps users become more aware of how digital content is selected and presented to them.\n\n",
            imageRes = R.drawable.tech_2,
            category = Category.TECHNOLOGY,
            readTimeMinutes = 6,
            publishDate = "June 2026"
        ),

        Post(
            id = "11",
            title = "The Search for Habitable Exoplanets",
            author = "Emma Wilson",
            content =
                "Thousands of planets beyond our solar system have been discovered in recent decades. These exoplanets vary dramatically in size, temperature, and composition, from giant gas worlds to rocky planets similar to Earth.\n\n" +
                "Scientists focus especially on planets located in the “habitable zone” around their stars, where temperatures may allow liquid water to exist. Water is considered one of the key ingredients for life as we know it.\n\n" +
                "Detecting exoplanets is challenging because stars are far brighter than the planets orbiting them. Researchers often rely on indirect methods, such as observing tiny dips in a star’s brightness when a planet passes in front of it.\n\n" +
                "New telescopes and instruments are improving our ability to study exoplanet atmospheres. By analyzing the light passing through those atmospheres, scientists can search for molecules such as water vapor, methane, and oxygen.\n\n" +
                "Although no confirmed evidence of extraterrestrial life has been found, the growing number of potentially habitable worlds suggests that Earth may not be unique in the universe.\n\n",
            imageRes = R.drawable.science_3,
            category = Category.SCIENCE,
            summary = "Astronomers are identifying distant planets that may have the conditions needed to support life.",
            readTimeMinutes = 7,
            publishDate = "July 2026",
        ),

        Post(
            id = "12",
            title = "The Silk Road and Global Trade",
            summary = "Ancient trade routes connected distant regions and encouraged the exchange of goods, ideas, and cultures.",
            author = "Emma Wilson",
            content =
                "The Silk Road was not a single road but a vast network of trade routes linking Asia, the Middle East, Africa, and Europe. Merchants traveled these routes for centuries, carrying valuable goods across great distances.\n\n" +
                "Silk became one of the most famous products traded along these routes, giving the network its modern name. However, many other goods were exchanged, including spices, precious metals, textiles, and ceramics.\n\n" +
                "Trade along the Silk Road encouraged cultural exchange as well as economic activity. Travelers shared languages, technologies, religious beliefs, and artistic traditions with the communities they visited.\n\n" +
                "The movement of ideas had a lasting impact on societies throughout the connected regions. Scientific knowledge, inventions, and new methods of agriculture spread through these networks.\n\n" +
                "Although modern transportation has replaced the ancient routes, the Silk Road remains an important symbol of international cooperation and cultural exchange throughout history.\n\n",
            imageRes = R.drawable.history_3,
            category = Category.HISTORY,
            readTimeMinutes = 7,
            publishDate = "July 2026"
        ),

        Post(
            id = "13",
            title = "Hidden Islands of Southeast Asia",
            summary = "Beyond popular destinations, many lesser-known islands offer unique landscapes and local cultures.",
            author = "Emma Wilson",
            content =
                "Southeast Asia is home to thousands of islands, many of which remain relatively unknown to international travelers. These destinations often provide quieter experiences compared to more famous tourist locations.\n\n" +
                "Hidden islands can feature white-sand beaches, coral reefs, tropical forests, and small coastal communities. Their natural beauty attracts visitors seeking relaxation and outdoor adventure.\n\n" +
                "Many local communities depend on fishing, agriculture, and small-scale tourism. Visitors often have opportunities to learn about traditional lifestyles and regional customs that have been preserved for generations.\n\n" +
                "Responsible tourism plays an important role in protecting these environments. Sustainable travel practices help preserve ecosystems while supporting local economies.\n\n" +
                "Exploring lesser-known islands allows travelers to experience a different side of Southeast Asia, one that highlights both natural beauty and cultural diversity away from crowded destinations.\n\n",
            imageRes = R.drawable.travel_3,
            category = Category.TRAVEL,
            readTimeMinutes = 5,
            publishDate = "May 2026"
        ),

        Post(
            id = "14",
            title = "How Clothing Reflects Culture and Identity",
            summary = "Traditional clothing reveals history, environment, and cultural values of different societies.",
            author = "Emma Wilson",
            content =
                "Clothing is more than just a practical necessity. It often reflects cultural identity, traditions, and environmental adaptation.\n\n" +
                "Different regions developed unique clothing styles based on climate, available materials, and social customs.\n\n" +
                "In many cultures, traditional clothing is worn during ceremonies, festivals, and important life events, symbolizing heritage and pride.\n\n" +
                "Over time, global influences have blended traditional and modern fashion, creating new styles that reflect cultural exchange.\n\n" +
                "Studying clothing traditions helps us understand how people express identity and belonging through everyday choices.\n\n",
            imageRes = R.drawable.culture_3,
            category = Category.CULTURE,
            readTimeMinutes = 5,
            publishDate = "July 2026"
        ),

        Post(
            id = "15",
            title = "How Renewable Energy Grids Work",
            summary = "Modern energy systems integrate solar, wind, and other renewable sources into the power grid.",
            author = "Emma Wilson",
            content =
                "Renewable energy grids are systems that combine different energy sources such as solar, wind, and hydroelectric power.\n\n" +
                "Unlike traditional power plants, renewable sources depend on natural conditions, which makes energy production variable over time.\n\n" +
                "To manage this, energy grids use advanced systems to balance supply and demand in real time.\n\n" +
                "Energy storage technologies, such as large batteries, help store excess energy for later use when production is lower.\n\n" +
                "These systems are important for reducing reliance on fossil fuels and supporting more sustainable energy consumption.\n\n",
            imageRes = R.drawable.tech_3,
            category = Category.TECHNOLOGY,
            readTimeMinutes = 6,
            publishDate = "May 2026"
        ),

        Post(
            id = "16",
            title = "Why We Dream While Sleeping",
            author = "Michael Reed",
            content =
                "Dreams are one of the most familiar yet mysterious parts of human life. Nearly everyone experiences them, but scientists are still studying exactly why they occur.\n\n" +
                "Most vivid dreaming happens during rapid eye movement (REM) sleep, a stage in which brain activity becomes more similar to wakefulness. During REM sleep, the brain is highly active even though the body remains largely immobile.\n\n" +
                "One leading theory suggests that dreams help organize and strengthen memories. As the brain sorts through experiences from the day, it may replay and connect information in unusual ways, creating the stories and images we remember as dreams.\n\n" +
                "Dreams may also play a role in emotional processing. Studies show that people often dream about recent concerns, social interactions, and unresolved feelings, which could help the brain regulate emotions.\n\n" +
                "While many questions remain unanswered, researchers increasingly view dreaming not as meaningless randomness, but as a normal and important part of how the brain functions during sleep.\n\n",
            imageRes = R.drawable.science_4,
            category = Category.SCIENCE,
            summary = "Dreams may help the brain process memories, emotions, and experiences from daily life.",
            readTimeMinutes = 4,
            publishDate = "May 2026",
        ),

        Post(
            id = "17",
            title = "How Cities Changed During the Industrial Revolution",
            summary = "Industrialization transformed urban life, creating new opportunities while introducing major challenges.",
            author = "Michael Reed",
            content =
                "The Industrial Revolution brought significant changes to cities across Europe and other parts of the world. New factories attracted workers seeking employment and economic opportunity.\n\n" +
                "As populations grew, cities expanded rapidly. New housing, roads, and transportation systems were developed to accommodate increasing numbers of residents.\n\n" +
                "Industrial growth improved production and created jobs, but it also introduced challenges. Overcrowding, pollution, and poor working conditions became common concerns in many urban areas.\n\n" +
                "Governments and city planners gradually responded by improving sanitation systems, public transportation, and housing regulations. These changes helped shape the foundations of modern urban planning.\n\n" +
                "The effects of the Industrial Revolution can still be seen today. Many aspects of contemporary city life, from public transit networks to industrial districts, have roots in this transformative period.\n\n",
            imageRes = R.drawable.history_4,
            category = Category.HISTORY,
            readTimeMinutes = 6,
            publishDate = "May 2026"
        ),

        Post(
            id = "18",
            title = "Walking Through the Alps",
            summary = "The Alps offer some of the world's most scenic hiking routes, connecting mountains, villages, and history.",
            author = "Michael Reed",
            content =
                "The Alps stretch across several European countries and are among the most famous mountain ranges in the world. Their landscapes attract hikers, climbers, and nature enthusiasts throughout the year.\n\n" +
                "Walking trails in the Alps range from gentle valley paths to challenging mountain routes. Along the way, travelers encounter forests, lakes, alpine meadows, and breathtaking viewpoints.\n\n" +
                "Many routes connect historic villages where local traditions remain an important part of community life. Travelers often experience regional foods, architecture, and cultural customs during their journeys.\n\n" +
                "The changing seasons bring different experiences. Summer offers ideal hiking conditions, while winter transforms many alpine regions into popular destinations for snow sports.\n\n" +
                "A journey through the Alps combines physical activity, natural beauty, and cultural discovery, making it one of Europe's most rewarding travel experiences.\n\n",
            imageRes = R.drawable.travel_4,
            category = Category.TRAVEL,
            readTimeMinutes = 6,
            publishDate = "July 2026"
        ),

        Post(
            id = "19",
            title = "Traditions That Survived for Hundreds of Years",
            summary = "Some cultural traditions have remained alive for centuries, passed down through generations.",
            author = "Michael Reed",
            content =
                "Across the world, many traditions have survived for hundreds of years, continuing to shape modern societies.\n\n" +
                "These traditions often include festivals, rituals, crafts, and storytelling practices that are passed down within families and communities.\n\n" +
                "Even as societies modernize, many people continue to preserve these customs as a way of maintaining cultural identity.\n\n" +
                "Some traditions evolve over time, adapting to new environments while still keeping their original meaning and purpose.\n\n" +
                "These long-lasting practices remind us how culture connects generations and preserves shared human history.\n\n",
            imageRes = R.drawable.culture_4,
            category = Category.CULTURE,
            readTimeMinutes = 6,
            publishDate = "June 2026"
        ),

        Post(
            id = "20",
            title = "Cybersecurity in Everyday Life",
            summary = "Digital security plays an important role in protecting personal data and online activity.",
            author = "Michael Reed",
            content =
                "Cybersecurity refers to the protection of digital systems, networks, and personal data from unauthorized access or attacks.\n\n" +
                "As more daily activities move online, from banking to communication, cybersecurity has become increasingly important.\n\n" +
                "Common threats include phishing attacks, malware, and data breaches that target individuals and organizations.\n\n" +
                "Basic security practices such as strong passwords, two-factor authentication, and software updates can significantly reduce risks.\n\n" +
                "Understanding cybersecurity helps users protect their information and use digital systems more safely.\n\n",
            imageRes = R.drawable.tech_4,
            category = Category.TECHNOLOGY,
            readTimeMinutes = 5,
            publishDate = "June 2026"
        ),

        Post(
            id = "21",
            title = "How the Human Brain Learns New Skills",
            author = "Alex Carter",
            content =
                "Every time we learn a new skill, from playing an instrument to speaking a language, the brain physically changes. This ability to adapt is known as neuroplasticity.\n\n" +
                "Learning begins when neurons communicate through electrical and chemical signals. Repeated practice strengthens these connections, making the skill faster and more automatic over time. This is why consistent practice is more effective than cramming.\n\n" +
                "Different brain regions contribute to learning in different ways. The motor cortex helps coordinate movement, the hippocampus supports memory formation, and the prefrontal cortex helps with attention and planning.\n\n" +
                "Sleep is also essential for learning. During sleep, the brain consolidates new information, reinforcing neural pathways that were activated during practice.\n\n" +
                "Understanding how the brain learns can improve study habits. Short, focused sessions, regular repetition, and adequate rest are all supported by neuroscience research and can make learning more effective.\n\n",
            imageRes = R.drawable.science_5,
            category = Category.SCIENCE,
            summary = "Learning changes the brain by strengthening connections between neurons through practice and repetition.",
            readTimeMinutes = 5,
            publishDate = "June 2026",
        ),

        Post(
            id = "22",
            title = "The Story of Early Navigation",
            summary = "Long before modern technology, sailors relied on observation, experience, and simple tools to travel the seas.",
            author = "Alex Carter",
            content =
                "For thousands of years, people traveled across oceans and seas without GPS, satellites, or modern maps. Early navigators depended on observation and practical experience to find their way.\n\n" +
                "Sailors learned to study the stars, the position of the sun, ocean currents, and seasonal winds. These natural indicators provided valuable information about direction and location.\n\n" +
                "Over time, navigation tools such as the compass and astrolabe improved the accuracy of long-distance travel. These inventions allowed explorers and merchants to travel farther with greater confidence.\n\n" +
                "Successful navigation encouraged trade, exploration, and cultural exchange between distant regions. Maritime routes connected communities and helped spread goods and ideas around the world.\n\n" +
                "Although navigation technology has advanced dramatically, many of the principles developed by early sailors continue to influence modern methods of travel and exploration.\n\n",
            imageRes = R.drawable.history_5,
            category = Category.HISTORY,
            readTimeMinutes = 5,
            publishDate = "June 2026"
        ),

        Post(
            id = "23",
            title = "Why Japan's Rail Network Is Admired Worldwide",
            summary = "Efficiency, reliability, and innovation have made Japan's rail system a global model for transportation.",
            author = "Alex Carter",
            content =
                "Japan's railway system is widely recognized for its punctuality, cleanliness, and efficiency. Millions of passengers rely on trains every day to travel between cities and within urban areas.\n\n" +
                "One of the network's most famous features is the Shinkansen, often called the bullet train. These high-speed trains connect major regions while maintaining impressive safety and reliability records.\n\n" +
                "Station design and scheduling are carefully planned to reduce delays and improve passenger experience. Even small improvements in efficiency can have significant benefits when serving large populations.\n\n" +
                "The rail network also contributes to environmental sustainability by providing an alternative to private car travel. High passenger capacity helps reduce traffic congestion and energy consumption.\n\n" +
                "Many transportation experts study Japan's rail system as an example of how infrastructure, technology, and planning can work together to improve everyday life.\n\n",
            imageRes = R.drawable.travel_5,
            category = Category.TRAVEL,
            readTimeMinutes = 6,
            publishDate = "June 2026"
        ),

        Post(
            id = "24",
            title = "How Languages Shape the Way We Think",
            summary = "Language influences perception, thought patterns, and how people understand the world.",
            author = "Alex Carter",
            content =
                "Language is more than a communication tool. It also shapes how people think, perceive, and interpret the world around them.\n\n" +
                "Different languages structure ideas in different ways, influencing how speakers describe time, space, and relationships.\n\n" +
                "For example, some languages emphasize direction and spatial awareness, while others focus more on context and emotion.\n\n" +
                "Learning new languages can expand cognitive flexibility, allowing people to think in different patterns and perspectives.\n\n" +
                "Understanding the relationship between language and thought helps us appreciate the diversity of human communication.\n\n",
            imageRes = R.drawable.culture_5,
            category = Category.CULTURE,
            readTimeMinutes = 5,
            publishDate = "May 2026"
        ),

        Post(
            id = "25",
            title = "The Future of Urban Transportation",
            summary = "Cities are exploring new transportation systems to improve mobility, efficiency, and sustainability.",
            author = "Alex Carter",
            content =
                "Urban transportation is evolving as cities face growing populations and increased mobility demands.\n\n" +
                "Public transport systems are being improved with better connectivity, digital ticketing, and real-time tracking.\n\n" +
                "Electric vehicles and shared mobility services are becoming more common as alternatives to traditional cars.\n\n" +
                "Some cities are also exploring autonomous vehicles and smart traffic management systems to reduce congestion.\n\n" +
                "The future of transportation aims to create systems that are faster, cleaner, and more efficient for everyone.\n\n",
            imageRes = R.drawable.tech_5,
            category = Category.TECHNOLOGY,
            readTimeMinutes = 6,
            publishDate = "July 2026"
        )

    )

    override fun getPosts(): List<Post> {
        return posts
    }

    override fun getPost(id: String): Post? {
        return posts.find { it.id == id }
    }
}